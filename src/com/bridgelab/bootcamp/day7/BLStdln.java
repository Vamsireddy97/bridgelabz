package com.bridgelab.bootcamp.day7;

import java.util.Scanner;

public class BLStdln {
	static boolean isEmpty()
	{
		String s1="";  
		String s2="javatpoint";  
		  
		System.out.println("first string is empty:"+s1.isEmpty());  
		System.out.println("first string is empty:"+s2.isEmpty());  
		return true;
	}
	static int readInt()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		String a=sc.nextLine();
		int b=Integer.parseInt(a);
		System.out.println("convert token into int is:"+b); 
		sc.close();
		return b;
	}
	static double readDouble()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		String a=sc.nextLine();
		double b=Double.parseDouble(a);
		System.out.println("convert token into int is:"+b);
		sc.close();
		return b;
	}
	static boolean readBoolean()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		String a=sc.nextLine();
		Boolean b=Boolean.parseBoolean(a); 
		System.out.println("convert token into boolean is:"+b);
//		if(b)
//			System.out.println("yes");
//		else
//			System.out.println("no");
		sc.close();
		return true ;
	}
	static String readString()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		String a=sc.nextLine();
		System.out.println("convert token into String is:"+a);
		sc.close();
		return a;
	}
	static boolean hasNextChar()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		boolean result =sc.hasNext();
		sc.close();
		return result;
		
	}
	static char readChar()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
		String	ch=sc.next();
		sc.close();
		return ch.charAt(0);
	}
	static boolean hasNextLine()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a value:");
//		String line=sc.nextLine();
		sc.close();
		return sc.hasNextLine();
	}
	public static String readLine()
	{
		Scanner sc= new Scanner(System.in);
		String a= sc.nextLine();
		return a;
	}
	public static String[] readStrings(String filename)
	{
		Scanner sc= new Scanner(System.in);
		return new sc.filename.readAllStrings();
	}
	static int[] readAllInts()
	{
	
		String[] fields = readStrings(null);
		int[] vals =new int[fields.length];
		for(int i=0;i<fields.length;i++)
			vals[i]=Integer.parseInt(fields[i]);
		return vals;
	}
	static double[] readAllDouble()
	{
		String[] fields = readStrings(null);
		double[] vals =new double[fields.length];
		for(int i=0;i<fields.length;i++)
			vals[i]=Double.parseDouble(fields[i]);
		return vals;
	}
	
	static boolean[] readAllBoolean()
	{
		String[] fields = readStrings(null);
		boolean[] vals =new boolean[fields.length];
		for(int i=0;i<fields.length;i++)
			vals[i]=Boolean.parseBoolean(fields[i]);
		return vals;
	}
//	static String[] readAllStrings()
//	{
//		String[] token =
//	}
//	static String[] readAllLines()
//	{
//		ArrayList<String> lines = new ArrayList<String>();
//	    while (hasNextLine()) 
//	       {
//	            lines.add(readLine());
//	        }
//	     return lines.toArray(new String[lines.size()]);
//	}
	public static String readAll()
	{
		Scanner sc= new Scanner(System.in);

		if(!sc.hasNextLine())
			return "";
		String retult =sc.next();
		return "";
	}
	public static void main(String args[])
	{
		for(int i=1;i<15;i++)
		{
			if(i==1)
				isEmpty();
//			if(i==2)
//				readInt();
//			if(i==3)
//				readDouble();
//			if(i==4)
//				readBoolean();
//			if(i==5)
//				readString();
//			if(i==6)
//				hasNextChar();
			if(i==7)
				readChar();
			if(i==8)
				hasNextLine();
			if(i==8)
				readLine();
			if(i==9)
				readAllInts();
			if(i==10)
				readAllDouble();
			if(i==11)
				readAllBoolean();
//			if(i==12)
//				readAllStrings();
//			if(i==13)
//				readAllLines();
//			if(1==14)
//				readAll();
		}
	
		
				
	}

}
