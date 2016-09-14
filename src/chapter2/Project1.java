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
public class Project1 {
    public static void main(String[] args){
        double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
 
        
        if(score > 65.0){
            IO.showMessage("Passing"); 
        }else{
            IO.showMessage("Failing");
        }
        
       
    }
}
