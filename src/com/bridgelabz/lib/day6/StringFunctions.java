package com.bridgelabz.lib.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
		//anagram
		public static boolean checkanagram(String str1,String str2)
		{
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			System.out.println("after sorting");
			Arrays.sort(c1);
			Arrays.sort(c2);
			//System.out.println(c1);
			//System.out.println(c2);
			return Arrays.equals(c1, c2);
			
		}
		
		//palindrome
		public static boolean palindrome(String word,String revstring)
		{
		
			char[] c1=word.toCharArray();
			for(int i=c1.length-1;i>=0;i--)
			{
				revstring=revstring+c1[i];
			}
			char c2[]=revstring.toCharArray();
			return Arrays.equals(c1, c2);
			
		}
		
		//iterative
		public static String iterative(String s1)
		{
			ArrayList<String> a=new ArrayList<String>();
		a.add(String.valueOf(s1.charAt(0)));
		for(int i=1;i<s1.length();i++)
		{
			for(int j=a.size()-1;j>=0;j--)
			{
				String str=(String) a.remove(j);
				for(int k=0;k<=str.length();k++)
				{
					a.add(str.substring(0,k)+s1.charAt(i)+str.substring(k));
				}
			}
		}
		System.out.println(a);
			return s1;
		}
		
		//recursive
		 public static String swapString(String a, int i, int j) 
		    {  
		       char[] b =a.toCharArray();  
		       
		        char ch;  
		        ch = b[i];  
		        b[i] = b[j];  
		        b[j] = ch;  
		        return String.valueOf(b);  
		    } 
		 public static void Recursive(String str, int start, int end)  
		    {  
		        //Prints the permutations  
		        if (start == end-1)  
		            System.out.println(str);  
		        else   
		        {  
		            for (int i = start; i < end; i++)  
		            {  
		            	
		                str = swapString(str,start,i);  
		                
		                Recursive(str,start+1,end); 
		                
		                str = swapString(str,start,i);  
		            }  
		        }  
		    }  
		  

		public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
			//anagram
			System.out.println("enter first word=");
			String str1=s.next();
			System.out.println("enter second word=");
			String str2=s.next();
			System.out.println(checkanagram(str1,str2));
			
			//palindrome
			System.out.println("enter word=");
			String word=s.next();
			String revstring="";
			System.out.println(palindrome(word,revstring));
			
			//iterative method
			System.out.println("enter string=");
			
			String s1=s.next();
			iterative(s1);
			
			
			//recursive
			System.out.println("enter string=");
			String str=s.next (); 
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        Recursive(str, 0, len);  
		 
			s.close();

		}

	}
