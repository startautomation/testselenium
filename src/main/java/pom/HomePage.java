package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {	
	
	@FindBy(id="kw")
	WebElement searchBox;
	
	@FindBy(id="suu")
	WebElement searchButton;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage getUrl(String url) {
		driver.get(url);
		return this;
	}
	
	public HomePage searchSometing(String keyWords) {
		searchBox.sendKeys(keyWords);
		searchButton.click();
		return this;
	}
	
//	public void assertEquals(By elementBy, String expectedText) {
//		Assert.assertEquals(readText(elementBy), expectedText);
//	}
	
}