package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01Repeat {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		
		list.add(10);
		list.add(53);
		list.add(25);
		list.add(200);
		list.add(12);
		
		List<String> list1 =new ArrayList<>();
		
		list1.add("Veli");
		list1.add("Ali");
		list1.add("Deli");
		list1.add("Kemal");
		list1.add("Sunal");
		
		
//.......................................................	
		//Use "for each loop" to print all elements on the console in the same line
		//with a space between the elements
		for(Integer w: list) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		for (String w : list1) {
			System.out.print(w + " ");
		}
//..........................................................	
		System.out.println();
		//Use "for-each loop" to print even elements in the int list

		//1.way
		for(Integer w: list) {
			if(w%2==0) {
				System.out.print(w+ " ");
			}
		}
		
		System.out.println();
		//2.way
		for(int w: list) {
			if(w%2!=0) {
				continue;
			}
			System.out.print(w+ " ");
		}
//............................................................................................	
		System.out.println();
		//Use "for-each loop" to print last 3 elements in the list
		
		for (String w: list1) {
			if(list1.indexOf(w)>=list1.size()-3) {
				System.out.print(w+" ");
			}
		}
		
		System.out.println();
		for (Integer w : list) {
			if(list.indexOf(w)<list.size()-3) {
				continue;
			}
			System.out.print(w+" ");
		}
				
	}
}
