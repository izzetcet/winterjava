package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61Question5 {

	public static void main(String[] args) {
		
		/*
		 * Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your password");
		String pass = scan.nextLine();
		
		System.out.println(pass);
		
			if (pass.equals("Java Learner"))   {
				
				System.out.println("The password is true");
			}else{
				System.out.println("The password is false");
			}
				
	}

}
