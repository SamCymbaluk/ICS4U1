/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileReader;
 
/**
 *
 * @author fernandky728
 */
public class DiskInput {
    private BufferedReader input = null;
    private String s;
    public void open (String filename)
    {try
    { input = new BufferedReader (new FileReader (filename));
        }
    catch (Exception e)
    { IO.showMessage ("file not found!");
    System.exit(0);
    }
}
public void close ()
{try
{ input.close ();
}
catch (Exception e)
{ IO.showMessage ("file clsoing error!");
System.exit(0);
}
}
private void readLine ()
{ try
{ s = input.readLine();
}
catch (Exception e)
{ IO.showMessage ("incorrect input!");
        System.exit(0);
        }    
}
 
public int readInt ()
{ readLine ();
return (Integer.parseInt(s));
}
 public double readDouble ()
 { this.readLine();
 return (Double.parseDouble(s));
 }
 public char readChar (){
    this.readLine();
    if (s == null)
        return 0;
    else if (s.length () > 0)
        return s.charAt (0);
    else
        return '\n';
  }
 public String readString ()
 { readLine ();
 return s;
 }
}

