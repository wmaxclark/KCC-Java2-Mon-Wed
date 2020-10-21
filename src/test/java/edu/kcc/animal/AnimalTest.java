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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author k0519415
 */
public class AnimalTest {
    
    private Animal animal;
    
    public AnimalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        animal = new Animal();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Animal.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Animal.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Animal instance = new Animal();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }

    /**
     * Test of setName method, of class Animal.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Animal instance = new Animal();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecies method, of class Animal.
     */
    @Test
    public void testGetSpecies() {
        System.out.println("getSpecies");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecies method, of class Animal.
     */
    @Test
    public void testSetSpecies() {
        System.out.println("setSpecies");
        String species = "";
        Animal instance = new Animal();
        instance.setSpecies(species);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Animal.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Animal.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Animal instance = new Animal();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAge(){
        setUp();
        int expected=0;
        int result=animal.getAge();
        assertEquals(expected,result);
    }

    /**
     * Test of setAge method, of class Animal.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int animalAge = 0;
        Animal instance = new Animal();
        instance.setAge(animalAge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFixed(){
        setUp();
        boolean expected = false;
        boolean actual = animal.getFixed();
        assertEquals(expected, actual);
    }

    /**
     * Test of setFixed method, of class Animal.
     */
    @Test
    public void testSetFixed() {
        System.out.println("setFixed");
        boolean fixed = false;
        Animal instance = new Animal();
        instance.setFixed(fixed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetLegs(){
        setUp();
        int expected = 4;
        int actual = animal.getLegs();
        assertEquals(expected, actual);
    }

    /**
     * Test of setLegs method, of class Animal.
     */
    @Test
    public void testSetLegs() {
        System.out.println("setLegs");
        int legs = 0;
        Animal instance = new Animal();
        instance.setLegs(legs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of legsValidator method, of class Animal.
     */
    @Test
    public void testLegsValidator() {
        System.out.println("legsValidator");
        int legs = 0;
        Animal instance = new Animal();
        instance.legsValidator(legs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetWeight() {
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = animal.getWeight();
        assertEquals(expResult,result);
    }

    /**
     * Test of setWeight method, of class Animal.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        BigDecimal lb = null;
        Animal instance = new Animal();
        instance.setWeight(lb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of weightValidator method, of class Animal.
     */
    @Test
    public void testWeightValidator() {
        System.out.println("weightValidator");
        BigDecimal weight = null;
        Animal instance = new Animal();
        instance.weightValidator(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdateAdded method, of class Animal.
     */
    @Test
    public void testGetdateAdded() {
        System.out.println("getdateAdded");
        Animal instance = new Animal();
        LocalDate expResult = null;
        LocalDate result = instance.getdateAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Animal.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        LocalDate ldt = null;
        Animal instance = new Animal();
        instance.setDateAdded(ldt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateValidator method, of class Animal.
     */
    @Test
    public void testDateValidator() {
        System.out.println("dateValidator");
        LocalDate dateAdded = null;
        Animal instance = new Animal();
        instance.dateValidator(dateAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastFeedingTime method, of class Animal.
     */
    @Test
    public void testGetLastFeedingTime() {
        System.out.println("getLastFeedingTime");
        Animal instance = new Animal();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getLastFeedingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastFeedingTime method, of class Animal.
     */
    @Test
    public void testSetLastFeedingTime() {
        System.out.println("setLastFeedingTime");
        LocalDateTime ldt = null;
        Animal instance = new Animal();
        instance.setLastFeedingTime(ldt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedingValidator method, of class Animal.
     */
    @Test
    public void testFeedingValidator() {
        System.out.println("feedingValidator");
        LocalDateTime ldt = null;
        Animal instance = new Animal();
        instance.feedingValidator(ldt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Animal.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Animal.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Animal other = null;
        Animal instance = new Animal();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
