/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Project2 {
    public static void main(String[] args){
        
        double angleDeg = IO.readDouble("Enter an angle in degress");;
        do{
            double angleRad = angleDeg * Math.PI / 180;   
            IO.showMessage(angleDeg + " in radians is " + angleRad);
            angleDeg = IO.readDouble("Enter an angle in degress");   
        }while(angleDeg >= 0);
    }
}
