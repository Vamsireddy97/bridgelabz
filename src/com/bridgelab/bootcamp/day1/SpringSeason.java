package com.bridgelab.bootcamp.day1;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter month=");
	int month=s.nextInt();
	System.out.println("enter date=");
	int date=s.nextInt();
		
		if(month<2&&month>7)
		{
			boolean flag=false;
		
			for(month=3;month<=6;month++) 
			{
				for(date=1;date<=20;date++)
				{
					flag=true;
				}	
			}
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		s.close();
	}
	
}
		

		
