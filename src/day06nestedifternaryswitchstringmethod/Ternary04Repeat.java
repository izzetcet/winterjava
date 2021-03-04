package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class Ternary04Repeat {
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
		
		
	//	a<0 ? "THIS INTEGER IS NEGATIVE" : a*a;   ===> variable olusturamiyoruz cunku cikan verinin biri integer digei string
	// bunun icin direk systemoutprintln'in icine atiyoruz
		
		
		System.out.println(a<0 ? "THIS INTEGER IS NEGATIVE" : a*a);
			
		
		
		
		
		
		
		
		
	}

}
