package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RereportsTest {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	String baseUrl;
	
	@BeforeTest
	public void setUp() {
		baseUrl = "https://www.baidu.com";
		reports = new ExtentReports(".\\loger\\report.html");
		test = reports.startTest("开始测试...");
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO	, "打开浏览器", "使用Chrome打开测试");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO	, "浏览器最大化");
		driver.get(baseUrl);
		test.log(LogStatus.INFO	, "打开百度首页");
	}
	
	@Test
	public void f() {
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
}
