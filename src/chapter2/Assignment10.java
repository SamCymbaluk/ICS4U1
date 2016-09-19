/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment10 {
    public static void main(String[] args){
       try{
           double d = IO.readDouble("Enter a number to square root");
           IO.showMessage("sqrt(" + d + ") = " + sqrt(d));
       }catch(NullPointerException npe){
           return;
       }catch(Exception ex){
           IO.showMessage("Invalid number.");
           main(null); 
       }
    }
    
    
    public static double sqrt(double x){
        if (x < 0) //Can't take sqrt of x < 0
            return Double.NaN;
        if (x == 0 || ! (x < Double.POSITIVE_INFINITY)) //sqrt of 0 = 0 sqrt of infinity is infinity
            return x;
        
        
        double lastGuess;
        double guess = 1.0;
        do{
            lastGuess = guess;
            guess = 0.5*(lastGuess+(x/lastGuess)); //Formula supplied in question
        }while(Math.abs(lastGuess - guess) >= 0.0005); //Presision needed to terminate
        
        return guess;
        

    }
}
