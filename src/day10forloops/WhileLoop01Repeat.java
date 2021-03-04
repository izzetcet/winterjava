package day10forloops;

public class WhileLoop01Repeat {

	public static void main(String[] args) {
		//odd2();
   	divSixEight ();
	}
	/*
	 Type a program to print odd integers from 4 to 25 on the console
	 1) Use for-loop
	 2) Use while-loop
	 */
		
	public static void odd () {
		for (int i=4 ; i<26 ; i++) {
			if(i%2 !=0) {
				System.out.print(i + " ");
			}}}


	public static void odd2() {
		
		int j=4;
			 
		 while(j<26) {
			if(j%2!=0) {
				System.out.print(j + " ");
			}
			 j++;
		 
	}
	}
	
		/*
		 Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
		 */
	
	public static void divSixEight () {
		
		int i = 500;
		while(i>24) {
			if(i%6==0 && i%8==0) {
				System.out.print(i + " ");
			}
			i--;	
			}
	}
	
	
	
	
	
	
	
	
	
	
	
}
