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
public class Assignment8 {

    public static void main(String[] args) {
        IO.showMessage("Welcome to Test STATS-inator! \nIn put test scores to \nfind a class average \naccompanied by the minimum \nand maximum test score ");
        double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
        double sum = score;

        int count = 1;
        double minimum = score;
        double maximum = score;


        while (score >= 0 ) {
            score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
          
            if(score < 0) break;
           
            sum = sum + score;
            if (minimum > score) {
                minimum = score;
            }
            if (maximum < score) {
                maximum = score;
            }



            count++;


        }
        double average = (sum) / (count);
        IO.showMessage("CLASS STATS CALCULATED: \nClass average: " + decimalFormat (average) + "\nMinimum Score: " + minimum + " \nMaximum Score: " + maximum);




    }
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
}
