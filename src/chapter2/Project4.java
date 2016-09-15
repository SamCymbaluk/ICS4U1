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
public class Project4 {
    public static void main(String[] args){
         double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
         
         if(score >= 90){
             IO.showMessage("Grade: A+");
         }else if(score >= 85){
             IO.showMessage("Grade: A");
         }else if(score >= 80){
             IO.showMessage("Grade: A-");
         }else if(score >=  65){
             IO.showMessage("Grade: B");
         }else if(score >= 50){
             IO.showMessage("Grade: C");
         }else{
             IO.showMessage("Grade: D");
         }
    }
}
