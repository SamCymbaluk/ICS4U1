/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author cymbalusa405
 */
import javax.swing.JOptionPane;

public class IO {
    
   public static void showMessage(String s){
       JOptionPane.showMessageDialog(null, s);
   }
   
   public static void showValue(String s, double d){
       JOptionPane.showMessageDialog(null, s+d);
   }
   
   public static void showValue(String s, float f){
       JOptionPane.showMessageDialog(null, s+f);
   }
   
   public static void showValue(String s, int i){
       JOptionPane.showMessageDialog(null, s+i);
   }
   
   public static void showValue(String s, char c){
       JOptionPane.showMessageDialog(null, s+c);
   }
   
   public static void showValue(String s1, String s2){
       showMessage(s1+s2);
   }
   
   public static double readDouble(String prompt){
       String s;
       s = JOptionPane.showInputDialog(prompt);
       return Double.parseDouble(s);
   }
   
   public static float readFloat(String prompt){
       String s;
       s = JOptionPane.showInputDialog(prompt);
       return Float.parseFloat(s);
   }
   
   public static int readInt(String prompt){
        String s;
       s = JOptionPane.showInputDialog(prompt);
       return Integer.parseInt(s);
   }
   
   public static char readChar(String prompt){
       String s;
       s = JOptionPane.showInputDialog(prompt);
       if(s == null) return 0;
       return s.charAt(0);
   }
   
   public static String readString(String prompt){
       return JOptionPane.showInputDialog(prompt);
   }
   
   public static String concatenate(String s1, String s2){
       return s1 + s2;
   }
   
   public static String concatenate(String s1, double d){
       return s1 + d;
   }
     
}

