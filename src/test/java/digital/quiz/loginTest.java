/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.quiz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Generation
 */
public class loginTest {
    
    public loginTest() {
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
    public void testLoginuser() {
        System.out.println("loginuser");
        String mypass = "0000";
        String myname = "ins";
        String role = "Instructor";
        login instance = new login();
        int result=instance.loginuser(mypass, myname, role);
        int expectedResult=1;
        assertEquals(expectedResult,result);
        
        String mypass1 = "1234";
        String myname1 = "std";
        String role1 = "Student";
        login instance1 = new login();
        int result1=instance1.loginuser(mypass1, myname1, role1);
        int expectedResult1=0;
        assertEquals(expectedResult1,result1);
       
    }

    /**
     * Test of main method, of class login.
     */
   
}
