package week3.day03;

public class Practice004_Array {

	public static void main(String[] args) {
		// bir dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden toplam sonucunu bulan algoritma
		
		
		int[] numbers= {1,13,13,13,13,13,5,5,5,5,5,1,13,1};
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i]!=13) {
				sum+=numbers[i];
			}
			if (i>0) {
				if (numbers[i-1]==13 && numbers[i]!=13) {
					sum-=numbers[i];
			}
		}
		
	}
		System.out.println(sum);

	}
}

