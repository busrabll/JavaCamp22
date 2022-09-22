package javaCamp22.firstDayHomework.maxNumberDemo;

public class Main {

	public static void main(String[] args) {

		int number1 = 20;
		int number2 = 25;
		int number3 = 2;

		int biggestNumber = number1;

		if (biggestNumber < number2) {
			biggestNumber = number2;

			System.out.println("En büyük: " + biggestNumber);
		} else if (biggestNumber < number3) {
			biggestNumber = number3;

			System.out.println("En büyük: " + biggestNumber);
		} else {
			System.out.println("En büyük: " + biggestNumber);
		}
	}
}
