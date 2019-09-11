 package com.bridgelab.bootcamp.day9;

import java.util.Scanner;

public class StringRepalce {

	public static void main(String[] args) {
		String str= new String("Old MacDonald had a farm,\n"
				+"E-I-E-I-O."
				+"And on his farm he had some %ANIMAL%,\n"
				+"E-I-E-I-O.\n"
				+"With a %SOUND%, %SOUND% here,\n"
				+"And a %SOUND%, %SOUND% there,\n"
				+"Here a %SOUND%, there a %SOUND%,\n"
				+"Everywhere a %SOUND%, %SOUND%,");
		System.out.println("list of animals and sounds");
		System.out.println("1.Chicks - chick \n"
						+  "2. Duck - quack \n"
						+  "3. Turkey - gobble\n"
						+  "4. Cat -meow, meow\n"
						+  "5. Mule - Heehaw\n"
						+  "6. Turkey - gobble\n"
						+  "7. Dog - bow wow\n"
						+  "8. Pig - oink, oink\n" 
						+  "9. Turtle - nerp, nerp \n"
						+  "10. Cow - moo, moo");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		String str1;
		switch(i)
		{
		case 1:
			str1=str.replaceAll("%ANIMAL%", "chicks");
			System.out.println(str1.replaceAll("%SOUND%", "chick"));
			break;
		case 2:
			str1=str.replaceAll("%ANIMAL%"," Duck");
			System.out.println(str1.replaceAll("%SOUND%", "quack"));
			break;
			
		case 3:
			str1=str.replaceAll("%ANIMAL%","Turkey");
			System.out.println(str1.replaceAll("%SOUND","gobble"));
			break;
		case 4:
			str1=str.replaceAll("%ANIMAL%","Cat");
			System.out.println(str1.replaceAll("%SOUND%", "meow, meow"));
			break;
		case 5:
			str1=str.replaceAll("%ANIMAL%","Mule");
			System.out.println(str1.replaceAll("%SOUND%", "Heehaw"));
			break;
		case 6:
			str1=str.replaceAll("%ANIMAL%","Turkey");
			System.out.println(str1.replaceAll("%SOUND%", "gobble"));
			break;
		case 7:
			str1=str.replaceAll("%ANIMAL%","Dog");
			System.out.println(str1.replaceAll("%SOUND%", "bow wow"));
			break;
		case 8:
			str1=str.replaceAll("%ANIMAL%","Pig");
			System.out.println(str1.replaceAll("%SOUND%", "oink, oink"));
			break;
		case 9:
			str1=str.replaceAll("%ANIMAL%","Turtle");
			System.out.println(str1.replaceAll("%SOUND%", "nerp, nerp"));
			break;
		case 10:
			str1=str.replaceAll("%ANIMAL%","Cow");
			System.out.println(str1.replaceAll("%SOUND%", "moo, moo"));
			break;
			
			
		}
		s.close();
	}

}
