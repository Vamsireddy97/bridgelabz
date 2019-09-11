package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class HarmonicNumber {
	static float nthHarmonic(int n)
	{
		float harmonic=1;
		System.out.print("Hn=");
		for(int i=1;i<=n;i++) 
		{
		    
			 harmonic =(float)1/i;
			 System.out.print(harmonic+"+");
		}
		
		return harmonic;   	

	}
	public static void main (String[] args) { 
         Scanner s=new Scanner(System.in);
         System.out.println("enter n value=");
         int n=s.nextInt();
        
         System.out.println(nthHarmonic(n)); 
   s.close();
 } 
} 


