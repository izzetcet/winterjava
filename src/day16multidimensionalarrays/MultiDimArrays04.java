package day16multidimensionalarrays;

public class MultiDimArrays04 {

	public static void main(String[] args) {
		
		//Print Bee on the console
		String arr[][]= {{"A","B", "Y", "M"},{"e", "K", "Z"},{"L","X", "e", "S"}};

		String b = "";
		for (int i = 0 ; i<arr.length ; i++) {
			
			for(int j=0 ; j<arr[i].length; j++) {
				
				if(arr[i][j].equals("B")) {
					b = b + arr[i][j];
					break; // kullanmasak ta sonuc verir ama fazladan, aradigimiz elemanlardan sonrakileri de kontrol eder.
				}else if(arr[i][j].equals("e")) {
					b = b + arr[i][j];
					break;
				}
			}
		}
		System.out.println(b);
	}
}
