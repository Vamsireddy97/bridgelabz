package com.bridgelabz.lib.day6;

import java.util.Arrays;
import java.util.Scanner;

public class MathFunction {
	
	//factorial
	 static long factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 } 
	 
	 //Futurevalue
	 static double  Futurevalue(int c,int r,int t)
		{
			double Futurevalue=c*Math.pow(1+r, t);
			System.out.println("Future value="+Futurevalue);	
			return Futurevalue;
		}
	 
	 //isPrime
	 public static boolean isPrime(int n) {
		   if (n <= 1) {
		       return false;
		   }
		   for (int i = 2; i < Math.sqrt(n); i++) {
		       if (n % i == 0) {
		           return false;
		       }
		   }
		   return true;
		}
	 
	 
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
		
		 
		 static boolean checkcollinearUsingSlope(double x1,double x2,double x3,double y1,double y2,double y3)
			{
				double ab=(y2-y1)/(x2-x1);
				double bc=(y2-y1)/(x2-x1);
				double ac=(y2-y1)/(x2-x1);
				if(ab==bc && bc==ac &&ac==ab) 
				{
					System.out.println("this is collinear");
				}
				else
				{
					System.out.println("this is not collinear");
				}
				return true;
			}
			static boolean checkcollinearUsingArea(double x1,double x2,double x3,double y1,double y2,double y3)
			{
				double area_of_triangle=0.5*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
				System.out.println("area of triangleis="+area_of_triangle);
				if(area_of_triangle==0)
				{
					System.out.println("this is collinear");
				}
				else
				{
					System.out.println("this is not collinear");
				}
				return true;
				
			}
			
			
			static double sqrt(double k)
			{
				double t=Math.sqrt(k);
				double epsilon=1.0e-15;
				while(Math.abs(t-k/t)>epsilon*t)
				{
					t=(k/t+t)/2;
				}
				System.out.println("t value is"+t);
				return epsilon;
			}
			static double sqrt(double c,double epsilon)
			{
				double t=Math.sqrt(c);
				while(Math.abs(t-c/t)>epsilon*t)
				{
					t=(c/t+t)/2;
				}
				System.out.println("t value is"+t);
				return epsilon;
			}
			
			
			static char Overloadmin(String str)
			{
				char array[]=str.toCharArray();
				int i;
				for(i=0;i<array.length;i++)
				{
					System.out.print(array[i]);
				}
				char small=array[0];
				for(i=0;i<array.length;i++)
				{
					if(small>array[i])
					{
						small=array[i];
					}
				}
				System.out.println("\n min value is ="+small);
				return 1;
			}
			static char Overloadmax(String str)
			{
				char array[]=str.toCharArray();
				int i;
				for(i=0;i<array.length;i++)
				{
					System.out.print(array[i]);
				}
				char large=array[0];
				for(i=0;i<array.length;i++)
				{
					if(large <array[i])
					{
						large=array[i];
					}
				}
				System.out.println("\n min value is ="+large);
				return 1;
			}
			
			
			
			static int[] MinandMax(int[] num)
			{
				Arrays.sort(num);
				System.out.println("Minimum = " + num[0]);
				System.out.println("Maximum = " + num[num.length-1]);
				return num;
				
			}
			
			
			static double  Presentvalue(int c,int r,int t)
			{
				double Presentvalue=c/(Math.pow(1+r, t));
				System.out.println("present value="+Presentvalue);
				return Presentvalue;
			}
			
		 public static void main(String args[]){  
		  int fact=1;  
		  Scanner s=new Scanner(System.in);
	 	  System.out.println("enter number=");
		  int n=s.nextInt();
		  fact = (int) factorial(n);   
		  System.out.println("Factorial of "+n+" is: "+fact);
		  
		  //Futurevalue
		  System.out.println("enter dollers=");
			int c=s.nextInt();
			System.out.println("enter interst rate=");
			int r=s.nextInt();
			System.out.println("enter time=");
			int t=s.nextInt();
			Futurevalue(c,r,t);
			
			//isPrime
			System.out.println("enter number=");
			 n=s.nextInt();
			  
			       if (isPrime(n)) {
			           System.out.println(n + " is a prime number");
			       } else {
			           System.out.println(n + " is not a prime number");
			       }
			       
			       
			       System.out.println("enter n value=");
			         n=s.nextInt();
			         System.out.println(nthHarmonic(n));
			         
			         sin();
			         
			         cos();
			         
			         System.out.println("enter the number");
			 		n=s.nextInt();
			 		binaryNumber(n);
			 		
			 		
			 		int i;
					for(i=1;i<=2;i++)
					{
						System.out.println("enter the value for x1:");
						double x1=s.nextDouble();
						System.out.println("enter the value for x2:");
						double x2=s.nextDouble();
						System.out.println("enter the value for x3:");
						double x3=s.nextDouble();
						System.out.println("enter the value for y1:");
						double y1=s.nextDouble();
						System.out.println("enter the value for y2:");
						double y2=s.nextDouble();
						System.out.println("enter the value for y3:");
						double y3=s.nextDouble();
						if(i==1)
						{
							checkcollinearUsingSlope(x1,x2,x3,y1,y2,y3);
						}
						else
						{
							checkcollinearUsingArea(x1,x2,x3,y1,y2,y3);
						}
						
						
						System.out.println("enter the k value");
						double k=s.nextDouble();
						sqrt(k);
						System.out.println("enter the epsilon value=");
						double epsilon=1;
						sqrt(k,epsilon);
						s.close();
						
						
						System.out.println("enter the string =");
						String str=s.nextLine();
						Overloadmin(str);
						Overloadmax(str);
						
						
						int num[]= {5,9,4,1,8,7};
						 MinandMax(num);
						 
						 
						 System.out.println("enter dollers=");
							 c=s.nextInt();
							System.out.println("enter interst rate=");
							 r=s.nextInt();
							System.out.println("enter time=");
							 t=s.nextInt();
							Presentvalue(c,r,t);

		  s.close();
		 }  

		 }
}
