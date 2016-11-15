/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import util.IO;

/**
 *
 * @author fernandky728
 */
public class Assignment9 {

    public static void main(String[] args) {

        String paragraph = IO.readString("Submit paragraph for correction");
        String[] sentences;
        paragraph = paragraph.substring(0, paragraph.length() - 1);
        sentences = paragraph.split("\\. ");
        // Array of sentences created
        int sentenceCount = sentences.length;
        System.out.println(sentenceCount);
        // Couting sentences in the arrray 
        int count = 0;
        char first;
        while (count < sentenceCount) {
            //adding one to the count in order to determine the number of sentences and 

            first = sentences[count].charAt(0);
            //capitalzing first letter at (0), and adding spcace
            sentences[count] = Character.toUpperCase(first) + sentences[count].substring(1) + ". ";

            count++;



        }

        count = 0;
        while (count < sentenceCount) {
            //adding one to the count

            System.out.print(sentences[count]);

            count++;
        }
        System.out.println();
    }
}