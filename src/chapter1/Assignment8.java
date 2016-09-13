/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

import java.text.DecimalFormat;
import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment8 {
    static final double EARTH_RADIUS = 6356.912; //in km
    static final double MASS_PER_CM2 = 0.005522; //in kg
    
    public static void main(String[] args){
        double mass = (volumeOfSphere(EARTH_RADIUS) * Math.pow(1000, 3)) * MASS_PER_CM2;
        
        String massStr = decimalFormat(mass);

        IO.showMessage("The mass of the Earth is: " + massStr + " kg");
        
    }
    
    private static double volumeOfSphere(double radius){
        return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    }
    
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
     
}

