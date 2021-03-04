package day02tasks;

import java.util.Scanner;

public class MilToKilometer {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value of mil:");
		double mil = scan.nextDouble();
				
				System.out.println(mil + " mil = " + (mil*1.6) + " km");
		
						
	
	}

}
