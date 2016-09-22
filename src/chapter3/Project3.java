/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Project3 {
    
    public static void main(String[] args) {
        sumOfWholeNums(10);
        sumOfWholeNums(25);
        sumOfWholeNums(75);
        sumOfWholeNums(100);
    }    
    
    public static void sumOfWholeNums(int num) {
        int sum = 0;
        int inc = 1;
        while (inc <= num) {
            sum = sum + inc;
            inc = inc + 1;
        }
        IO.showMessage("SUM of integers from 1- " + num + ": " + sum);
        
    }    
}
