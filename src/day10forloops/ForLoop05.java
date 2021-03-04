package day10forloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		
		
		
		drawTriangle();
		
		

	}
/*
	1)Ask user to enter a positive integer
	 2)Create and print the following image on the console
						       *
						      * *
						     * * *
						    * * * *
						       .
						       .
						       .
	*/
	
public static void drawTriangle() {	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a integer");
	int s = scan.nextInt();
	
	//to run the inner codes for every row . SATIR ICIN
	for(int j=1; j<=s;      j++) {
		
		//to draw " " . BOSLUK YAZMAK ICIN
		for(int i=s-j; i>0;      i--) {
			System.out.print(" ");
		}
		
		// to draw "* "  . YILDIZ VE BOSLUK YAZMAK ICIN
		for(int k=1; k<=j;       k++) {
			System.out.print("* ");
		}
	//to move pointer to next line .BIR ALT SATIRA GECMEK ICIN
		System.out.println();
	}
	
	scan.close();

	
	
	
}
	
	
	
	
}
