package javaCamp22.thirdDayHomework.youTubeEgitim;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
	}
}
