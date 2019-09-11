package com.bridgelab.bootcamp.day1;

public class PrintKDM {
	public static void main(String[] args)
	{
		int count=4;
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<=count;k++)
			{
				if(k==count)
				{
					System.out.print("***");
				}
				else
				{
					System.out.print(" ");
				}
		    }
			if(i<4)
			{
				count--;
			}
			else if(i<9)
			{
				count++;
			}
			System.out.println("");
	   }
	}
 }

	

	
		
