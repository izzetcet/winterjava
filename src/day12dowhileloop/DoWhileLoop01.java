  package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
	
		won () ;

	}
/*
 Ask user to enter an integer
	     If the integer is even print on the console “You won!”
		 Otherwise ask user to enter another integer
 */
	
	public static void won () {
		Scanner scan = new Scanner(System.in);
		
		
		int s = 0;  // Bunu do loopunun disinda olusturmazsak while parantezinin icindeki hata verir
		
		
		do {
			
			System.out.println("enter an integer");
				s = scan.nextInt();if(s%2==0) {
				System.out.println("You won!!");
			}
			}while(s%2!=0);
		
		
		scan.close();
	}
	
	
	
	
}
	
	

