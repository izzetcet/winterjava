package day11whileloopdowhileloop;

import java.util.Scanner;


public class WhileLoop01 {

	public static void main(String[] args) {
		
		sumOfDigits ();
		
	}
	/*INTERVIEW QUESTION
	 Type java code using by while loop
	 Write a program thats prompts the user to input an integer
	 It should then find sum of the digit that number
	 123==> 1+2+3=6
	 */
	public static void sumOfDigits () {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter an integer");
	int number = scan.nextInt();
	
	
	int sum = 0;
	
	while (number != 0) {
		
		sum = sum + number%10;
		
		number = number / 10;
	}
	System.out.println(sum);
	
	}
}
