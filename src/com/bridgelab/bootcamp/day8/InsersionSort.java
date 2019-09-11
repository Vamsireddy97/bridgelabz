package com.bridgelab.bootcamp.day8;

public class InsersionSort
{
	public static String[] inSort(String array[], int len)
	{
		String temp ="";
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;i<len;j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
			
		}
		return array;
	}
	public static void main(String args[])
	{
		String[] array= {"Shamim","Taufique","Tanweer","vamshi"};
		int len =array.length;
		String a[]=inSort(array,len);
		for( int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}