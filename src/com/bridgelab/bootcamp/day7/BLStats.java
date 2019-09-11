package com.bridgelab.bootcamp.day7;

import java.util.Arrays;
import java.util.Scanner;

public class BLStats {
	static int max(double[] a)
	{
		int i;
		double large=a[0];
		for( i=0;i<a.length;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		System.out.println("max value is:"+large);
		
		return 1;
	}
	
	static double min(double[] a)
	{
		int i;
		double min=a[0];
		for( i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("min value is:"+min);
		
		return 1;
	}
	static double mean(double[] a)
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("average is"+avg);
		
		return 1;
	}
	static double var(double[] a)
	{
		double var=0;
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		for(int i=0;i<a.length;i++)
		{
			var=var +(a[i]-avg)*(a[i]-avg);
		}return 1;
	}
	
	static double stddev(double[] a)
	{
		return Math.sqrt(var( a));
	}
	static double median(double[] a)
	{
		Arrays.sort(a);
		if(a.length%2!=0)
			return (double)a[a.length/2];
		return (double)(a[(a.length -1)/2 +(a.length)/2])/2;
	}
	
	public static void main(String args[])
	{
		int i,n;
		double[] a= new double[10];
		
	
		System.out.println("enter the n value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the value of array:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				max(a);
				break;
		case 2:
				min(a);break;
		case 3:
				System.out.println(mean(a));break;
		case 4:
				System.out.println(var(a));break;
		case 5:
				System.out.println(stddev(a));break;
		case 6:
				System.out.println(median(a));break;
		default:
			System.out.println("invalid choice");
				
		}
		sc.close();
		
	}

}
