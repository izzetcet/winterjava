package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61Question6 {

public static void main(String[] args) {
	
/*
 * Type java code by using if-else statement,
Write a program to print absolute value of a number entered by user.
Absolute Value: If the number is positive or zero return the number itself
If the number is negative return the number after multiplying by -1
 */
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter an integer");
		
		int a = scan.nextInt();
		int b = -1;
		if(a>=0) {
			System.out.println(a);
		}else {
			System.out.println(b*a);
		}
	}

}
