package com.bridgelab.bootcamp.day9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
	static boolean Fname(String fn) 
	{
		if(fn.matches("[a-zA-Z]+"))
		{
			return true;
		}
		else
			return false;
		
	}
	
	static boolean Lname(String ln) 
	{
		if(ln.matches("[a-zA-Z]+"))
		{
			return true;
		}
		else
			return false;
		
	}
	
	static boolean Email(String e) 
	{
		//String EmailRegex="[A-Z]+[0-9]+[@#+-]$";
		String EmailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern Emailpat=Pattern.compile(EmailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=Emailpat.matcher(e);
		return matcher.find();
	}
	
	static boolean PhoneNum(String pn)
	{
		if(pn.matches("[+]{1}[0-9]{2}[0-9]{10}"))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	static boolean CompanyName(String cn)
	{	
		String name="[a-zA-Z]+";
		return cn==null || cn.matches(name);
	}
	
	static boolean ID(String id)
	{	
		String name="[a-zA-Z0-9]+";
		return  id.matches(name);
	}
	
	static boolean Password(String pw)
	{	
		if(pw.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})"))
		{
			return  true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter firstname ");
		String fn=s.next();
		System.out.println(Fname(fn));
		
		System.out.println("Enter lastname ");
		String ln=s.next();
		System.out.println(Lname(ln));

		System.out.println("Enter Email ");
		String e=s.next();
		System.out.println(Email(e));
		
		System.out.println("Enter Phone number  eg:+91XXXXXXXXXX");
		String pn=s.next();
		System.out.println(PhoneNum(pn));
		
		System.out.println("Enter Company Name");
		String cn=s.next();
		System.out.println(CompanyName(cn));
		
		System.out.println("Enter ID");
		String id=s.next();
		System.out.println(ID(id));
		
		System.out.println("Enter Password");
		String pw=s.next();
		System.out.println(Password(pw));
	}

}
