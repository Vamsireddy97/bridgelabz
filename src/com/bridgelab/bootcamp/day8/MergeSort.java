package com.bridgelab.bootcamp.day8;

public class MergeSort 
{
	public static void mergeSort(int[] array)
	{
		int i,j;
		if(array == null)
		{
			return;
		}
		if(array.length>1)
		{
			int mid = array.length/2;
			int[] left = new int[mid];
			for(i=0;i<mid;i++)
			{
				left[i]=array[i];
			}
			int[] right = new int[array.length - mid];
			for(i=mid;i<array.length;i++)
			{
				right[i-mid]=array[i];
			}
			mergeSort(left);
			mergeSort(right);
			 i=0;
			 j=0;
			 int k=0;
			 while(i<left.length && j<right.length)
			 {
				 if(left[i]<right[j])
				 {
					 array[k] =left[i];
					 i++;
				 }
				 else
				 {
					 array[k] =right[j];
					 j++;
				 }
				 k++;
			 }
			 while(i<left.length)
			 {
				 array[k] = left[i];
				 i++;
				 k++;
			 }
			 while(j<right.length)
			 {
				 array[k]=right[j];
				 j++;
				 k++;
			 }
		}
	}
	public static void main(String args[])
	{
		int array[]= {12,11,13,5,6,7};
		int i=0;
		System.out.println("given array is:");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		mergeSort(array);
		System.out.println("\n");
		System.out.println("sorted array is:");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
	}
}