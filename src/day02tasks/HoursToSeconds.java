package day02tasks;

import java.util.Scanner;

public class HoursToSeconds {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value of hour:");
		
		long hour = scan.nextLong();
		
		System.out.println(hour + " hour = " + (hour*60*60 ) + " second");
		

	}

}
