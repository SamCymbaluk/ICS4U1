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
public class Project3 {
    public static void main(String[] args){
        double base, height, top;
        
        base = IO.readDouble("Enter the base:");
        height = IO.readDouble("Enter the height:");
        top = IO.readDouble("Enter the top:");
        
        double area = 0.5*(base + top)*height;
        
        IO.showMessage("The area of trapezoid is " + area);
    }
}