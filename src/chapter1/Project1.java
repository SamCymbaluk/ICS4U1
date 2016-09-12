/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

import util.IO;
import java.text.DecimalFormat;

/**
 *
 * @author cymbalusa405
 */
public class Project1 {
    
    public static void main(String[] args){
             
        double length = IO.readDouble("Enter length:");
        double width = IO.readDouble("Enter width:");
        
        double area = length * width;
        
        IO.showMessage("The area is: " + decimalFormat(area));

        
    }//End of main
    
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }
    
    
    
    
    
    
    
    
    
}
