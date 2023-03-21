package week3.day02;

import java.util.Scanner;

public class Practice004_ücünSwitchhali {

	public static void main(String[] args) {
		/*
		 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine  Ki
		 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter IBAN");
		String IBAN = scanner.nextLine().toUpperCase();
		String kontrol=IBAN.substring(0,3);
		kontrol.trim();
		switch (kontrol) {
		case "TR ":
			System.out.println("Yurtiçi işlemler");
			String bankaNoString=IBAN.substring(IBAN.length()-4);
			switch (bankaNoString) {
			case "5001":
				System.out.println("Ziraat Bankası");
				break;
			case "5002":
				System.out.println("Garanti Bankası");
				break;
			case "5003":
				System.out.println("İş Bankası");
				break;
			default:
				System.out.println("Diğer");
				break;
			}
			
			break;
		case "OTH":
			System.out.println("Yurtdışı işlemler");
			String bankaNo2=IBAN.substring(IBAN.length()-4);
			switch (bankaNo2) {
			case "2000":
				System.out.println("Kıta içi işlemler");
				System.out.println(IBAN.replace("OTH","Kİ"));
				break;

			default:
				System.out.println("Kıta dışı işlemler");
			    System.out.println(IBAN.replace("OTH","KD"));
				break;
			}
		default:
			System.out.println("Yanlış IBAN girdiniz.");
			break;
		}
		
		
		
	}

}
