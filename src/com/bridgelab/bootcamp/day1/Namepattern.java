package com.bridgelab.bootcamp.day1;

public class Namepattern {

	public static void main(String[] args) {
		int row;
		for(row =0;row<9;row++)
		{
			int j=10-row;
			for(int star1=0;star1<2;star1++)
			{
				System.out.print("*");
			}
			if(row<5) 
			{
				for(int space1=1;space1>0;space1++)
				{
					System.out.print(" ");
				}
			}
			else
			{
				for(int space2=0;space2<=row-5;space2++)
				{
					System.out.print(" ");
				}
			}
			for(int star3=0;star3<3;star3++)
			{
				System.out.print("*");
			}
			if(row<5)
			{
				for(int space3=0;space3<=row+2;space3++)
				{
		            System.out.print(" ");
				}
			}
			else
			{
				for(int space4=j;space4>0;space4--)
				{
					System.out.print(" ");
				}
			}
		}
	}
}
				
		

