package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Animal {

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

    // TODO: Need full constructor (Ryan)
    
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
    
    // TODO: Need getId method (Vinayak)
    
    // TODO: Need setId method (Melissa)
    
    // TODO: Need idValidator method - Only allow it to change if it's "0". Do not allow an id to be set if the id is already in the idList (Jory)

    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies(){
        return species;
    }
    
    // TODO: Need setSpecies method (Haley)
    public void setSpecies(String species){
        this.species = species;
    }
    
    // TODO: Need speciesValidator method - Only allow cat and dog. Only allow it to change if it's "Unknown". (William)
    
    public String getGender(){
        return gender;
    }
    
    public int getAge(){
        return age;
    }
    
    // TODO: Need setAge method (Chantal)
    
    // TODO: Need ageValidator method - only allow ages 0 to 100 (Chase)
    
    public boolean getFixed() {    
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
    
    // TODO: Need fixedValidator method - don't allow an animal that is already fixed to be fixed again (Whitney)
    
    public int getLegs(){
        return legs;
    }
    
    // TODO: Need setLegs method (Becky)
    
    // TODO: Need legsValidator method - only allow legs 0 to 4 (Fadwa)
    

    public BigDecimal getWeight() {
        return weight;
    }
    
    public void  setWeight(BigDecimal lb){
        this.weight = lb;
    }
    
    // TODO: Need weightValidator method - only allow weight 0.0 to 1000.0 (Jory)
    
    // TODO: Need getDateAdded method (William)
    
    public void setDateAdded(LocalDate ldt){
        dateAdded = ldt;
    }
    
    // TODO: Need dateValidator method - only allow dates up to a week in the past (Ryan)
    
    // TODO: Need getLastFeedingTime method (Haley)
    
    public LocalDateTime getLastFeedingTime(){
        return lastFeedingTime;
    }

    
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need feedingValidator method - only allow day/times up to two days in the past (Vinayak)
    
    // TODO: Need toString method - include name, species, gender, age, and weight (Melissa)
    
    // TODO: Need compareTo method - Compare by their species first, then by their name (Chantal)
    
}
