package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02Repeat {
	/*
	  Ask user to enter a character, then check whether the character is alphabet or not
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character to check if it is in alphabet or not");
		
		char c = scan.next().charAt(0);
		
		if ((c>='a') && (c<='z') || (c>='A') && (c<='Z')){
			System.out.println(c + " is in alphabet");
		}else {
			System.out.println("the character is not in alphabet");
		}
		
	}

}
