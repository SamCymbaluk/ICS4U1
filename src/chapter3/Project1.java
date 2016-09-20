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
public class Project1 {
    public static void main(String[] args){
        String input = IO.readString("Enter a list of angles seperated by commas (,):");
        String[] list = input.split(",");
        
        String displayStr = "angle sine cosine";
        for(String s : list){
            s = s + " " + decimalFormat(Math.sin(Double.parseDouble(s))) + " " + decimalFormat(Math.cos(Double.parseDouble(s)));
            displayStr = displayStr + "\n" + s;
        }
        
        IO.showMessage(displayStr);
        
        
    }
    
        private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".###");
        return df2.format(number);
        
    }
}
