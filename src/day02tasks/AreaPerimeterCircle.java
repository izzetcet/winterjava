package day02tasks;

import java.util.Scanner;

public class AreaPerimeterCircle {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
System.out.println("enter radius of circle:");
float radius = scan.nextFloat();

float pi = 3.14159f;


System.out.println("Area of circle:" + (pi*radius*radius));
System.out.println("Perimeter of circle:" + (2*pi*radius));


	}

}
