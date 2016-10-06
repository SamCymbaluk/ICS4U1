/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import util.IO;

/**
 *
 * @author cymbalusa405
 */
public class Assignment10 {
    public static void main(String[] args){
        Location loc = new Location(IO.readString("Enter the start location int the form x,y"));
        
        double dist = 0, dir = 0;
        while(true){
            dist = IO.readDouble("Enter distance travelled");
            if(dist < 0) break; //Check for sentinal case
            dir = IO.readDouble("Enter direction travelled");
            
            //Convert to rad
            dir = dir * Math.PI / 180;
            
            //Calculate the x and y components
            Vector2D deltaLoc = new Vector2D(Math.cos(dir),Math.sin(dir));
            
            //Normalize then multiply by the travelled dist
            deltaLoc = deltaLoc.normalize().multiply(dist);
            
            //Add the deltaLoc to current loc
            loc.setX(loc.getX() + deltaLoc.getX());
            loc.setY(loc.getY() + deltaLoc.getY());
        }
        
        IO.showMessage("Your final location is (" + loc.getX() +","+ loc.getY() + ")");
    }
}

class Location{
    private double x;
    private double y;
    
    public Location(String locStr){
        x = Double.parseDouble(locStr.split(",")[0]);
        y = Double.parseDouble(locStr.split(",")[1]);
    }
    public Location(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){return x;}
    public void setX(double x){this.x = x;}
    
    public double getY(){return y;}
    public void setY(double y){this.y = y;}
    
}

final class Vector2D {

   private final double dX;
   private final double dY;

      public Vector2D() {
      this.dX = 0;
      this.dY = 0;
   }
   public Vector2D( double dX, double dY ) {
      this.dX = dX;
      this.dY = dY;
   }
   public Vector2D multiply( double scaleFactor ) {
       Vector2D v2 = new Vector2D( this.dX*scaleFactor, this.dY*scaleFactor );
       return v2;
   }
   
   //Normalize - make the length of the vector (1)
   public Vector2D normalize() {
      Vector2D v2;

      double length = Math.sqrt( this.dX*this.dX + this.dY*this.dY );
      if (length != 0) {
          v2 = new Vector2D(this.dX/length, this.dY/length);
      }else{
          v2 = new Vector2D();
      }
      return v2;
   }  
   
   public double getX(){return dX;}
    
   public double getY(){return dY;}
}
