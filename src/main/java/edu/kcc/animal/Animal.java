/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author k0519415
 */
public abstract class Animal {

    private String name;
    private String species;
    private String gender;
    private int age;
    private boolean fixed;
    private int legs;
    private BigDecimal weight;
    private LocalDate dateAdded;
    private LocalDateTime lastFeedingTime;


    

    // TODO: Need full constructor
    
    // TODO: Need default constructor

    // TODO: Need getName method - Fadwa
    public String getName(){
        return name;
    }
    
    // TODO: Need setName method - Chase
    public void setName(String name) {
        this.name = name;
    }
    // TODO: Need getSpecies method - Becky

    public String getSpecies(){
        return species;
    }
    // TODO: Need getGender method - Whitney
    public String getGender(){
        return gender;
    }
    // TODO: Need getAge method - William
    
    // TODO: Need setAge method - Joseph
    
    // TODO: Need getFixed method - Vinayak
    public boolean getFixed() {    
        return fixed;
    }

    // TODO: Need setFixed method - Chantal
    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
    
    // TODO: Need getLegs method - Haley
    public int getLegs(){
        return legs;
    }
    
    // TODO: Need setLegs method - Bonny
    
    // TODO: Need getWeight method - Melissa
    public BigDecimal getWeight() {
        return weight;
    }
    
    // TODO: Need setWeight method - Ryan
    public void  setWeight(BigDecimal lb){
        this.weight = lb;
    }
    // TODO: Need getDateAdded method - Nick
    
    // TODO: Need setDateAdded method - Jory
    public void setDateAdded(LocalDate ldt){
        dateAdded = ldt;
    }
    
    // TODO: Need getLastFeedingTime method - Andrea
    
    // TODO: Need setLastFeedingTime method
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need toString method
    
    // TODO: Need compareTo method
    
}
