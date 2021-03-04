package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61Question7 {

	public static void main(String[] args) {
		
		/*
		 * Type java code by using if-else statement.
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity and unit price then judge and print total cost for user.
If the quantity is less than 1000 output will be “No discount.”
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter quantity price");
		int quantitiy = scan.nextInt();
		
		
		System.out.println("Enter unit price");
		double unit = scan.nextDouble();
				
		double total = quantitiy*unit;
		System.out.println("Total cost:" + total);
				
		if (total>=1000) {
			System.out.println("10% discount");
		}else {
			System.out.println("No discount");
		}
		
		
	}

}
