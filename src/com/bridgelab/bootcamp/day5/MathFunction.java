package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class MathFunction {
	static float nthHarmonic(int n)
	{
		float harmonic=1;
		System.out.print("Hn=");
		for(int i=1;i<=n;i++) 
		{
		    
			 harmonic =(float)1/i;
			//System.out.print(harmonic+"+");
		}
		
		return harmonic;   	

	}
	 public static double sin()
	   {
		   double a=30;
		   double sine=Math.toRadians(a);
		   System.out.println("sin value="+Math.sin(sine));
		   return sine;
	   }
	 static double cos()
		{
			double a=0;
			double cos=Math.toRadians(a);
			System.out.println("cos value="+Math.cos(cos));
			return cos;
		}
	 
	 static int binaryNumber(int n)
		{
			int j=1,d,binary=0;
			while(n!=0)
			{
				d=n%2;
				binary=binary+(d*j);
				n=n/2;
				j=j*10;
			}
			System.out.println("binary number is="+binary);
			return binary;
		}
	
	public static void main (String[] args) { 
         Scanner s=new Scanner(System.in);
         System.out.println("enter n value=");
         int n=s.nextInt();
         System.out.println(nthHarmonic(n));
         
         sin();
         
         cos();
         
         System.out.println("enter the number");
 		n=s.nextInt();
 		binaryNumber(n);
         
         
   s.close();
 } 

}
