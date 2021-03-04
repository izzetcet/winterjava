package day02tasks;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter lenght1 of triangle:");

	byte lenght1 = scan.nextByte();
	
	System.out.println("enter lenght2 of triangle:");

	byte lenght2 = scan.nextByte();
	
	
	System.out.println("enter lenght3 of triangle:");

	byte lenght3 = scan.nextByte();
	
	
	System.out.println("Perimeter of triangle:" + (lenght1+lenght2+lenght3));
	}

}
