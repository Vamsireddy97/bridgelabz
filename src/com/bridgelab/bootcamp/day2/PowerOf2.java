package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value=");
		int n=s.nextInt();
		int power=2;
		for(int i=1;i<=n;i++)
		{
			System.out.println("2^"+i+"="+power);
			power=power*2;
		}
		s.close();

	}

}
