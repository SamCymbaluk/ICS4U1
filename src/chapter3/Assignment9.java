/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.text.DecimalFormat;
import util.IO;

public class Assignment9 {
    
    static double principal,rate;
    static int period;
        
    public static void main(String[] args){
        IO.showMessage("Enter the first loan");
        
        readLoan();
        double cost1 = loanCost(principal,period,rate);
        
        IO.showMessage("Enter the second loan");
        readLoan();
        double cost2 = loanCost(principal,period,rate);
         
        IO.showMessage("The difference between the two loans is " + decimalFormat(cost2-cost1));
        
        
    }
    
    /**
     * Takes user input an assigns it to static class variables
     */
    public static void readLoan(){
        principal = IO.readDouble("Enter the principle");
        period = IO.readInt("Enter the period"); 
        rate = IO.readDouble("Enter the rate");
    }
    public static double loanCost(double principal, int period, double rate){
        double payment = (rate/(1-Math.pow(1+rate,-period))) * principal; //Compound interest formula
        
        return principal - period * payment;
    }
    
    private static String decimalFormat(double number){
        DecimalFormat df2 = new DecimalFormat(".##");
        return df2.format(number);
    }  
}
