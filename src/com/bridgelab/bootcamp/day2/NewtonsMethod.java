package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class NewtonsMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter c value=");
		double c=s.nextDouble();
		double epsilon = 1.0e-15;  
        double t = c;             
        while (Math.abs(t - c/t) > epsilon*t)
        {
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
        s.close();

	}

}
