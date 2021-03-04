package day10forloops;

import java.util.Scanner;

public class ForLoop05Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pine ();
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
	
	public static void pine () {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter an integer for to do pine");
	int row = scan.nextInt();
	
for(int k=1 ; k<=row ; k++) {
	
	for (int i = row-k ; i>0 ;  i--) {
		
		System.out.print(" ");
	}
	for ( int j = 1 ; j<=k; j++) {
		System.out.print("* ");
	}
		System.out.println();
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
}
