package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class DayOfWeek {
	
		   public static void main(String[] args) {
			   

		     Scanner s = new Scanner(System.in);
		     System.out.println("Month");
		     int m = s.nextInt();
		     System.out.println("Date");
		     int d = s.nextInt();
		     System.out.println("Year");
		     int y = s.nextInt();
		     int y0 = y - (14 - m) / 12;
		     int x = y0 + y0/4 - y0/100 +y0/400;
		     int m0 = m + 12 * ((14 - m) / 12) - 2;
		     int d0 = (d + x + 31 * m0 / 12) % 7;  
		      
		      String b = null;
		          if (d0==0) 
		          {
		            b = "Sunday";
		          }
		          else if (d0==1)
		          {
		        	 b = "Monday";
		           } 
		          else if (d0==2)
		          {
		               b = "Tuesday";
		           } 
		          else if (d0==3)
		          {
		                b = "Wednesday";
		          } 
		          else if (d0==4)
		          {
		                 b = "Thursday";
		          } 
		          else if (d0==5)
		          {
		                  b = "Friday";
		          } 
		          else if (d0==6)
		          {
		                    b = "Saturday";
		          }                 
		                  
		           
				System.out.println("day  is " + b);
				s.close();
		    }
}



	
	


