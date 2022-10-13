package javaCamp22.thirdDayHomework.abstractClasses;

public abstract class GameCalculator {

	public void hesapla() {
		System.out.println("Puanınız : 100");
	}

	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
