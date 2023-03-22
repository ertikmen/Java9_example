package week3.day03;

public class Practice005_Array {

	public static void main(String[] args) {
		// Stringi array e at ve yazdır
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;"
				+ "08-Artvin;09-Aydın;10-Balıkesir;42-Konya";
		
		String[] array1 = sehirler.split(";");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
	}

}
