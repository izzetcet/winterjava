package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class NestedTernary01 {
	
	/*
	 Ask user to enter an integer
	 if the integer is positive then check if it is less then 10 then return "the integer is digit"
	 if the integer is negative return "negatives are not be a digit"
	 Use nested ternary...
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter an integer ");
		
		int a = scan.nextInt();
		

		String result = (a>=0) ? (a<10 ? "the integer is digit" : "the integer is not digit") : ("negatives are not be a digit");
		
		System.out.println(result);
		
	}

}
