package day10forloops;

import java.util.Scanner;

public class ForLoop04Repeat {

	public static void main(String[] args) {
		productOfInt();
		
	}
	/*INTERVIEW QUESTION
	 Ask user to enter begining and endin values.
	 Type code to calculate the multiplication of the integers from the beginnin to endin values
	 
	 
	 That question  can be asked like
	 Type code to calculate the factorial of given number
	 
	 */
	
	public static void productOfInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the starting integer value");
		int s = scan.nextInt();
		System.out.println("enter the ending integer value");
		int e = scan.nextInt();
	
		
		int product = 1;
		
		for( int i=s ; i<=e ; i++) {
			
			product = product*i;
		}
		  
		System.out.println(product);
		
		
		
		
		
		
		
	}
	
}
