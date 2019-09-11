package com.bridgelab.bootcamp.day3;

public class SecondLargest {
	
		public static void print2largest(int arr[], int size) 
		{ 
			int i, first, second; 
			if (size < 2) 
			{ 
				System.out.print(" Invalid Input "); 
				return; 
			} 
		
			first = second = Integer.MIN_VALUE; 
			for (i = 0; i < size ; i++) 
			{ 
				if (arr[i] > first) 
				{ 
					second = first; 
					first = arr[i]; 
				} 
				else if (arr[i] > second) 
					second = arr[i]; 
			} 
			
			System.out.println ("The second largest element="+ second); 
		} 
		static void print2smallest(int arr[],int size)
		{
			int i, first, second; 
			if (size < 2) 
			{ 
				System.out.print(" Invalid Input "); 
				return; 
			} 
		
			first = second = Integer.MAX_VALUE; 
			for (i = 0; i < size ; i++) 
			{ 
				if (arr[i] < first) 
				{ 
					second = first; 
					first = arr[i]; 
				} 
				else if (arr[i] < second) 
					second = arr[i]; 
			} 
			
			System.out.print("The second smallest element="+ second); 
		}
		public static void main(String[] args) 
		{ 
				int arr[] = {12, 35, 1, 10, 34, 2}; 
				int size = arr.length; 
				print2largest(arr, size);
				print2smallest(arr,size);
				
		} 
} 
	


