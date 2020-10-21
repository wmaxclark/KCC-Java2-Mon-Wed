package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Comparable<Animal>{

    private String id;
    private static List<String> idList = new ArrayList<>();
    private String name;
    private String species;
    private String gender;
    private int age;
    private boolean fixed;
    private int legs;
    private BigDecimal weight;
    private LocalDate dateAdded;
    private LocalDateTime lastFeedingTime;

    public Animal(String Id, String Name, String Gender, int Age, boolean Fixed,
            int Legs, BigDecimal Weight, LocalDate DateAdded, 
            LocalDateTime LastFeedingTime){
        setId(Id);
        setName(Name);
        setGender(Gender);
        setAge(Age);
        setFixed(Fixed);
        setLegs(Legs);
        setWeight(Weight);
        setDateAdded(DateAdded);
        setLastFeedingTime(LastFeedingTime);
    }
    
    public Animal() {
        id = "0";
        idList.add(id);
        name = "Unknown";
        species = "Unknown";
        gender = "Unknown";
        age = 0;
        fixed = false;
        legs = 4;
        weight = BigDecimal.valueOf(0);
        dateAdded = LocalDate.of(2020, 9, 1); // September 1, 2020
        lastFeedingTime = LocalDateTime.of(2020, 10, 1, 23, 59); // October 1, 2020 at 11:59pm
    }
    
    public String getId(){
        return id;
    }

    public void setId(String id) {
        idValidator(id);
        this.id = id;
    }
    
    // TODO: Need idValidator method - Only allow it to change if it's "0". Do not allow an id to be set if the id is already in the idList
    private void idValidator(String id) {
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies(){
        return species;
    }
    
    public void setSpecies(String species){
        speciesValidator(species);
        this.species = species;
    }
    
    // TODO: Need speciesValidator method - Only allow cat and dog. Only allow it to change if it's "Unknown".
    private void speciesValidator(String species) {
        
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender) {
        genderValidator(gender);
        this.gender = gender;
    }
    
    // TODO: Need genderValidator method - Only allow male and female. Only allow it to change if it's "Unknown".
    private void genderValidator(String gender) {
        
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int animalAge){
        ageValidator(age);
        this.age = animalAge;
    }

    private void ageValidator(int age) {
        if (age > 100 || age < 0) {
            throw new IllegalArgumentException("Invalid Animal age.");
        }
        
    }
    
    public boolean getFixed() {    
        return fixed;
    }

    public void setFixed(boolean fixed) {
        fixedValidator(fixed);
        this.fixed = fixed;
    }
    
    // TODO: Need fixedValidator method - don't allow an animal that is already fixed to be fixed again 
    private void fixedValidator(boolean fixed) {
        
    }
    
    public int getLegs(){
        return legs;
    }
    
    public void setLegs(int legs) {
        legsValidator(legs);
        this.legs = legs;
    }
    
    public void legsValidator(int legs)
    {
        if (legs>4 || legs<0)
        {
            throw new IllegalArgumentException("Legs are only allowed to be between 0 and 4");
        }
    }
    
    public BigDecimal getWeight() {
        return weight;
    }
    
    public void  setWeight(BigDecimal lb){
        weightValidator(weight);
        this.weight = lb;
    }
    
    // TODO: Need weightValidator method - only allow weight 0.0 to 1000.0 
    public void weightValidator(BigDecimal weight) {
        
    }

    public LocalDate getdateAdded(){
        return dateAdded;
    }

    public void setDateAdded(LocalDate ldt){
        dateValidator(dateAdded);
        dateAdded = ldt;
    }
    
    // TODO: Need dateValidator method - only allow dates up to a week in the past. Don't allow future dates.
    public void dateValidator(LocalDate dateAdded) {
        
    }
    
    public LocalDateTime getLastFeedingTime(){
        return lastFeedingTime;
    }

    public void setLastFeedingTime(LocalDateTime ldt) {
        feedingValidator(ldt);
        lastFeedingTime = ldt;
    }
    
    // TODO - Don't allow future dates.
    public void feedingValidator(LocalDateTime ldt){
        LocalDateTime twoDaysAgo = LocalDateTime.now().minusDays(2);
        if(ldt.isBefore(twoDaysAgo)){
            throw new IllegalArgumentException(ldt + " is more than"
                    + " two days in the past");
        } else if (LocalDateTime.now().isBefore(ldt)){
            throw new IllegalArgumentException(ldt + " is in the future.");
        }
    }

    @Override
    public String toString() {
        return "Animal {name: " + name + ", species: " + species + ", gender: "
                + gender + ", age: " + age + ", weight: " + weight + "}";
    }
    
    @Override
    public int compareTo(Animal other) {
        if (this.species.compareTo(other.species) != 0) {
            return this.species.compareTo(other.species);
        }
        else {
            return this.name.compareTo(other.name);
        }
    }
    
}
