package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import pom.PageObjectManager;
import utils.DriverFactory2;
import utils.DriverManager2;
@Listeners({ ExtentITestListenerClassAdapter.class })
public class BaseTest {

	PageObjectManager pm;
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup (String browserName) {
		driver = DriverFactory2.createInstance(browserName);
		DriverManager2.setDriver(driver);
		pm = new PageObjectManager(driver);
	}
	

	@AfterClass
	public void teardown () {
		driver.quit();
	}

}
