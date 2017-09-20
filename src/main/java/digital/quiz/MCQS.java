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
public class MCQS implements Serializable{
    public String ques;
    public String opt1;
      public String opt2;
        public String opt3;
          public String opt4;
          public boolean ans;
    
  MCQS(String a,String b,String c,String d ,String e,boolean f) 
  {
  ques=a;
  opt1=b;
  opt2=c;
  opt3=d;
  opt4=e;
  ans=f;
  }
  
  
}
