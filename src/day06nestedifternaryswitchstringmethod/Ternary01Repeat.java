package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class Ternary01Repeat {
	
	/*
    Type java code by using ternary and if-else, ask user to enter an integer,
    if the integer is even,	the output will be “The integer is even”.
    If the integer is odd, the output will be “The integer is odd”.
 */

	
	/*
	 	Type java code by using ternary .
	 	Ask user to enter two integers
		Write a program to print the minimum one on the console.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//TASK 1
		
		System.out.println("enter an integer...");
		int a =scan.nextInt();
		
		String result = a%2==0?"Even":"Odd";
		System.out.println(result);    		       // Second way:  System.out.println(a%2==0?"Even":"Odd");
		
				
		
		//TASK 2
		
		System.out.println("enter an integer...");
		int b = scan.nextInt();
		System.out.println("enter another integer...");
		int c= scan.nextInt();
		
		int result2 = b>c ? c : b;
		System.out.println(result2);			// System.out.println(b>c ? c : b);
		
		
		
		
		
		
		
		
	}

}
