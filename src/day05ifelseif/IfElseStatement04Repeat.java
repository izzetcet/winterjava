package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement04Repeat {
	/*
	Type java code by using if-else if() statement,
	if both of the two integers are positive, output will be the sum of them.
	If both of the two integers are negative, output will be the multiplication of them.
	Otherwise; output will be “I cannot add or multiply different signed numbers”
	*/
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 integers...");
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a>0 && b>0) {
			System.out.println("the sum of this numbers is:" + (a+b));
		} else if (a<0 && b<0) {
			System.out.println("the multiply of this numbers is:" + (a*b));
		} else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
				
		
		
		
		
	}

}
