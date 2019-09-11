package com.bridgelab.bootcamp.day3;

public class RepeatedNumber {
	
		void Num(int arr[], int size) 
		{ 
			int i, j; 
			System.out.println("Repeated Elements are :"); 
			for (i = 0; i < size; i++) 
			{ 
				for (j = i + 1; j < size; j++) 
				{ 
					if (arr[i] == arr[j])
						
						System.out.print(arr[i] + " ");
					} 
			}
		} 

		public static void main(String[] args) 
		{ 
			RepeatedNumber repeat = new RepeatedNumber(); 
			int arr[] = {5,8,6,2,1,2}; 
			int size = arr.length; 
			repeat.Num(arr,size); 
		} 
	 

}
