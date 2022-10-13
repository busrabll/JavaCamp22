package javaCamp22.thirdDayHomework.abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}
}
