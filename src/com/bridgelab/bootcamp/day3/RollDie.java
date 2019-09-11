
package com.bridgelab.bootcamp.day3;
 
import java.util.Random;
import java.util.Scanner;

public class RollDie {

	public static void main(String[] args) {
		int d,ones_count=0,twos_count=0,threes_count=0,fours_count=0,
				fives_count=0,six_count=0;
			int i=0;
		
			
			Random r=new Random();
			Scanner s=new Scanner(System.in);
			System.out.println("enter n value=");
			int n=s.nextInt();
			while(n>i) 
			{
				d=r.nextInt(6)+1;
				if(d>=1&&d<=6)
				{
					if(d==1)
					{
						ones_count++;
			
					}
					else if(d==2)
					{
						twos_count++;
						
					}
					else if(d==3)
					{
						threes_count++;
						
					}
					else if(d==4)
					{
						fours_count++;
						
					}
					else if(d==5)
					{
						fives_count++;
						
					}
					else if(d==6)
					{
						six_count++;
						
					}
				}
				System.out.print(d+" ");
				
				i++;
			}
			System.out.println();
			int max1=Math.max(ones_count, twos_count);
			int max2=Math.max(threes_count, fours_count);
			int max3=Math.max(fives_count, six_count);
			int max4=Math.max(max1, max2);
			int max5=Math.max(max3, max4);
			System.out.println("maximum times value ="+max5);
			if(ones_count==max5)
			{
				System.out.println("1 is max");
			}
			if(twos_count==max5)
			{
				System.out.println("2 is max");
			}
			if(threes_count==max5)
			{
				System.out.println("3 is max");
			}
 			if(fours_count==max5)
			{
				System.out.println("4 is max");
			}
			if(fives_count==max5)
			{
				System.out.println("5 is max");
			}
			if(six_count==max5)
			{
				System.out.println("6 is max");
			}
		
	  }

}
