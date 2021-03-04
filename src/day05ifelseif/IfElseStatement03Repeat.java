package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement03Repeat {
	/*
	 Ask user to enter any name of the days, then get second ,fourth,
    and sixth letter of the day name and print them on the console,
    in the same line.
    For example; if the user enters “Monday” output will be “ody”
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a day ofthe week");
		String day = scan.next();
		
		if((day.equalsIgnoreCase("monday")) || (day.equalsIgnoreCase("tuesday")) || (day.equalsIgnoreCase("wednesday")) ||
			(day.equalsIgnoreCase("thursday")) || (day.equalsIgnoreCase("friday")) || (day.equalsIgnoreCase("saturday")) ||
			(day.equalsIgnoreCase("sunday"))) {
			System.out.println();
			System.out.print(day.charAt(1));
			System.out.print(day.charAt(3));
			System.out.print(day.charAt(5));
		}else {
			System.out.println("enter a valid day");
		}
	
		 
		

		
		
		
		
	}

}
