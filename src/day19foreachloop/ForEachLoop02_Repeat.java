package day19foreachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop02_Repeat {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter 5 full names(No middle name)
			 Get the initials of the first and the last name, concatenate them and store in a list
			 Print the list on the console
			 	Example; if user enters “Ali Can”, “Veli Han”, “Kemal Mert” ==> [AC, VH, KM]	
		 */
		
		List<String> names = new ArrayList<>();
		
		
		Scanner scan =new Scanner(System.in);
//		System.out.println("enter name and surname");
//		String name1=scan.nextLine();
//		names.add(name1);
//		System.out.println("enter name and surname");
//		String name2=scan.nextLine();
//		names.add(name2);
		
		
		
		for (int i = 0; i <5; i++) {
			System.out.println("enter name and surname");
			String name1=scan.nextLine();
			names.add(name1);
	}
	
		for (String str : names) {
			System.out.print(str.substring(0,1));
			System.out.print(str.substring(str.indexOf(" ")+1,str.indexOf(" ")+2 )+" ");
		}
	}

}
