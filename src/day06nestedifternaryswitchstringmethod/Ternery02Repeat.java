package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class Ternery02Repeat {

	/*
 	Type java code by using ternary.
	Write a program to print absolute value (mutlak deger) of an integer entered by user.
 */
	
	/*
	 Second question:
	 Type java code by using using ternary.
Take values of length and width of a rectangle from user and check if it is square or not.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int a = scan.nextInt();
		
		int result = a>=0 ? a : -1*a ;          
		System.out.println(result);                      // System.out.println(a>=0 ? a : -1*a);
		
		
		
		
		
			// Second Question
		
		System.out.println("enter length");
		double l = scan.nextDouble();
		System.out.println("enter width");
		double w = scan.nextDouble();
				
				
				String result2= l==w ? "square" : "rectangle";
		        System.out.println(result2);	                      //	System.out.println(l==w ? "square" : "rectangle");
		
		
		
		
		
		
		
		
	}
}
