package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		
		checkPassword();

	}

	/*
	 Ask user to enter password.
		 If the password has more than 6 characters print �It is okay�
		 Otherwise, print �Make the password longer than 6 characters� and ask user to enter a new password
	 */
	
	public static void checkPassword() {
	Scanner scan = new Scanner(System.in);	
	
		String password = "";
		
		do {
			System.out.println("enter your password");	
			password = scan.nextLine();
			if(password.length()>6)	{
				System.out.println("It is okay");
			}else {
				System.out.println("Make the password longer than 6 characters");
			}
		}while (password.length()<=6);
		
	}
	
	
	
	
	
}
