package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05Repeat {

	/*
	 Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mark...");
		int a = scan.nextInt();
		
		if(a<0) {
			System.out.println("enter a valid number");
		}else if(a<=100) {
			System.out.println("your grade is: " +"A");
		}else if(a<80) {
			System.out.println("your grade is: " +"B");
		}else if(a<60) {
			System.out.println("your grade is: " +"C");
		}else if(a>=0 && a<50) {
			System.out.println("your grade is: " +"D");
		}else {
			System.out.println("enter a valid number");
		}
		
		
		
		
		
		
		}

	}


