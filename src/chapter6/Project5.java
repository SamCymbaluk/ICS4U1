/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author cymbalusa405
 */
public class Project5 {
    public static void main(String[] args){
        System.out.println("n        2        3        4        5");
        for(double i = 1; i <= 15.1; i += 0.5){
            System.out.printf("%-3f %3f %3f %3f %3f \n",
                    i, 
                    Math.pow(i, 2),
                    Math.pow(i, 3),
                    Math.pow(i, 4),
                    Math.pow(i, 5));        
        }
    }    
}
