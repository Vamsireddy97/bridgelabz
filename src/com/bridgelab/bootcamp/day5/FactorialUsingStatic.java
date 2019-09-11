package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class FactorialUsingStatic {
	
		 static long factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int fact=1;  
		  Scanner s=new Scanner(System.in);
	 	  System.out.println("enter number=");
		  int n=s.nextInt();
		  fact = (int) factorial(n);   
		  System.out.println("Factorial of "+n+" is: "+fact);  
		  s.close();
		 }  
		  

}
