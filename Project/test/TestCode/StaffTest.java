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
public class StaffTest {
    Staff st;
    public StaffTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        st = new Staff(1,"Megan", "Glasgow" , 420, 2000.00);
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of getSalary method, of class Staff.
     */
    @Test
    public void testGetSalary() {
        
        assertEquals(2000.00, st.getSalary(), 0.0);
       
    }
    
}
