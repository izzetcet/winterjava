package day04ifelse;

import java.util.Scanner;

public class Day4PractiseIfElseSlide61Question4 {

	public static void main(String[] args) {
		
		/*
		 * Ask user ta enter any name of the week, then get second ,fourth,
and sixth letter of the day name and print them on the console,
in the same line.
For example; if the user enters “Monday” output will be “ody”
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter one day of the week");
		
		
		String dayName = scan.next().toUpperCase();
		
		
		if (dayName.equals("SUNDAY") || dayName.equals("MONDAY") || dayName.equals("TUESDAY") || dayName.equals("WEDNESDAY") &&
			dayName.equals("THURSDAY") || dayName.equals("FRIDAY") || dayName.equals("SATURDAY")) {
			char second = dayName.charAt(1);
			char fourth = dayName.charAt(3);
			char sixth = dayName.charAt(5);
			
			System.out.println(""+ second+fourth+sixth);	
		}else {
			System.out.println("Enter a valid day");
		}
		
		
								
		
		
	}

}
