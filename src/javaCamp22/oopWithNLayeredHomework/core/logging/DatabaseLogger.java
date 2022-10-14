package javaCamp22.oopWithNLayeredHomework.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Log to database :" + data);
	}
}
