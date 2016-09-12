/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileOutputStream;
import java.io.PrintWriter;
 
/**
 *
 * @author krysada860
 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
public class DiskOutput
{
private PrintWriter output = null ;
private String s;
public void open (String filename)
{ try
{ output = new PrintWriter (new FileOutputStream(filename));
}catch (Exception e)
{ IO.showMessage ("file cannot be created!");
System.exit(0) ;
 }
}
public void close ()
{ try
{ output.close () ;
}catch (Exception e)
{ IO.showMessage ("file closing error!") ;
}
System.exit (0);
}
 
public void writeString (String s){
    output.println (s) ;
}
public void writeInt (int i)
{ output.println (""+i) ;
}
public void writeDouble (double d)
{ output.println (""+d) ;
}
public void writeChar (char c)
{ output.println ("+c) ;");
   }
}