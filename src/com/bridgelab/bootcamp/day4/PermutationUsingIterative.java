package com.bridgelab.bootcamp.day4;

import java.util.ArrayList;

public class PermutationUsingIterative {
	static void PermutationUsingIterative(String s)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add(String.valueOf(s.charAt(0)));
		for(int i=1;i<s.length();i++)
		{
			for(int j=a.size()-1;j>=0;j--)
			{
				String str=(String) a.remove(j);
				for(int k=0;k<=str.length();k++)
				{
					a.add(str.substring(0,k)+s.charAt(i)+str.substring(k));
				}
			}
		}
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		String s="ABC";
		PermutationUsingIterative(s);
	}

}
