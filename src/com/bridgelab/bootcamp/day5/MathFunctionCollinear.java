package com.bridgelab.bootcamp.day5;

import java.util.Scanner;

public class MathFunctionCollinear {
	static boolean checkcollinearUsingSlope(double x1,double x2,double x3,double y1,double y2,double y3)
	{
		double ab=(y2-y1)/(x2-x1);
		double bc=(y2-y1)/(x2-x1);
		double ac=(y2-y1)/(x2-x1);
		if(ab==bc && bc==ac &&ac==ab)
		{
			System.out.println("this is collinear");
		}
		else
		{
			System.out.println("this is not collinear");
		}
		return true;
	}
	static boolean checkcollinearUsingArea(double x1,double x2,double x3,double y1,double y2,double y3)
	{
		double area_of_triangle=0.5*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
		System.out.println("area of triangleis="+area_of_triangle);
		if(area_of_triangle==0)
		{
			System.out.println("this is collinear");
		}
		else
		{
			System.out.println("this is not collinear");
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		int i;
		Scanner s=new Scanner(System.in);
		for(i=1;i<=2;i++)
		{
			System.out.println("enter the value for x1:");
			double x1=s.nextDouble();
			System.out.println("enter the value for x2:");
			double x2=s.nextDouble();
			System.out.println("enter the value for x3:");
			double x3=s.nextDouble();
			System.out.println("enter the value for y1:");
			double y1=s.nextDouble();
			System.out.println("enter the value for y2:");
			double y2=s.nextDouble();
			System.out.println("enter the value for y3:");
			double y3=s.nextDouble();
			if(i==1)
			{
				checkcollinearUsingSlope(x1,x2,x3,y1,y2,y3);
			}
			else
			{
				checkcollinearUsingArea(x1,x2,x3,y1,y2,y3);
			}
			s.close();
		}
	}
}
