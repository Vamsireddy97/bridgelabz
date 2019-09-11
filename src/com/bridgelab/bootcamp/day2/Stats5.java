package com.bridgelab.bootcamp.day2;

public class Stats5 {

	public static void main(String[] args) {
		double value1=Math.random();
		double value2=Math.random();
		double value3=Math.random();
		double value4=Math.random();
		double value5=Math.random();
		System.out.println("value1="+value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		System.out.println("value4="+value4);
		System.out.println("value5="+value5);
		double avg=(value1+value2+value3+value4+value5)/5;
		System.out.println("avarage value"+avg);
		
		double min1=Math.min(value1, value2);
		double min2=Math.min(value3, value4);
		double min3=Math.min(min1, min2);
		double min4=Math.min(min3, value5);
		System.out.println("minimum value="+min4);
		
		double max1=Math.max(value1, value2);
		double max2=Math.max(value3, value4);
		double max3=Math.max(max1, max2);
		double max4=Math.max(max3, value5);
		System.out.println("maximum value="+max4);
		
	}

}
