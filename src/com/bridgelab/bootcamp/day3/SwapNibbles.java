package com.bridgelab.bootcamp.day3;

import java.util.Scanner;

public class SwapNibbles {
	
	static int swapNibbles(int x) 
	{ 
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 


	public static void main(String arg[]) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value=");
		int x=s.nextInt(); 
		System.out.print(swapNibbles(x)); 
	} 
} 

	