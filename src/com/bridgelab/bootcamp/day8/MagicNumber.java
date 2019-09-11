package com.bridgelab.bootcamp.day8;

import java.util.Scanner;

public class MagicNumber
{
	static int binarySearch(int arr[], int key)
	{
		
		int beg =0,i,mid;
		int end = arr.length -1;
		while(beg<=end)
		{
			 mid=(beg + end)/2;
			if(arr[mid] == key)
			{
				System.out.println("mid value is found:"+(mid+1));
				
			}	
			if(key<arr[mid])
			{
				end=mid - 1;
				
			}
			else
			{
				beg = mid + 1;
			}
	
		}
		return key;
	}
	public static void main(String args[])
	{
		int n,key,i,m;
		System.out.println("enter the value for the n:");
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr = new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the element is:");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Enter the element for searching");
		key =sc.nextInt();
		m=binarySearch(arr,key);
			
		int num=m,sum=0,s;
		while(num>9)
		{
			sum=num;
				s = 0;
			while(sum!=0)
			{
				s= s +(sum%10);
				sum =sum/10;
			}
			num=s;
		}
		if(num == 1)
		{
			System.out.println(key+" This is a magic number ");
		}
		else
		{
			System.out.println("this is not a magic number");
		}	

		
	}
}
