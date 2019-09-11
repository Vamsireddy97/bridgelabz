package com.bridgelab.bootcamp.day1;

public class Quadratic {
	void findroots(int a,int b,int c)
	{
		if(a==0)
		{
			System.out.println("invalid");
			return;
		}
		double d=b*b-4*a*c;
		double sqrt_d =Math.sqrt(d);
		//double root1=(-b+sqrt_d )/2*a
		//double root2=(+b+sqrt_d )/2*a;
		System.out.println("Root1="+(-b+sqrt_d )/2*a);
		System.out.println("Root2="+(-b-sqrt_d )/2*a);
	}

	public static void main(String[] args) {
		Quadratic q=new Quadratic();
		
		q.findroots(5, 15, 5);
		

	}

}
