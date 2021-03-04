package day11whileloopdowhileloop;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		//While Loop
		int x=1;
		while (x>1) {
			System.out.println("Hello While Loop!");
		}
		
		
		//Do While Loop
		
		do {
			System.out.println("Hello Do While Loop!");
		} while(x>1);
		
				
		
	/*	
		Note 1: while-loop checks the condition first then execute the code in loop body
 	    do-while-loop executes the code first then checks the condition
 	    
 		Note 2: do-while-loop is executed at least once but while loop is possible not to be executed
 	*/
		
		 odd ();
	}
	
	/*
	 Create a method to print positive odd integers less then 100 by using do while loop
	 */

	public static void odd () {
	
		int i =1;
		
		do {
			if(i%2!=0) {
				System.out.print(i + " ");
				}
			i++;
		} while (i<=100);
	
	}
	

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

