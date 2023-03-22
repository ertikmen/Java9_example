package week3.day03;

public class Practice003_Array {

	public static void main(String[] args) {
		// dizi içerisinde 1 ve 4 kaç defa geçtiğini ve 1 sayısı adeti 4 sayısının adetinden büyük ise true değilse false
		
		int[] numbers = { 1, 4, 5, 6, 1, 1, 4, 8 };
		int count1=0;
		int count4=0;
		boolean check=false;
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i]==1) {
				count1++;
			}
			if (numbers[i]==4) {
				count4++;
			}

		}
		if (count1>count4) {
			check=true;
			System.out.println(check);
		}
		else {
			System.out.println(check);
		}
		System.out.println(count1);
		System.out.println(count4);
	}

}
