package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Animal {

    private String id;
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
    
    // TODO: Need default constructor with default values (Haley)
    
    // TODO: Need getId method (Vinayak)
    
    // TODO: Need setId method (Melissa)

    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies(){
        return species;
    }
    
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
    
    
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need feedingValidator method - only allow day/times up to two days in the past (Vinayak)
    
    // TODO: Need toString method (Melissa)
    
    // TODO: Need compareTo method - Compare by their species first, then by their name (Chantal)
    
}
