import java.io.*;
import java.util.*;
import java.util.Scanner;

class A{
  	public static void main (String[] args)throws Exception{
  
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no. of inches");
        Float inches=scan.nextFloat();

	float cm = inches * 2.54f;
 	System.out.println(inches + " inches is " + cm + " centimeter(s).");
 }
}