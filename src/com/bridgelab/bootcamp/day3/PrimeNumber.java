package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter range of numbers");
		System.out.println("r1=");
		int r1=s.nextInt();
		System.out.println("r2=");
		int r2=s.nextInt();
		int i;
		for (i=r1;i<=r2;i++)
		{
			int count=0;
			for(int n=1;n<=i;n++)
			{
				if(i%n==0)
				{
					count=count+1;
				}
			}
		
			if(count==2)
			{
			
			System.out.print(i+" ");
			}
		}
		
	}
		

}
