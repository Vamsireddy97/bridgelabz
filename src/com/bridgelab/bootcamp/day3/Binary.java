package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int a,n,x=0,j=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number=");
		n=s.nextInt();
		while(n>0)
		{
			a=n%2;
			x=x+(a*j);
			n=n/2;
			j=j*10;
			 
		}
		System.out.println("binary number="+x);
		s.close();

	}

}
