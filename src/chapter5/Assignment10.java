/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment10 {
    public static void main(String[] args){
        String paragraph = readParagraph();
        IO.showMessage("You made " + spellingMistakes(paragraph) + " spelling mistake(s).");
    }
    
    /**
     * Reads a paragraph using the IO.readString() method
     * @return The paragraph as a String
     */
    public static String readParagraph(){
        return IO.readString("Enter your paragraph");
    }
    
    /**
     * Determines the amount of spelling mistakes using the rule <i> i before e except after c </i>
     * @param paragraph The string to be spell checked.
     * @return an int representing the number of spelling mistakes. 
     */ 
    public static int spellingMistakes(String paragraph){
        int mistakes = 0;
        
        for(String word : paragraph.split(" ")){
            //Find all occurances of ei
            int index = 0;
            while(index < word.length()){
                System.out.println(index);
                int eiIndex = word.indexOf("ei", index);
                
                //No ei's in word
                if(eiIndex < 0) break;
                //No c/C before the occurance of 'ei'
                if(eiIndex == 0 || (word.charAt(eiIndex -1) != 'c' && word.charAt(eiIndex -1) != 'C')) mistakes++;
                index = eiIndex += 2;
            }
        }
        
        return mistakes;
    }
    
    
}
