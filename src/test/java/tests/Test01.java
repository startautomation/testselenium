package tests;

import org.testng.annotations.Test;

public class Test01 extends BaseTest{

	@Test(description="百度搜索selenium")
	public void test() throws InterruptedException {
		pm.getHomePage().getUrl("https://www.baidu.com").searchSometing("Selenium");
		Thread.sleep(5000);
	}
}
