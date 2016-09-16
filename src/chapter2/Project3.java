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
public class Project3 {

    public static void main(String[] args) {
        double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
        double sum = score;
        int count = 1;
        while (!(score < 0)) {
            if (score > 65.0) {
                IO.showMessage("Passing");
            } else {
                IO.showMessage("Failing");
            }
            score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
            sum = sum + score;
            count++;
        }
  double average = (sum)/(count);       
        IO.showMessage("Average of Class Test Scores " + decimalFormat (average) );
        
        
        
    }
     private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
}
