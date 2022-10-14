package javaCamp22.oopWithNLayeredHomework.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {	
		System.out.println("Log to mail :" + data);
	}
}
