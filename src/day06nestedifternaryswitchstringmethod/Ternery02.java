package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class Ternery02 {
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
		
		
		
		// first question
//		System.out.println("enter an integer...");
//		int a = scan.nextInt();
//		
//		
//		int result1 = a<0 ? -1*a : a;
//		System.out.println(result1);
		
		
		
		//second question
		
		System.out.println("enter the lenght and width of the rectangle");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		
		String result2 = length==width ? "square" : "rectangle";
		System.out.println(result2);
		
		
		
	}

}
