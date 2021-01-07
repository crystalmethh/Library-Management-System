package TestCode;

import Controller.*;
import View.*;
import Model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PersonTest {
    Person p;
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Person(3,"Babu Rao", "Dhaka" , 666) {};
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        
        assertEquals("Babu Rao", p.getName());
        
    }

    /**
     * Test of getAddress method, of class Person.
     */
    @Test
    public void testGetAddress() {
        
        assertEquals("Dhaka", p.getAddress());
        
    }

    /**
     * Test of getPhoneNumber method, of class Person.
     */
    @Test
    public void testGetPhoneNumber() {
       
        assertEquals(666, p.getPhoneNumber());
        
    }

    /**
     * Test of getID method, of class Person.
     */
    @Test
    public void testGetID() {
        
        assertEquals(3, p.getID());
        
    }    
}
