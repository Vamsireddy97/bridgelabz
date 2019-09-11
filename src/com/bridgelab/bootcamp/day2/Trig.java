package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class Trig {
	public static void main(String args[]) 
		{ 
			Scanner s=new Scanner(System.in);
			System.out.println("degrees=");
			double degrees=s.nextInt();
			double radians = Math.toRadians(degrees); 
			System.out.println("Radian"+radians);
			double sinvalue = Math.sin(radians);
			double cosvalue =Math.cos(radians);
			System.out.println("sin(" + degrees + ") = " + sinvalue);
			System.out.println("cos(" + degrees + ") = " + cosvalue);
			s.close();
		} 
	} 
			 

			
	
