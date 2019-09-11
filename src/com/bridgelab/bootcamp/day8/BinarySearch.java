package com.bridgelab.bootcamp.day8;

import java.util.Scanner;

public class BinarySearch {
		static int binarySearch(String[] arr, String search) 
		{ 
			int first = 0, last = arr.length - 1; 
			while (first <= last) { 
				int mid = first + (last - first) / 2; 
				int res = search.compareTo(arr[mid]); 

				// Check if x is present at mid 
				if (res == 0) 
					return mid; 

				// If x greater, ignore left half 
				if (res > 0) 
					first = mid + 1; 

				// If x is smaller, ignore right half 
				else
					last = mid - 1; 
			} 

			return -1; 
		} 


		public static void main(String []args) 
		{ 
			Scanner s=new Scanner(System.in);
			System.out.println("enter number of elements to enter=");
			int n=s.nextInt();
			String[] arr=new String[n];
			for (int counter = 0; counter < n; counter++)
		          arr[counter] = s.next();
			System.out.print("enter search word=");
			String search = s.next(); 
			int result = binarySearch(arr, search); 

			if (result ==-1) 
				System.out.println("Element not present"); 
			else
				System.out.println("Element found at "
								+ "index " + result);
			s.close();
		} 
} 
