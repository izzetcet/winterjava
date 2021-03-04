package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

	public static void main(String[] args) {
		
		String str = "Java is Java";
		
		// 12) endsWith() is used to check the last caharacter in a String.
		// 	   endsWith() is used with String do not use it whit chars.
		// 	   endsWith() can be used multiple characters as well
		// 	   endsWith() return boolean.
		System.out.println(str.endsWith("a"));//true
		System.out.println(str.endsWith("x"));//false
		System.out.println(str.endsWith("ava"));//true
		
		
		//13) startWith() is used to check the last caharacter/s in a String.
		// 	  startWith() is used with String do not use it whith chars.
		// 	  startWith() can be used multiple characters as well
		// 	  startWith() return boolean.
		
		System.out.println(str.startsWith("J"));//true 
		System.out.println(str.startsWith("Java"));//true 
		
		// If you want to check the cahracter in aspecific index do the the following
		System.out.println(str.startsWith("i", 5));// true . 5.indexten itibaren olan kisim  "i" ile mi basliyor?
		System.out.println(str.startsWith("is ", 5));// true
	
		
		
		//14 isEmpty() is used check if a S tring has zero character or not
		//            If a String has no any character isEmpty()  return "true", otherwise return "false'
		
		System.out.println(str.isEmpty());// false. Cunku str Stringi bos degil.
		
		String str2="";
		
		System.out.println(str2.isEmpty());// true.Cunku str2 Stringi bos.  
		
		
		
		
		
		//15) replace() is used to change a spesific character/s to another one.
		
		System.out.println(str.replace("a", "x")); //Jxvx is Jxvx
		System.out.println(str); // metod uygulaninca Stringlerin degeri degismez.
		System.out.println(str.replace("ava", "x"));//Jx is Jx
		System.out.println(str.replace("a", "xxx"));//Jxxxvxxx is Jxxxvxxx
		
		//  replace() method can be used to delete character/s 
		System.out.println(str.replace("a", ""));//Jv is Jv		
		// In replace() method char and String  both can be used. 
		System.out.println(str.replace('a', 'x')); //Jxvx is Jxvx
		
		
		
		//16) replaceAll() does the same with the replace().
		//  But there are some difference 1) In replaceAll() you cannot use chars, in replace() you can
		//								  2) In replaceAll() oyu can use "Regular Expression"s 
		System.out.println(str.replaceAll("a", "x")); //Jxvx is Jxvx
		//System.out.println(str.replaceAll('a', 'x'));
		
		
		String str3 = "Java123 learn, earn_money!!  .";
		
		// Regular Expressions===> 1) \\s:space character
		//						   2) \\S : all cahracters except space character
		//						   3) \\w: a-->z    A-->Z  _     0-->9
		//						   4) \\W: All characters except  a-->z    A-->Z  _     0-->9
		//						   5) \\d: 0-->9 
		//						   6) \\D: All character except 0-->9
		
		System.out.println(str3.replaceAll("\\s", "*")); //Java123*learn,*earn_money!!**.
		System.out.println(str3.replaceAll("\\S", "*")); //******* ****** ************  *
		System.out.println(str3.replaceAll("\\w", "*")); //******* *****, **********!!  .
		System.out.println(str3.replaceAll("\\W", "&"));//Java123&learn&&earn_money&&&&&
		System.out.println(str3.replaceAll("\\d", "@")); //Java@@@ learn, earn_money!!  .
		System.out.println(str3.replaceAll("\\D", "+"));//++++123+++++++++++++++++++++++
		
		
		
		// 17) replaceFirst() changes just the first occurence of the caharacter...
		System.out.println(str3.replaceFirst("a", "*"));//J*va123 learn, earn_money!!  .
		
		
		//18) substring() is used to get a part of the String by using indexes.
		
		String str4 = "Java is the best";
		
		System.out.println(str4.substring(3)); //a is the best ==>3.index ve sonrasini verir
		System.out.println(str4.substring(7)); //  the best  ==> 7/index ve sonrasi.bosluk dahil
		System.out.println(str4.substring(0));//Java is the best
		System.out.println(str4.substring(15));//t
		System.out.println(str4.substring(16)); // nothing.t'den sonraki imlecin oldugu yeri verir.
		//if you use any index greater to the length, it return "StringIndexOutOfBoundsException"
		//System.out.println(str4.substring(17));
		
		
		/*
		 Ask user to enter a String
		 If the first and the last character of the String are same print "Wooow"
		 otherwise, print "Hmmm!" on the console
		 */
		
//		Scanner scan= new Scanner(System.in);
//		
//		System.out.println("enter a String...");
//		
//		String s = scan.nextLine();
//		
//		// length()-1 everytime gives you the last index. length toplam karakter sayisi demek.
//		// -1, son siradaki harfi vermesi icin eklenir. 
//		String last = s.substring(s.length()-1);   // mesela 16 harfli bir String icin length() 16'dir.16-1=15 cikar ve bu son harfin indexidir.
//		
//		String first = s.substring(0, 1); // sifirinci indexten basla 1.indexe kadar al ve dur. 1.yi alma
//		
//		if (first.equals(last)) {
//			System.out.println("Wooow");
//		}else {
//			System.out.println("Hmmm");
//		}
		
		///////
		
		String str5 = "Java is an OOP language";
		System.out.println(str5.substring(5, 14)); //is an OOP .   5.INDEXTEN BASLA 14.YE KADAR AL. 14.YUU ALMA
		System.out.println(str5.substring(2,3));// v 
		// if starting and ending indexes are same you get nothing
		System.out.println(str5.substring(2,2));// nothing
		// in substring() starting index cannot be larger than ending index.
		// if you do it you get "StringIndexOutOfBoundsException"
		System.out.println(str5.substring(3,2));
		
		/*
		 When we type codes we may get 2 types of error messages
		 1) While you type code you may get "ren underline", this type of error is called "COMPILE TIME ERROR"
		 	some red messages on the console. That kind of errors are called "RUNTIME ERROR" 
		 */
		
		
		
		
		
		
	}

}
