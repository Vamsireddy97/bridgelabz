package com.bridgelab.bootcamp.day5;

import java.util.Arrays;

public class MinMaxUsingStatic {
	static int[] MinandMax(int[] num)
	{
		Arrays.sort(num);
		System.out.println("Minimum = " + num[0]);
		System.out.println("Maximum = " + num[num.length-1]);
		return num;
		
	}
	

	public static void main(String[] args) {
		int num[]= {5,9,4,1,8,7};
		 MinandMax(num);

	}

}
