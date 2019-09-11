package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter T value=");
		int t=s.nextInt();
		System.out.println("enter v value=");
		int v=s.nextInt();
		if((t>0&&t<=50)&&(v>3&&v<120))
		{
			double w = 35.74 + 0.6215*t + (0.4275*t-35.75)* Math.pow(v,0.16);
			System.out.println("winidchill="+w);
		}
		else
		{
			System.out.println("invalid input");
		}
		s.close();

	}

}
