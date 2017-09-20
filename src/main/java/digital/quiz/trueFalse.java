/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.quiz;

import java.io.Serializable;

/**
 *
 * @author Generation
 */
public class trueFalse implements Serializable{
    public String ques;
   private boolean ans;
   
   trueFalse(String x,boolean y)
   {
   ques=x;
   ans=y;
   }
   
   
}
