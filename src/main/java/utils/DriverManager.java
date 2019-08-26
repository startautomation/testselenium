package utils;

public class DriverManager {
	private static ThreadLocal<DriverClass> driver = new ThreadLocal<DriverClass>();
	
	public static DriverClass getDriver() {
		return driver.get();
	}
	
	public static void setDriver(DriverClass drive) {
		System.out.println(driver);
		driver.set(drive);
	}
}	
