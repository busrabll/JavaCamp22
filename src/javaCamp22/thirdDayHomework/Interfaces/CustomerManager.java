package javaCamp22.thirdDayHomework.Interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}

}
