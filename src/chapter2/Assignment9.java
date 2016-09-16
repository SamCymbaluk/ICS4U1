/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.text.DecimalFormat;
import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment9 {
    public static void main(String[] args){
        
        IO.showMessage("Class average calculator. Enter as many scores as you want.\n"
                + "You can press cancel to stop entering scores and proceed to average calculation.");
        double score = 0, sum = 0;
        int count = 0; //Stores # of scores
        
        while(true){
            try{
                score = IO.readDouble("Enter a score:");
            }catch(NullPointerException npe){ //User clicked cancel
                break; //Break loop and proceed to average calculation
            }catch(NumberFormatException e){  //The user inputted an empty string
                IO.showMessage("Please enter a valid score");
                continue;
            }
            
            sum += score; //Add score to sum
            count++;
        }
        
        if(count == 0){ //true if the first score entered is empty
            IO.showMessage("No valid scores inputted.");
            return;
        }
        
        IO.showMessage("The class average is " + decimalFormat((sum/count)) + "%");
    }
    
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }
}
