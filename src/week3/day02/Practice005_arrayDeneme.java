package week3.day02;

import java.util.Scanner;

public class Practice005_arrayDeneme {

	public static void main(String[] args) {
		
		/*
		 * Birden fazla veriyi içinde tutar. 
		 * Array oluştururken
		 
		String [] dizi=new String [3];
		dizi[0]="java";
		// dizi[4]="xxx"; verirsek out of bounds hatası verir.
		String[] series2= {"Java","Spring","React"};
		boolean[] series3= new boolean[10]; // default değeri false
		int [] series4=new int[6]; // default değeri 0;
		Integer[] series5=new Integer[6]; // default değeri null..***
		*/
		
		
		/*
		 * Dışarıdan bir ülke ismi alıp bu dizide olup olmadığını kontrol edelim.
		 * yoksa girdiğiniz ülke bulunamadı diye çıktı verelim.
		 */
		String[] series= {"Türkiye","Japonya","Moğolistan","Fransa","Danimarka","Norveç"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a country");
		String country=scanner.nextLine();
		int count=0;
		//boolean kontrol=false;
		for (int i = 0; i < series.length; i++) {
			if (series[i].equals(country)) {
				System.out.println("Ülke bulundu.");
				//kontrol=true;
				count++;
				break;
			}
		
		}
		if (count==0) { // kontrol==false ise ülke bulunamadı.   (alternatif çözüm)
			System.out.println("Ülke bulunamadı.");
		}
	}

}
