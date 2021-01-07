package TestCode;

import Controller.*;
import View.*;
import Model.*;
import java.util.ArrayList;
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

public class BookTest {
    Book b;
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
         b = new Book(0,"Harry Potter","Fiction","JK Rowling", true);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testGetTitle() {
        
        assertEquals("Harry Potter", b.getTitle());
        
    }

    /**
     * Test of getSubject method, of class Book.
     */
    @Test
    public void testGetSubject() {
      
        assertEquals("Fiction", b.getSubject());
        
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        
        assertEquals("JK Rowling", b.getAuthor());
        
    }

    
}
