/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Project2 {
    public static void main(String[] args){
       
        double r;
        r = IO.readDouble("Enter radius");
        double volume = (4/3) * Math.PI * r*r*r;
       
        IO.showMessage("The volume of the sphere with radius " + r + " is " + volume);
    
    }//End of main
}