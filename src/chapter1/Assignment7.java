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
public class Assignment7 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double earth_radius = 6356.912;
        double speed_sound = 0.33136 ;
        double percentage = IO.readDouble("Enter percentage of earth's circumference");
            double distance = earth_radius*percentage;
        double time = distance/speed_sound;
    IO.showMessage("Time required for sound to travel given percentage of Earth's radius " + time +  " seconds" );
    }
}



