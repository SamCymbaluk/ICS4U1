/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Project2 {

    public static void main(String[] args) {
        // Create introductory/welcome prompt for program  
        IO.showMessage("Welcome to GOODHANDS INSURANCE!"
                + " Utilize this program \n to determine an estimate of your auto-insurance rate! \n Complete our easy questionnaire to be matched with a unique \n and  incredibly awesome deal!  ");
        String gender;
        gender = IO.readString("What is your gender? Valid options: m or f");
        double age;
        age = IO.readDouble("Please enter your age");
        double value;
        value = IO.readDouble("Please enter the current value of your car");
        double tickets;
        tickets = IO.readDouble("Please enter the number of tickets ");
        // the 4 factors that will directly affect the 
        //insurance rate are defined and their values are acquired from the user


        double rate;
        rate = (0.06) * value;
        IO.showMessage("Your base rate is:" + rate);


        String m;
        if (gender.equals("m")) {
            if (age < 25) {
                rate = rate * (1.17);

            }
        }
        if (gender.equals("f")) {
            if (age < 19) {
                rate = rate * (1.04);

            }

     
        }

       if (tickets > 3) {

                rate = rate + 100;

            }
       
        IO.showMessage("Woohoo! You're on your way to getting yourself a sweet deal!");
        IO.showMessage("Your approximate insurance rate calculated based on your give info is: \n " + rate);

    }
}
