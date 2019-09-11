package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class TemperaturConversion {
  
	public static void main(String[] args) {
		double F,C = 0;
		System.out.println("enter choice 1 for fahrenheit to celsius");
		System.out.println("enter choice 2 for celsius to fahrenheit ");
		Scanner S=new Scanner(System.in);
		System.out.println("enter choice=");
		int c=S.nextInt();
		switch(c)
		{
		
		case 1:
		System.out.println("enter  Fahrenheit temperatur=");
 		 F=S.nextInt();
		C=(F - 32) * 5/9;
		System.out.println("Celsius temperatur="+C);
		break;
		
		case 2:
	    System.out.println("enter  Celsius temperatur=");
		F=S.nextInt();
		F=(C * 9/5) + 32;
		System.out.println("Fahrenheit temperatur="+F);
		break;
		}
		S.close();
		 
	}

}
