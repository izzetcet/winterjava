package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement06 {

	public static void main(String[] args) {
		
		
		/*
		 Ask user to enter annual salary,
		 if the salary is more than $80.000 output will be “I accept the offer”,
		 if the salary is between $60.000 and $80.000 out put will be “I negotiate to increase”,
		 otherwise output will be “I do not accept the offer.” 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your annual salary...");
		int s = scan.nextInt();
		
		if(s<0) {
			System.out.println("enter a valid salary");
		}else if (s>80000) {
			System.out.println("I accept the offer");
		}else if(s>60000) {
			System.out.println("I negotiate to increase");
		}else {
			System.out.println("I do not accept the offer");
		}
		
		
		
		
		
	}

}
