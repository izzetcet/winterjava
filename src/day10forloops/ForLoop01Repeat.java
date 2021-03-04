package day10forloops;

import java.util.Scanner;

public class ForLoop01Repeat {

	public static void main(String[] args) {
		//divThree();
		 reverse();
	}
	/*
	 Print all integers which are divisible by 3 from 100 to 23 on the console in the same line with a space among them
	 */
	
	public static void divThree() {
		
		for (int i=100 ; i>22 ; i-- ) {
			if(i%3==0) {
			System.out.println(i);
			}
		}			}
	
	/* INTERVIEW QUESTION
	 1)Ask user to enter a String
		 2)Print the String reverse
		 For example; Germany ===> ynamreG
	 */
	
	public static void reverse() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String to see it in reverse order");
		String str = scan.nextLine();
		
		for ( int i =str.length()-1 ; i>=0 ; i--) {
			
			System.out.print(str.charAt(i));
		}
	}
	
	
	
}
