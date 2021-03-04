package day02scanner;

import java.util.Scanner;

public class ScannerClass03 {

	public static void main(String[] agrs)	{

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the length of the rectangle");
	double lentgh = scan.nextDouble();
	
	
	System.out.println("Please enter the width of the rectangle");
	double width = scan.nextDouble();
	
	
			System.out.println("Area:" + width*lentgh);	
	        System.out.println("Perimeter:" + 2*(width+lentgh));
	
	}
	
}
