package pom;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;
import utils.DriverManager;
import utils.DriverManager2;

public class PageObjectManager {
	
	private WebDriver driver = null;
	private HomePage homePage = null;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
}
