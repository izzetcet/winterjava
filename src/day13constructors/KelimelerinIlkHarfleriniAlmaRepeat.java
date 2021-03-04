package day13constructors;

public class KelimelerinIlkHarfleriniAlmaRepeat {

	public static void main(String[] args) {
		
		String s = "ALI VELI DELI";
		
		
		String result = " ";
			
		if(s.charAt(0)!= ' ') {
			result = result + s.charAt(0);
		}
		
		for (int i=0 ; i<s.length() ; i++) {
		if (s.charAt(i)== ' ') {
			result = result + s.charAt(i+1);
		}
		}
		System.out.println(result);
		
				
			}}
	
	
	
	
	

