/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Assignment8 {

    public static void main(String[] args) {
        //assign a double variable to represent the value of e   
        double e = 0;

        //assign an integer variable to represent the  value of the denominator respective to each term in the series
        int d = 1;



        //entering a loop to calculate the several terms of the series up to 25 excluding the first term which is 2which is already known     
        while (d < 24) {
            d = d + 1;
           // assign a double variable to represent the entire calculated value of a term inclusive of the factorial  
            double n = 1 / (factorial(d));
// find the new value of e by adding the result of the calculated n vlaue to the old value 
            e = e + n;


        }

   
            e = e + 2;
            //adding the 2(the very first term of the series) to the value of e, the sum of all the terms 
        
//show value of e
        IO.showMessage("e= " + e);


    }

    public static double factorial(int num) {
        double numF = num--;
        for (; num > 0; num--) {
            numF *= num;
        }

        return numF;
    }
    
}
