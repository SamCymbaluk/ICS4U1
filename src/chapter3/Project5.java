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
public class Project5 {
    public static void main(String[] args){
        IO.showMessage(""+convertTemp(60.5));
        IO.showMessage(""+convertTemp(32.0));
        IO.showMessage(""+convertTemp(0.0));
        IO.showMessage(""+convertTemp(-5.0));
    }
    
    public static double convertTemp(double temp){
        return (temp - 32)*(5.0/9.0);
    }
}
