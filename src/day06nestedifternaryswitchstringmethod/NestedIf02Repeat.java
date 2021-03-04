package day06nestedifternaryswitchstringmethod;

import java.util.Scanner;

public class NestedIf02Repeat {
	/*
	 *Type java code by using nested if() statement.
	Ask user to enter a password
	
	If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
	“Valid Password�? otherwise the output will be “Invalid Password�?
	For example; Ali==>Valid password      ali==>invalid      Mark==>invalid
	
	If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
	“Valid Password�? otherwise the output will be “Invalid Password�?
	For example; zoe==>Valid password      Zoe==>invalid      john==>invalid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password...");
		
		// FIRSTWAY
		String psw = scan.next();
		
		
		if(psw.charAt(0)>='A' && psw.charAt(0)<='Z') {
			if (psw.charAt(0)>='A') {
				System.out.println(psw + "is valid");
			}else {
				System.out.println(psw + "is not valid");
			}
		}else if (psw.charAt(0)>='a' && psw.charAt(0)<='z') {
			if (psw.charAt(0)>='z') {
				System.out.println(psw + "is valid");
			}else {
				System.out.println(psw + "is not valid");
			}
		}else {
			System.out.println("enter a valid password");
		}
	
		
		
		//II.WAY
		/*
		 String psw = scan.next();
		 
		 if(psw.charAt(0)=='A' || psw.charAt(0)=='z') {
			 System.out.println(psw+" is valid password");
		 }else if (psw.charAt(0)!='A' && psw.charAt(0)!='z') {
			 System.out.println(psw + " is not valid password");
		 }else {
			 System.out.println("enter a  valid password");
		 } */
			 
		
		 
	
		
		
		
		
		//3.WAY
		/*
		char p = scan.next().charAt(0);
	
				if (p == 'A' ) {
			System.out.println("Valid password");			
		}else if (p=='z') {
			System.out.println("Valid password");
		}else {
			System.out.println("Not valid password");
		}  */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
