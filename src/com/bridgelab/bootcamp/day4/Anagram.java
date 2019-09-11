 package com.bridgelab.bootcamp.day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean checkanagram(String str1,String str2)
	{
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		//System.out.println("after sorting");
		Arrays.sort(c1);
		Arrays.sort(c2);
		//System.out.println(c1);
		//System.out.println(c2);
		return Arrays.equals(c1, c2);
		
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter first word=");
		String str1=s.next();
		System.out.println("enter second word=");
		String str2=s.next();
		System.out.println(checkanagram(str1,str2));
		s.close();

	}

}
