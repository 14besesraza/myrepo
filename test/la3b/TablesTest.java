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
public class TablesTest {
    
    public TablesTest() {
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

    @Test
    public void test_Table_type() {
        String t1="XL";
      Tables T= new Tables(t1);
      
      String Result="Extra Large";
      int seats=12;
      assertEquals(Result,T.tab);
      
    }
     public void test_seats() {
        String t1="XL";
      Tables T= new Tables(t1);
      
      
      int seats=12;
      assertEquals(seats,T.seats);
      
    }
    public void test_availability(){
        String t1="XL";
      Tables T= new Tables(t1);
      
      
      int available=1;
      assertEquals(available,T.available);
    }
}
