package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		
		System.out.println(" Enter your first name and last name");
		
		// If you wanna a String data from user use nextLine() method
		String fullName = scan.nextLine();
		
		
		System.out.println("your full name is:" + fullName);	
		
		System.out.println( "enter your kids first name");
		String kidsFirstName = scan.next();
		
		System.out.println("kids first name is:" + kidsFirstName); */
		
	System.out.println("bir sayi giriniz");
	int a = scan.nextInt();
	
	if (a%2 == 0) {System.out.println("the integer is odd");
		
	}
	
		System.out.println("baska bir sayi giriniz");	
	int b = scan.nextInt();
	
if (b%2==1) {System.out.println("the integer is even");
	


				
			}
	
	}

}
