package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class FutureValueUsingStatic {
	static double  Futurevalue(int c,int r,int t)
	{
		double Futurevalue=c*Math.pow(1+r, t);
		System.out.println("Future value="+Futurevalue);
		return Futurevalue;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter dollers=");
		int c=s.nextInt();
		System.out.println("enter interst rate=");
		int r=s.nextInt();
		System.out.println("enter time=");
		int t=s.nextInt();
		Futurevalue(c,r,t);
		s.close();
	}

}
