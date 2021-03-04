package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter your fist name");
		char firstNameInitial = scan.next().charAt(0);
		
			
		System.out.println("enter your last name");
		char lastNameInitial = scan.next().charAt(0);
		
		System.out.println("Initial of the first name is" + firstNameInitial);
		System.out.println("Initial of the last name is" + lastNameInitial);
		
		System.out.println(firstNameInitial + lastNameInitial);  // USED ASCII cods 
		System.out.println("" + firstNameInitial + lastNameInitial); // write just character no ASCII
	
	
	
	
	
	
	}

}
