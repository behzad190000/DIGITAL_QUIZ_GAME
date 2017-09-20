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
public class attemptQuizTest {
    
    public attemptQuizTest() {
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
     * Test of questionTypeOptions method, of class attemptQuiz.
     */
    @Test
    public void testQuestionTypeOptions() {
        System.out.println("questionTypeOptions");
        String type = "Numeric";
        attemptQuiz instance = new attemptQuiz();
        int expResult = 0;
        int result = instance.questionTypeOptions(type);
        assertEquals(expResult, result);
        
        String type1 = "MCQs";
        attemptQuiz instance1 = new attemptQuiz();
        int expResult1 = 1;
        int result1 = instance.questionTypeOptions(type1);
        assertEquals(expResult, result);
      
    }

   
    
}
