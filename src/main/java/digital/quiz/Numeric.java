/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital.quiz;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JTextField;
import java.util.*;
/**
 *
 * @author Generation
 */
public class Numeric implements Serializable{
    public String ques;
    public String ans;
    static int a=100;
    
    Numeric(String x,String y)
    {
    ques=x;
    ans=y;
    }
    
    
}
