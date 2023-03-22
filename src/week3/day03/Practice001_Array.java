package week3.day03;

public class Practice001_Array {

	public static void main(String[] args) {

//			int [] numbers= {0,120,5,85,-256,16,1258,81,14};
//			int min=numbers[0];
//			int max=numbers[0];
//			
//			for (int i = 0; i < numbers.length; i++) {
//				if (min>numbers[i]) {
//					min=numbers[i];
//				}
//				if (max<numbers[i]) {
//					max=numbers[i];
//				}
//			}
//			System.out.println("min value: "+min+" max value: "+max);
			
		
		
				////// 2. soru
		
		
		
//		int[] numbers = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
//
//		int max = Integer.MAX_VALUE;
//		int second = Integer.MIN_VALUE;
//		for (int i = 1; i < numbers.length; i++) {
//			if (numbers[i] > max) {
//				second = max;
//				max = numbers[i];
//			} else if (numbers[i] > second) {
//				second = numbers[i];
//			}
//		}
//		System.out.println("İkinci büyük sayı: " + second);
		
			///////// 3. soru
		// Bir dizide ard arda gelen 2 şndexteki sayı değeri 2 ise true yazdırıp döngü sonlansın
		// yoksa false yapalım..
		int [] sayilar= {2,-256,2,129,2,2};
		boolean kontrol=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==2 && sayilar[i+1]==2) {
				kontrol=true;
				break;
			}
		}
		System.out.println(kontrol);

	}

}
