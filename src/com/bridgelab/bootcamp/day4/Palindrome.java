package com.bridgelab.bootcamp.day4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter word=");
		String word=s.next();
		String revstring="";
		
		char[] c1=word.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{
			revstring=revstring+c1[i];
		}
		System.out.println(revstring);
		if(word.equals(revstring))
		{
			System.out.print(word+" is palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
		s.close();
	}

}
