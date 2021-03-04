package day02scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		// AUto Widening : typecasting done by java
		byte b1 = 112;
		
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
		
		
		
		
		// Explicit Narrowing:  do not by java automatically. 
		
		int i2 = 120;
		short s1 = (short)i2;
		
		System.out.println(i2);
		System.out.println(s1);
		
		
		
		
		float f1 = 2.3f;
		float f2 = 2.3F;
		float f3 = (float)2.3;
		double f4 = 2.3;
		
		//If you use “Explicit Narrowing” with the numbers which are not in the interval
				//then you will get different results. The result will be calculated according to the 
				//modulus operation.
		short s2 = 300;	
		byte b4 = (byte)s2;
		
		System.out.println(s2);
		System.out.println(b4);
		
		
		
		
		
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3/i4); //virgulden onceki yazilir
		
	
		//If you use different data types in mathematical operations, the result data type
				//will be the largest data type
		int i5 = 5;
		double d1 = 2;
		
		System.out.println(i5/d1);
		
		
		
		
		
		
		
		
		
	}

}
