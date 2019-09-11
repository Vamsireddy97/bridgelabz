package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class PrimeFactor {
	
		public static void prime(int n) 
		{ 
			while (n % 2 == 0)
			{ 
				System.out.print(2 + " "); 
				n /= 2; 
			} 
			for (int i = 3; i <= Math.sqrt(n); i += 2)
			{ 
				while (n % i == 0) 
				{ 
					System.out.print(i + " "); 
					n /= i; 
				} 
			}  
			  
				System.out.print(n); 
		} 

		public static void main(String[] args) 
		{ 
			Scanner s=new Scanner(System.in);
			System.out.println("enter number=");
			int n=s.nextInt(); 
			prime(n); 
			s.close();
		} 
} 



