/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author marchauschildt
 */
public class AnimalTest {

    private Animal animal;
    
    @Before
    public void setUp() {
        animal = new Animal();
    }
    
    // TODO - Need testGetId method
    
    @org.junit.Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }
    
    // TODO - Need testGetSpecies method (Becky)
    
    // TODO - Need testGetGender method (Whitney)
    @Test
    public void testGetGender(){
        String expected = "Unknown";
        String result = animal.getGender();
        assertEquals(expected, result);
    }
    // TODO - Need testGetName method (Chase)
    
    // TODO - Need testGetAge method (Fadwa)
    
    // TODO - Need testGetFixed method
    
    // TODO - Need testGetId method
    
    // TODO - Need testGeLegs method
    
    // TODO - Need testGetWeight method
    
    // TODO - Need testGetDateAdded method
    
    // TODO - Need testGetLastFeedingTime method
    
}
