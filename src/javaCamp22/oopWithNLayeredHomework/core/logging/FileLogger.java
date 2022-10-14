package javaCamp22.oopWithNLayeredHomework.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {	
		System.out.println("Log to file :" + data);
	}
}
