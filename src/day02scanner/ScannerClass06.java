package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
System.out.println("enter your fullname");
String fullName = scan.nextLine();

System.out.println("enter spouse's name");
String spouseFirstName = scan.next();

scan.nextLine();   /*after using nextLine() if you use any other method like next() 
type scan.nextLine(); 
*/

System.out.println("enter your adres");

String adress = scan.nextLine();



System.out.println("user name:" + fullName);
System.out.println("Spouse name:" + spouseFirstName);
System.out.println("adress:" + adress);


	}

}


