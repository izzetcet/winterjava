package day10forloops;

public class ForLoop03Repeat {

	public static void main(String[] args) {
		sumInt ();
	}
	/*
	 Find the sum of all integer from 10 to 200
	 */
	
	public static void sumInt () {
		
		int sum = 0;
		 for ( int i= 10 ; i<201 ; i++){
			
			 sum = sum + i;
			 
		 }
		
		System.out.println("sum of from 10 to 200 is: " + sum );
		
	}
	
	
	
	
}
