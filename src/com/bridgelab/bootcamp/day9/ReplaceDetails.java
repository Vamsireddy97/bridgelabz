package com.bridgelab.bootcamp.day9;

import java.util.Scanner;

public class ReplaceDetails {

	public static void main(String[] args) {
		String str1;
		String str=new String(" Hello <<name>>, We have your full name as" + 
				"<<full name>> in our system.\n your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know\nin case of any clarification "
				+ "Thank you BridgeLabz 01/01/2016");
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter name");
		 String n=s.next();
		 str1=str.replaceAll("<<name>>",n);
		 
		 System.out.println("Enter full name");
		 String fn=s.next();
		 String str2=str1.replaceAll("<<full name>>",fn);
		 
		 System.out.println("Enter contact number");
		 String cn=s.next();
		 String str3=str2.replaceAll("91-xxxxxxxxxx",cn);
		 
		 System.out.println("Enter date eg:01/01/2016");
		 String d=s.next();
		 String str4=str3.replaceAll("01/01/2016",d);
		 System.out.println(str4);
	}

}
