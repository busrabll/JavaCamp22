package javaCamp22.thirdDayHomework.youTubeEgitim;

public class CustomerManager {

	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save(Customer customer) {

		System.out.println("Müşteri kaydedildi.");
	}

	public void update(Customer customer) {

		System.out.println("Müşteri güncellendi.");
	}

	public void delete(Customer customer) {

		System.out.println("Müşteri silindi.");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}

}
