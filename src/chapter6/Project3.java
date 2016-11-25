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
public class Project3 {
    
    public static void main(String[] args){
        int a,b,c,d,f;  
        a=b=c=d=f=0;
        
        char grade;
        String output;
        grade = IO.readChar("Enter grades as capital letters (ending with the litter X): ");
        System.out.println(grade);
        while(grade != 'X'){
            switch(grade){
                case 'A': 
                    a++;
                    break;
                case 'B': 
                    b++;
                    break;
                case 'C': 
                    c++;
                    break;
                case 'D': 
                    d++;
                    break;                    
                case 'F': 
                    f++;
                    break;
                default:
                    IO.showMessage("Illegal grade, go directly to jail.");
            }
            grade = IO.readChar("Enter next grade");
        }
        
        System.out.println("Summary of grades:");
        System.out.println("Number of A grades: " + a);
        System.out.println("Number of B grades: " + b);
        System.out.println("Number of C grades: " + c);
        System.out.println("Number of D grades: " + d);
        System.out.println("Number of F grades: " + f);
    }
}
