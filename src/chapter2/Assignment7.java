/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.text.DecimalFormat;
import util.IO;

/**
 *
 * @author fernandky728
 */

public class Assignment7 {
    
      public static void main(String[] args) {
      IO.showMessage("Welcome to SUM-IT-UP! Enter a number for every prompt!");
        double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
        double sum  = score;
                
        int count = 1;
        while (score >= 0 && sum <= 100  && count < 25)
        {
            score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
            if (score < 0) break;
            
            sum = sum + score;
            
            count++;
           
            
        }
     
        IO.showMessage("CONGRATS! YOUVE JUST SUMMED IT UP! HERES YOUR SUM: " + sum )  ; 
        
      
        
        
        
    }
     private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
}





