package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class Ternary04 {

	/*
	 ASK USER TO ENTER AN INTEGER.
	 IF  HTE INTEGER IS NEGATIVE RETURN "THIS INTEGER IS NEGATIVE"
	 IF THE INTEGER IS POSITIVE RETURN ITS SQUARE
	 USE TERNARY...
	 */
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("enter an integer ");
		int a = scan.nextInt();
		
		System.out.println(a<0 ? "The integer is negative" : a*a);
		
		
		
		
		
		
	}

}
