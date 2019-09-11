package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class MinMaxStaticOverload {
	static char Overloadmin(String str)
	{
		char array[]=str.toCharArray();
		int i;
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		char small=array[0];
		for(i=0;i<array.length;i++)
		{
			if(small>array[i])
			{
				small=array[i];
			}
		}
		System.out.println("\n min value is ="+small);
		return 1;
	}
	static char Overloadmax(String str)
	{
		char array[]=str.toCharArray();
		int i;
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		char large=array[0];
		for(i=0;i<array.length;i++)
		{
			if(large <array[i])
			{
				large=array[i];
			}
		}
		System.out.println("\n min value is ="+large);
		return 1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string =");
		String str=s.nextLine();
		Overloadmin(str);
		Overloadmax(str);
		s.close();
		
	}
}
