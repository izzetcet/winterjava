package day20passbyvaluepassbyreferencedate;

public class Test1 {

	public static void main(String[] args) {
		
		String a= "";
		a=a+2;
		a=a+'c';
		a=a+false;
		
		System.out.println(a);
		System.out.println(a=="2cfalse"); //value is same but references are different
		
		System.out.println(a.equals("2cfalse")); // sadece degerleri karsilastirir.referenceleri degil
	}

}
