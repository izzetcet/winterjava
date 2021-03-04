package day10forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		checkPalindrome();
		
		
	}
/*INTERWIEW QUESTION
 		1)Ask user to enter a String
		2)Check the String if it is “Palindrome” or not
		FOR EXAMPLE: "aba" and "aba"
 */
	
	public static void checkPalindrome() {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String to see if it is Palindrome or not");
		String str = scan.nextLine();
		
		String reverse = "";
		for (int i =str.length()-1 ; i>=0 ; i--) {
			
			reverse = reverse + str.charAt(i);
			}
		
		if(str.equals(reverse)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
		
		scan.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
