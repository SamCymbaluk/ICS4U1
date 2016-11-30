/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7.assignment10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cymbalusa405
 */
public class Assignment10 {
   
   final static String INPUT_FILE = "src\\chapter7\\assignment10\\input.txt";
   final static String OUTPUT_FILE = "src\\chapter7\\assignment10\\output.txt";
   
   public Assignment10(){
       
   }
    
   public static void main(String[] args){
       
       List<String> words = new ArrayList<>();
       
       //Try-with-resources to prevent unclosed resources
       try(BufferedReader read = new BufferedReader(new FileReader(INPUT_FILE));){    
           String line;
           //Loop until the end of file is reached
           while((line = read.readLine()) != null){
            words.add(line);
           }
       }catch(IOException ex){
           ex.printStackTrace();
           return;
       }
       //Words array is now populated
       
       //Sort array
       Collections.sort(words);
       
       //Now we will output the sorted words into the output file
       try(BufferedWriter write = new BufferedWriter(new FileWriter(OUTPUT_FILE));){
           
           for(String word : words){
               //Write each word to file on their own line
               write.write(word + "\n");
           }
       }catch(IOException ex){
           ex.printStackTrace();
           return;
       }
       
   }
}
