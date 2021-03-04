package day03wrapperclassconcatenatelogicaloperarors;

public class Concatenation01 {

	public static void main(String[] args) {
		

		String s = "Java";
		String t = "is easy";
		System.out.println(s + " " + t);
		
		
		
		int a = 3;
		int b = 4;
		String s1 = "Java";
		
		System.out.println(s1+a);
		System.out.println(a + s1 + b);
		System.out.println(s1+a + b);
		System.out.println(s1 + (a+b));
		
		
		
		int d = 2;
		int e = 3;
		String f = "Java";
		
		System.out.println(((d+e)*d*d*e + (e-d)) + f +(d-e)); // 61Java-1
		
		
		System.out.println((d*e)+((e-d) + f)+ (d-e));
	}

}
