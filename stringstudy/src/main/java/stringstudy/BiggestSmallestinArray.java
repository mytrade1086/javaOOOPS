package stringstudy;

public class BiggestSmallestinArray {

	public static void main(String[] args) {

		// 1. Biggest Number
		int[] numbers = { 12, 23, 1, 20 };
		int dummy = numbers[0];
		for (int num : numbers) {
			if (dummy < num) {
				dummy = num;
			}
		}
		System.out.println("Biggest Number is " + dummy);

		// 2.Smallest Number
		int small = numbers[0];
		for (int num : numbers) {
			if (small > num) {
				small = num;
			}
		}
		System.out.println("Smallest Number is " + small);
	}

}
