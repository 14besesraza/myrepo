/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la3b;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author test1
 */
public class OrderrTest {
    
    public OrderrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of set_priority method, of class Orderr.
     */
    @Test
    public void testSet_priority() {
        System.out.println("set_priority");
        priority_Q p1 = new priority_Q();
        Tables T= new Tables("XL");
        Orderr instance = new Orderr("Lunch",5,12,"XL",p1,T);
        instance.set_priority();
        
        
    }

    /**
     * Test of get_priority method, of class Orderr.
     */
    @Test
    public void testGet_priority() {
        System.out.println("get_priority");
        Orderr instance = null;
        int expResult = 0;
        int result = instance.get_priority();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
