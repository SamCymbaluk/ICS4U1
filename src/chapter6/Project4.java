/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author cymbalusa405
 */
public class Project4 {
    public static void main(String[] args){
        System.out.println("n     SQRT(n)     n^2");
        for(int i = 1; i <= 15; i++){
            System.out.printf("%-5d %7f %4d \n",i, Math.sqrt(i), (int)Math.pow(i, 2));
            
        }
    }
}
