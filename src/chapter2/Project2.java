/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Project2 {
    
        public static void main(String[] args){
        double score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
        
        while (!(score < 0) ){          
            if(score > 65.0){
                IO.showMessage("Passing"); 
            }else{
                IO.showMessage("Failing");
            }
             score = IO.readDouble("Enter a score bewtween 0.0 and 100.0");
        } 
      
      
   
      
       
    }
}

