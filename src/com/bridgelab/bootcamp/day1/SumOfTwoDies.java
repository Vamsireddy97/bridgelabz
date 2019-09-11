package com.bridgelab.bootcamp.day1;

import java.util.Random;

public class SumOfTwoDies {

	public static void main(String[] args) {
		Random r =new Random();
		int die1 =r.nextInt(6)+1;
		int die2=r.nextInt(6)+1;
		int sum=die1+die2;
		System.out.println("sum of two random integers="+sum);
	}

}
