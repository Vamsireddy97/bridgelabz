package com.bridgelab.bootcamp.day1;

public class Namerevers {
	 
	public static void main(String[] args)
	{
		System.out.print("hi ");
		String[] s1= {"alice","bob","taral"};
		
		for(int i=s1.length-1;i>=0;i--)
		{
			if(i==0)
			{
				System.out.print("and ");
			}
			System.out.print(s1[i]+" ");
		}
			
	}
}
