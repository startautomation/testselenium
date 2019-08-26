package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
	}
	
	public WebDriver chrome = new ChromeDriver();
}
