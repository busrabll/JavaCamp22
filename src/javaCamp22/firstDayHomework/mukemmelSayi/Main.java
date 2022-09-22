package javaCamp22.firstDayHomework.mukemmelSayi;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random rnd = new Random();
		int number = rnd.nextInt(1000);
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println(number + " : Mükemmel sayıdır.");
		} else {
			System.out.println(number + " : Mükemmel sayı değildir!");
		}
	}
}
