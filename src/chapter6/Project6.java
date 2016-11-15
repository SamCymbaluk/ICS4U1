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
public class Project6 {
    public static void main(String[] args){
        int amount = IO.readInt("How many numbers do you want to input?");
        String output = "";
        for(int i = 0; i < amount; i++){
            output = output + factorial(IO.readInt("Enter number ("+(i+1)+")")) + "\n";
        }
        
        IO.showMessage(output);
    }
    
    public static long factorial(int num){
        long numF = num--;
        for(;num > 0; num--){
            numF *= num;
        }
        
        return numF;
    }
}
