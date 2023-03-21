package week3.day02;

import java.util.Scanner;

public class Practice003 {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
* 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
* yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
* Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
* işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine 
* Ki 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter IBAN");
		String IBAN=scanner.nextLine();
		if (IBAN.startsWith("TR")) {
			System.out.println("Yurtiçi");
			if (IBAN.endsWith("5001")) System.out.println("Ziraat");
			if (IBAN.endsWith("5002")) System.out.println("Garanti");
			if (IBAN.endsWith("5003")) System.out.println("İş Bankası");
		}else {
			System.out.println("Yanlış IBAN girdiniz.");
		}
		if (IBAN.startsWith("OTH")) {
			System.out.println("Yurtdışı");
			if (IBAN.endsWith("2000")) System.out.println("Kİ "+IBAN.substring(4));
			else {
				System.out.println("KD "+IBAN.substring(4));
			}
		}else {
			System.out.println("Yanlış IBAN girdiniz.");
		}
	}

}
