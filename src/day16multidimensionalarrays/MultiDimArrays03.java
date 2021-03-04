package day16multidimensionalarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
		
		String arr[][]= {{"A","B"},{"K", "e"},{"L","X", "e"}};
		//By using multidimensional array print "Bee" on the console
		
		//I.WAY
		String s = "";
		
		for( int i=0 ; i<arr.length ; i++) {
			
			for(int k=arr[i].length-1 ; k>arr[i].length-2 ; k-- ) {
				s = s + arr[i][k];
			}
		}
		System.out.println(s);
		
		//2.WAY;
		String sum = "";
		for( int j=0 ; j<arr.length ; j++) {
			sum = sum + arr[j][arr[j].length-1];
			}
		System.out.println(sum);
	//..................................................................................
		
		
		//Find the multiplication firs element the every array
		int arr1[][]= {{32,12,11},{21,34},{3}};
		
		int a =1;
		for (int k=0 ; k<arr1.length ; k++) {
			
			a= a * arr1[k][0] ;
		}
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
