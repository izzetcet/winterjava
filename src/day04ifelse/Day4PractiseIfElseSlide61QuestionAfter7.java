package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61QuestionAfter7 {

	public static void main(String[] args) {
		
		/*
		 * Ask user ta enter a 4 digits integer, then print the sum of the first
and the last digit of the number on console.
For example; if user enters 1234 you will add 1 and 4,
then print on the console 5
		 */
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Enter a 4 digit integer");
		int a = scan.nextInt();
		
		int b = a%10;
		int c = a/1000;
		
		System.out.println(b + c);
		
		
		
		
	}

}
