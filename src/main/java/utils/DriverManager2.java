package utils;

import org.openqa.selenium.WebDriver;

public class DriverManager2 {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void setDriver(WebDriver drive) {
		System.out.println(driver);
		driver.set(drive);
	}
}	
