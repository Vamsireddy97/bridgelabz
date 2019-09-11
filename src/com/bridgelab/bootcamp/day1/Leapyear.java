package com.bridgelab.bootcamp.day1;

import java.util.Scanner;

public class Leapyear {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter year=");
		int year=s.nextInt();
		if(year>=1582)
		{
		
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
				System.out.println("leap year");
			else
				System.out.println("not leap year");
		}
		else
		{
			System.out.println("invalid input");
		}
		s.close();
	}

}
