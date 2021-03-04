package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {
	
		
		sumOfAllInt();
		
		
	}
	/*
	 Find the sum of all integer from 10 to 200
	 */
	
	public static void sumOfAllInt() {
		
		int sum = 0;
		
		for (int i=10	; i<201	;	i++) {
			
			sum = sum+i; //sum+=1; works as well
			// if you want to see the sum value for every loop, put "System.out.println(sum);" inside the :for loop"
		}
		//if you type "System.out.println(sum);" after the "for loop" it will display the final value of sum
		System.out.println(sum);
	
	
	
	
	
	}
	
	
	
	
	
}
