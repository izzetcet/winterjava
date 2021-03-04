package day03wrapperclassconcatenatelogicaloperarors;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
		
		System.out.println("enter three digit integer");
		
		int num = scan.nextInt();
		
		
		int c = num%10;
		
		int num1 = num/10;
		int b = num1%10;
		
		int a = num/100;
		
		
		
		System.out.println("The sum of digit is: " + (a+b+c));
		
		 
	}

}
