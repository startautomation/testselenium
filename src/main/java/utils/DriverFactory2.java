package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory2 {
	
	public static WebDriver createInstance(String browser) {
		WebDriver driver = null;
		switch (browser) {
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "Firefox":
				System.setProperty("webdriver.gecko.driver", ".\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", ".\\resources\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
		}
		return driver;
	}
	
}
