package com.bridgelab.bootcamp.day2;
public class FlipCoin {

	public static void main(String[] args) {
		int Random;
		int tail=0;
		int head=0;
		for(int i=0;i<100;i++) {
		Random=(int) (Math.random()*2);
		if(Random==0)
		{
			tail++;	
		}
		else
		{
			head++;
		}
	}
		
		
		double a=(tail/100.0)*100.0;
		double b=(head/100.0)*100.0;
		System.out.println("tail="+a+"%");
		System.out.println("head="+b+"%");
	}
	
}

