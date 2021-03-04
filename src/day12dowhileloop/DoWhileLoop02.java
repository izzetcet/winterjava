package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		
		
		initial();
		
	}
	/*
	 Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
	 */
	
	public static void initial() {
	Scanner scan = new Scanner(System.in);
		
		char i;
		
		do {
			System.out.println("enter your name");
			i = scan.next().charAt(0);
			if(i>='a' && i<='z') {
				System.out.println("Make the initial upper case");
			}
			
		}while (!(i>='A' && i<='Z'));
		
		System.out.println("You did it right");
		
		scan.close();
//
//		System.out.println("enter your name");  // disarida oldugundan bir kez gosterilir
//		char i;
//		
//		do {
//			
//			i = scan.next().charAt(0);
//			if(i>='a' && i<='z') {
//				System.out.println("Make the initial upper case");
//			}else{
//			    System.out.println("You did it right");
//		}
//			
//		}while (!(i>='A' && i<='Z'));
//		
//		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
