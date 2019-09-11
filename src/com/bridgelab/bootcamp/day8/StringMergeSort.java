package com.bridgelab.bootcamp.day8;

import java.util.ArrayList;

public class StringMergeSort
{
	private ArrayList<String>list;
	public StringMergeSort(ArrayList<String>givenlist)
	{
	 
		this.list=givenlist;
	}
	public void startsorting()
	{
		divideList(0,list.size()-1);
	}
	public void divideList(int start, int end)
	{
		if(start<=end&&(end-start)>0)
		{
			int mid=start+(end-start)/2;
			divideList(start, mid);
			divideList(mid+1, end);
			merge(start,mid,end);
		}

	}
	public void merge(int start, int mid, int end)
	{
		ArrayList<String>result=new ArrayList<String>();
		int begin=start;
		int last=mid+1;
		while(begin<=mid&&last<=end)
		{
			if(list.get(begin).compareTo(list.get(last))<=0)
			{
				result.add(list.get(begin));
				begin++;
			}
			else
			{
				result.add(list.get(last));
				last++;
			}

		}
		while(begin<=mid)
		{
			result.add(list.get(begin));
			begin++;

		}
		while(last<=end)
		{
			result.add(list.get(last));
			last++;
		}
		int i=0;
		int j=start;
		while(i<list.size())
		{
			list.set(j, result.get(i++));
			j++;
		}
	}
	public void printlist() 
	{
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		String []ar = {"5","2","9","8","0","7","3"};
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < ar.length; i++)
		list.add(ar[i]);
		StringMergeSort ms=new StringMergeSort(list);
		ms.startsorting();
		ms.printlist();

		System.out.println("\n"+list);

	}

}
