package javaCamp22.firstDayHomework.vowels;

public class Main {

	public static void main(String[] args) {

		char character = 'A';

		switch (character) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}
	}
}
