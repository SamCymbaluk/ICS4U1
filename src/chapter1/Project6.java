/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Project6 {
     public static void main  (String[] args ) {
         double farenheit = IO.readDouble("Enter Temperature in Farenheit");
         double celsius =  (farenheit - 32.0) * 5/9 ;
                 IO.showMessage("Converted temp in Celsius " +  celsius );
     }
    
}

