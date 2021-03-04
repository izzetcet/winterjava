package day10forloops;

import java.util.Scanner;

public class ForLoop06Repeat {

	public static void main(String[] args) {
		
		drawRevTriangle();
		
		
		
		
	}
	/*
	Create the following image by getting the number of rows from user
	
		
					.
				    .
				 * * * *
				  * * *
				   * *
				    *

*/
	
	public static void drawRevTriangle() {
		
		Scanner snc=new Scanner(System.in);
        System.out.println("enter a number");

        int x=snc.nextInt();

        int a=0;

        for(int i=x; i>0; i--){

            for (int y=a; y>0;y--){
                System.out.print(" ");
            }

            for (int j=0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
         a++;
		
		
}
}}