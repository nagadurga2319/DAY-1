
import java.util.*;
public class Area {
      public static void main(String[ ] args){
          double a;
    double r;
    final double pi = Math.PI;

    r = 1.0;
    a = pi * r * r;
    display(r,a);

    r = 1.5;
    a = pi * r * r;
    display(r,a);

    r = 2.0;
     a = pi * r * r;
    display(r,a);
      }//end main
      //-------------------------------------------//
      static void display(double r, double a){
           System.out.println("For radius = " + r +
                                ", area = " + a);
      }//end print
}//end Area class
