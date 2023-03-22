package week3.day03;

public class Practice002_Array {

	public static void main(String[] args) {
		// bir dizideki tüm sayıların toplamı ve her sayı için bu sayı tektir bu sayı çifttir çıktı verelim.
		int[] numbers = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
			if (numbers[i]%2==0) {
				System.out.println((i+1)+". sayı çifttir: "+numbers[i]);
			}
			else {
				System.out.println((i+1)+". sayı tektir: "+numbers[i]);
			}
		}
		System.out.println("Toplam: "+sum);

	}

}
