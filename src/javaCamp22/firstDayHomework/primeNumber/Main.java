package javaCamp22.firstDayHomework.primeNumber;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		int number = rnd.nextInt(1000);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println(number + " : Sayı asal değildir.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(number + " : Sayı asaldır.");
		} else {
			System.out.println(number + " : Sayı asal değildir.");
		}
	}
}
