package week3.day02;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class Practice002_ {

	public static void main(String[] args) {
		/*
		 *  Hayat,kısa,kuşlar,ötüyor
		 *  bu stringleri virgüllerden ayırıp her kelimeyi alt alta yazdıralım.
		 */
		
		String sentence="Hayat,kısa,kuşlar,ötüyor";
		System.out.println(sentence.replace(","," "));
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i)==','){
				System.out.println();
			}else {
				System.out.print(sentence.charAt(i));
			}
		}
		
	}

}
