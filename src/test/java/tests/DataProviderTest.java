package tests;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadJson;

public class DataProviderTest {
	
	
	File file = new File(".\\resources\\test.json");
	
	@DataProvider(name = "test")
	public Object[][] dataProvider() throws JSONException, IOException {
		return ReadJson.getArray(file);
	}

	
	@Test(dataProvider = "test")
	public void f(String name, String pwd, String s, String h) {
		System.out.println(name + pwd + s + h);
	}
}
