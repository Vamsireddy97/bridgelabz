package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class PresentValueUsingStatic {
	static double  Presentvalue(int c,int r,int t)
	{
		double Presentvalue=c/(Math.pow(1+r, t));
		System.out.println("present value="+Presentvalue);
		return Presentvalue;
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
		Presentvalue(c,r,t);
		s.close();
	}


}
