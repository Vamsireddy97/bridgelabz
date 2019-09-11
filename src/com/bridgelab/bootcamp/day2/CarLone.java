package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class CarLone {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     System.out.println("Principal lone");
	     double P = s.nextInt();
	     System.out.println("Year");
	     double Y = s.nextInt();
	     System.out.println("interest");
	     double R = s.nextInt();
	     double n=12*Y;
	     double r=R/(12*100);
	     
	     double payment=(P*r)/(1-Math.pow(1+r, -n));
	     double interest = payment * n - P;
	     System.out.println("monthly payment="+payment);
	     System.out.println("total interest="+interest);
	     s.close();

	}

}
