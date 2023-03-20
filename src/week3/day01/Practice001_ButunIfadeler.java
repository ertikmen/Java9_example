package week3.day01;

public class Practice001_ButunIfadeler {

	public static void main(String[] args) {
		String word="Merhaba Dünya";
		System.out.println(word.charAt(word.length()-1));
		String word2=" Merhaba Dünya ";
		
		
		System.out.println("////////////////////////////////////////");
		System.out.println(word2.trim()==word);
		System.out.println(word2.trim().equals(word));
		System.out.println("/////////////////////////////////////");
		
		
		
		System.out.println(word.indexOf("r"));
		System.out.println(word.indexOf("x")); // eğer yoksa -1 döndürür.
		System.out.println(word.indexOf("x"));
		
		
		System.out.println(word2.trim()); // trim başta ve sonda boşlukları siler.
		System.out.println(word.indexOf("a",5)); // yazılı indexten sonrası için bakar.
		
		System.out.println(word.lastIndexOf("a")); // son geçtiği index değerini bulur.
		
		
		System.out.println(word.substring(7)); //7 dahil kalanı alır.
		System.out.println(word.substring(7,10)); // 7 den 10 a kadar olanı alır 10 u almaz.
		
		System.out.println(word.replace("a","x")); // değiştirme
		System.out.println(word);  // diğerleri anlık atama yapar kayıt olmaz.
		
		System.out.println(word.endsWith("a")); // a ile mi bitiyor true false..
		System.out.println(word.startsWith("m")); // false döner büyük olduğu için
		
		System.out.println(word.concat(" xxxxx")); // sonuna ekler + işareti de kullanılır.
		System.out.println(word.contains("ha")); // içinde bulunup bulunmadığını döndürür.
		System.out.println(word.toLowerCase());// küçük harfe çevirir.
		System.out.println(word.toUpperCase());// büyük harfe çevirir.
		
		System.out.println(word.equals("Merhaba Dünya")); // eşit mi değil mi kontrol eder.
		System.out.println(word.equals("Merhaba dünya")); // false çevriir.
		System.out.println(word.equalsIgnoreCase("merhaba dünya")); // her türlü bakar.
		
		String word3="Mustafa";
		String word4="Mustafa";
		String word5=new String("Mustafa");
		
		System.out.println(word3==word4);
		System.out.println(word5==word4); // referansları farklı olduğu için hafızada farklı referanslarda olduğu için false.
		System.out.println(word5.equals(word4)); // EQUALS İLE == FARKI POOL DA 
		//FARKLI YERDE TUTMASINA RAĞMEN EQUALS KULLANIRSAK EŞİT ÇIKARIR İÇERİ KONTROLÜ YAPAR.
		
		
	}

}
