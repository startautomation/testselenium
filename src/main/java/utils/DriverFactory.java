package utils;

public class DriverFactory {
	public static DriverClass createInstance() {
		DriverClass driver = new DriverClass();
		return driver;
	}
}
