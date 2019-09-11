package com.bridgelab.bootcamp.day2;

import java.util.Scanner;

public class Gamlingsimulator {
	

	    public static void main(String[] args) {
	    	 Scanner s = new Scanner(System.in);
		     System.out.println("stake=");
		     int stake = s.nextInt();
		     System.out.println("goal=");
		     int goal = s.nextInt();
		     System.out.println("trials=");
		     int trials = s.nextInt();
		     
	         int bet = 0; 
	         int win = 0; 

	        for (int i = 1; i < trials; i++) {
	            int cash = stake;
	         
	            while (cash > 0 && cash < goal) {
	                bet++;

	                if (Math.random() < 0.5)
	                {
	                    cash++;
	                } 
	                else 
	                {
	                    cash--; 
	                }
	            }
	            if (cash == goal)
	                win++;
	        }
	        System.out.println(win+"win of"+trials);
	        System.out.println("persent of game won="+100.0*win/trials);
	        System.out.println("avr bet is"+1.0*bet/trials);
	    }
	}
