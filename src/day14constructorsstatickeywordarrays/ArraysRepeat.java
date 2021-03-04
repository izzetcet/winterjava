package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class ArraysRepeat {

	public static void main(String[] args) {
		
		int x[]=new int[5];// degerleri 0 olan 5 elemanli x olusturma
		System.out.println(Arrays.toString(x));// degerleri yazdirma
		
		//tek tek deger atama
		x[0]=11;
		x[1]=4;
		x[2]=5;
		x[3]=-3;
		x[4]=6;
		System.out.println(Arrays.toString(x));
		
		//Toplu deger atama
		String y[]= {"Ali","Can", "Veli"};
		System.out.println(Arrays.toString(y));
		
		char z[]= {'a','c','d','e','f'};
		System.out.println(Arrays.toString(z));
		
		//bir degeri yenisiyle degistirme
		z[2]='w';
		System.out.println(Arrays.toString(z));
		
		
		//butun degerleri degistirmek icin		
		String names[] = {"Hasan","Can","Alex"};
		for (int c = 0 ; c<names.length ; c++) {
			names[c]= "Mehmet";
			}
		System.out.println(Arrays.toString(names));
		
		// elemanlari alt alta yazdirmak icin
		for (int i=0 ; i<z.length; i++) {
			
			System.out.println(z[i] + " ");
		}
			
		// elemanlari  toplamak icin
		int i=0;
		int sum=0;
		while (i<x.length) {
			sum = sum + x[i];
			i++;
		}
		System.out.println(sum);
		
		//elemanlardan birindeki harfi degistirmek icin
		
		
		for (int m =0 ; m<y.length ; m++) {
			y[m]=y[m].replace("i", "*");
			}
		System.out.println(Arrays.toString(y));
	}

}
