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
public class Project5 {
    
    public static void main(String[] args){
        int hoursWorked = IO.readInt("Enter the number of hours worked");
        double hourlyPay = IO.readDouble("Enter the hourly pay");
        
        double paycheck = hoursWorked * hourlyPay;
        
        IO.showMessage("The value of the paycheck should be $" + paycheck);
    }
}
