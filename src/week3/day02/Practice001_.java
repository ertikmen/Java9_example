package week3.day02;

import java.util.Scanner;

public class Practice001_ {

	public static void main(String[] args) {
		// Dışarıdan bir kelime alacağız daha sonra her harfi başına
		// index numarası gelecek şekilde alt alta yazdıralım..
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word");
		String word= new String(scanner.nextLine());
		for (int i = 0; i < word.length(); i++) {
			System.out.println(i+"-"+word.charAt(i));
		}
	}

}
