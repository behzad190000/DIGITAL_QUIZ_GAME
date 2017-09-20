/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.quiz;

import java.util.LinkedList;
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
public class question_generatorTest {
    
    public question_generatorTest() {
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
     * Test of typeOfQuestion method, of class question_generator.
     */
    @Test
    public void testTypeOfQuestion() {
        System.out.println("typeOfQuestion");
        String type = "Numeric";
        question_generator instance = new question_generator();
        int expResult = 0;
        int result = instance.typeOfQuestion(type);
        assertEquals(expResult, result);
        
        String type1 = "MCQs";
        question_generator instance1 = new question_generator();
        int expResult1 = 0;
        int result1 = instance.typeOfQuestion(type);
        assertEquals(expResult, result);
        
    }

}
