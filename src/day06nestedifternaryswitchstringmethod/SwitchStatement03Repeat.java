package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class SwitchStatement03Repeat {

	/*
	 Ask user ta enter one of the ‘U’, ‘S’, and ‘A’.
	Then type a program by using “switch statement” to print
	“United” for ‘U’ “States” for ‘S’, and “America” for ‘A’
	 	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		
		
		char a = scan.next().charAt(0);
		
		switch (a) {
			case'U':
			case'u':
				System.out.println("UNITED");
				break;
			case'S':
			case's':
				System.out.println("STATES");
				break;
			case'A':
			case'a':
				System.out.println("AMERICA");
				break;
				default:
					System.err.println("not valid");
		scan.close();
		}
	}

}
