/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment9 {
    public static void main(String[] args){
        //Take user input then output cos of inputted angle
        double angle = IO.readDouble("Enter an angle in rad");
        IO.showMessage("cos(" +  angle + ") = " + cos(angle, 25));
    }
    
    /**
     * This method calculates the cos of an angle using the
     * converging series cos(x) = 1 - x^2/2! + x^4/4! - x^6/6! + ...
     * @param angle The angle in radians.
     * @param terms The number of terms to use in the converging series.
     * @return The cos of the given angle.
     */
    public static double cos(double angle, int terms){
        //Since cos is periodic we only care about the value of angle within one period
        angle = angle % (Math.PI * 2); 
        double cos = 1;
        for(int i = 1; i <= terms; i++){
            //Alternate between + and -
            if(i % 2 != 0){
                cos -= (Math.pow(angle, 2 * i)/factorial(i*2));
            }else{
                cos += (Math.pow(angle, 2 * i)/factorial(i*2));
            }  
        }
        
        return cos;
    }
    
    /**
     * Calculates n! (factorial) where factorial is defined as
     * n! = n * (n-1) * (n-2) ... * 1;
     * @param num The number to operate on
     * @return Factorial of given number
     */
    public static double factorial(int num){
        double numF = num--;
        for(;num > 0; num--){
            numF *= num;
        }
        
        return numF;

    }
}
