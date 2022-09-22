package javaCamp22.firstDayHomework.findNumber;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int willFound = 5;
		boolean isFound = false;

		for (int number : numbers) {
			if (number == willFound) {
				isFound = true;
				break;
			}
		}

		if (isFound) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir!");
		}
	}
}
