/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.text.DecimalFormat;
import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Project4 {
    public static void main(String[] args){
        double height = IO.readDouble("Enter a building height");
        fallTable(height);
        
    }
    
    public static void fallTable(double height){
        String table = "";
        double alt = height;
        for(int t = 1;; t++){
            alt = height - ((32*t*t)/2);
                if(alt < 0){
                table = table + "Time: " + t + " RIP!";
                break;
            }
            table = table +"Time: " + t + " Height: " + decimalFormat(alt) + "\n";
        }
        
        IO.showMessage(table);
        
    }
    
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
}
