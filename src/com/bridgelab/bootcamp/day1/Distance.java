  
package com.bridgelab.bootcamp.day1;

public class Distance {
	void  point(int x1,int x2)
	{
		double distance= Math.sqrt(Math.pow(x1 - 0, 2) +  
                Math.pow(x2 - 0, 2) * 1.0);
		System.out.println("Distance="+distance);
	}

	public static void main(String[] args) {
		Distance d=new Distance();
		 
		d.point(30, 20);
		
	}

}
