package day02scanner;

public class OrderOfOperation01 {

	/* for mathematical operations we have some rules about order of operations
	 * do exponential op.
	 * do the  operations inside the parentesis
	 * complete multiplication and division op
	 * complete addition and subtraction op
	 */
	public static void main(String[] args) {
		
		
		int result1 = 5 + 2 * (16 - 2 * 5);  //17
		System.out.println(result1);
		
		
		
		
				//What is the remainder when you divide 17 by 3?
				//Modulus operator(%) is used to find reminder
				System.out.println(17%3);//2
				System.out.println(1235%11);//3
				
				//Modulus operator is used to find the digit of a number
				int c = 23456718;
				//What is the last digit of number c?
				System.out.println(c%10);//8
	
	}
}
