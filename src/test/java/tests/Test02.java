package tests;

import org.testng.annotations.Test;

//@Parameters({ "browser" })
public class Test02 extends BaseTest {

	@Test(description="百度搜索selenium")
	public void test() throws InterruptedException {
		pm.getHomePage().getUrl("https://www.baidu.com").searchSometing("baidu");
		Thread.sleep(5000);
	}
}
