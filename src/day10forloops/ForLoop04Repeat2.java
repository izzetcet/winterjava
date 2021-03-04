package day10forloops;

import java.util.Scanner;

public class ForLoop04Repeat2 {

	public static void main(String[] args) {
		
		 multTable ();
		
	}
/*
 Ask a user an integer to do a multuplication table 
 */
	public static void multTable () {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter an integer for to see multiplication table");
	int e = scan.nextInt();
	
	
	for(int i=1 ; i<=10 ; i++) {
		
		System.out.println(e + "x" + i + "=" + e*i);
		
		
	}
	
	
	
	
	}
	
	
	
	
	
}
