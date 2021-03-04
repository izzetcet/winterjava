package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61Question1 {
public static void main(String[] args) {
	/* 
	 * Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
else output will be “No need to work”
	 */
	
	Scanner scan = new Scanner(System.in);
	
		
	System.out.println("Enter your age");
	int age = scan.nextInt();
	
	
	
	if (age<=18 ) {
		System.out.println("Enter an age bigger than 18");
	} 
	
	
	
	if (age>18 && age<65) {
		System.out.println("You should work");
	} 
	if(age>=65){
				System.out.println("No need to work");	
		} 
	
	}}

	
	
	
	
	
	

	

	
	


