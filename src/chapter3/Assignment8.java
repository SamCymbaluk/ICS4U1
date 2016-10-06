/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Assignment8 {

    public static double studentAve(double grade1, double grade2, double grade3, double grade4, double grade5) {
        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        return average;

    }

    public static void main(String[] args) {
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;
        double grade5 = 0;

        double minimum = 0;
        double maximum = 0;

        double sum = 0;


        for (int i = 1; i <= 2; i++) {
            IO.showMessage("Enter 5 grades");




            grade1 = IO.readDouble("Enter first grade");
            grade2 = IO.readDouble("Enter second grade");
            grade3 = IO.readDouble("Enter third grade");
            grade4 = IO.readDouble("Enter fourth grade");
            grade5 = IO.readDouble("Enter fifth grade");

            double studentAve = studentAve(grade1, grade2, grade3, grade4, grade5);



            IO.showMessage("Average of student :" + studentAve);


            sum = sum + studentAve;

            if (i == 1) {


                if (minimum < studentAve) {
                    minimum = studentAve;
                }
                if (maximum < studentAve) {
                    maximum = studentAve;

                }
            }

            if (maximum < studentAve) {
                maximum = studentAve;
            }

            
        }
        
        
           double classAverage = (sum / 2);
            IO.showMessage("cumulative class average: " + classAverage);
            IO.showMessage("Class Minimum: " + minimum);
            IO.showMessage("Class Maximum: " + maximum);
    }
    }
