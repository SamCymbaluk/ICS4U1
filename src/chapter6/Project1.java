/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Project1 {
    
    public static void main(String[] args){
        double weight = IO.readDouble("Enter the weight of the package");
        boolean hazardous = IO.readString("Is this package hazardous (yes/no)").equalsIgnoreCase("yes");
        IO.showMessage("The cost to ship this package is $" + calcCost(weight, hazardous));
    }
    
    
    public static double calcCost(double weight, boolean hazardous){
        double cost = 0;
        
        //Surcharge
        if(hazardous){
            if(weight > 10){
                cost += 27;
            }else if(weight > 5){
                cost += 22; 
            }else{
               cost += 17; 
            }
        }
        
        while(weight > 0){
            if(weight > 10){
                cost += 7D*(weight - 10D);
                weight -= weight - 10D;
            }else if(weight > 5){
                cost += 6D*(weight-5D);
                weight -= weight- 5D;
            }else{
               cost += 5D*weight;
               weight = 0;
            }
        }
        
        return cost;
    }
}
