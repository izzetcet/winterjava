package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class StringManipulation01Repeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		
		/*
		 Ask user to enter a String and a character, then check if the String has the character o not
		 */
		
		System.out.println("enter a String");
		String str = scan.nextLine();
		System.out.println("enter a character");
		char ch = scan.next().charAt(0);
		
		
	String result=	str.indexOf(ch)==-1? "The String has no the character" : "The String has the character";
	
	System.out.println(result);
		
		
	}

}
