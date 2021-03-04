package day03wrapperclassconcatenatelogicaloperarors;

public class LogicalOperator01 {

	public static void main(String[] args) {
		
		/*
		
		
		System.out.println(7==6+2); //false
		System.out.println(3!=5-2); //false
		System.out.println(4>56); //false
		System.out.println(1>=11); //false
		System.out.println(6>=6); //true
		
		System.out.println((3<5)&&(4>=4));//true
		System.out.println((5<3) || (5>10) || (9<15) || (5==9)); //true
		
		//WHAT IS THE DIFFERENCE BETWEEN && AND & */
		
		System.out.println((8>4) & (5>6) & (0==0)); // butun kosullari denetler
		System.out.println((5>8) && (5>1) && (0==0)); // Kosullari sirayla denetler ilk  FALSE'u bulunca FALSE sonucunu
														//verir.Daha hizli calisir
	}

}
