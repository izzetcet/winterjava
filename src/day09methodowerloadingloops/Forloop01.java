package day09methodowerloadingloops;

public class Forloop01 {
	
	
	public static void main(String[] args) {
		
		//printHello();

		//printInt();
		printIntDesc ();
		
	}
	/*
	 *Type code to print "Hello World" 10 times on the console...
	 */
	
public static void printHello() {
//	System.out.println("Hello World!");
//	System.out.println("Hello World!");
//	System.out.println("Hello World!");
//	System.out.println("Hello World!");
//	System.out.println("Hello World!");
	
	
	
	for(int i=1; i<=5; i++){
		System.out.println("Hello World!");
	}
	}
/*
 Type code to print integer from 5 to 12 on the console
 */

public static void printInt () {
	
	for(int i=5 ; i<13  ; i++) {
		System.out.print(i+ " ");
		
	}
}

/* 
 Type code to print integers from 12 to 5 on the console
 */
public static void printIntDesc () {
for(int i=12 ; i>=5  ; i--) {
	System.out.print(i+ " ");
}
}


}
