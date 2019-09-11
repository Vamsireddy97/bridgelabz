package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class Cos {
	
		static final double PI = 3.142; 
		
		static double cosXSertiesSum(double x, 
									int n) 
		{ 
			x = x * (PI / 180.0); 
		
			double res = 1; 
			double sign = 1, fact = 1, 
							pow = 1; 
			for (int i = 1; i < 5; i++) 
			{ 
				sign = sign * -1; 
				fact = fact * (2 * i - 1) * 
								(2 * i); 
				pow = pow * x * x; 
				res = res + sign * pow / fact; 
			} 
		
			return res; 
		} 
		
		public static void main(String[] args) 
		{ 	
			Scanner s=new Scanner(System.in);
			System.out.println("enter the angle=");
			float x=s.nextFloat();
			int n = 5; 
			System.out.println((float)( 
				cosXSertiesSum(x, 5) * 1000000) / 
									1000000.00); 
			s.close();
		}  
}
