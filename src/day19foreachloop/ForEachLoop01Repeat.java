package day19foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01Repeat {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(25);
		list.add(200);
		list.add(12);
		
		List<String> list1 =new ArrayList<>();
		
		list1.add("Veli");
		list1.add("Ali");
		list1.add("Deli");
		
		
	//.......................................................	
		for(Integer w: list) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		for (String w : list1) {
			System.out.print(w + " ");
		}
	//..........................................................	
	

		
	}
}
