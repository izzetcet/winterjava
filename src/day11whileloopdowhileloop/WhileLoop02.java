package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		
		
		
		factor () ;
	}
/*
	Type java code by using while loop,
    Write a program to count the factors of an integer which is entered by user.
    Factors of 12 = 1, 2, 3, 4, 6, 12
*/
	
	
	public static void factor () {
	Scanner scan =new Scanner(System.in);	
	System.out.println("enter an integer");
	int num = scan.nextInt();
	int x = 1;
	
	while(x<=num) {
		  
			if(num%x==0) {
				System.out.print(x + ", ");
			}
			
			x++;
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
