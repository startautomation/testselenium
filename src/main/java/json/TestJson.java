package json;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;


public class TestJson {
	
	private static String[][] data= null;
	
	public static String[][] getArray(JSONArray jsonArray){
		data = new String[jsonArray.length()][];
		for(int i=0; i<jsonArray.length(); i++) {
			JSONArray t = (JSONArray) jsonArray.get(i);
			data[i] = new String[t.length()];
				for(int j=0; j<t.length(); j++) {
					data[i][j] = (String) t.get(j);
			}
		}
		return data;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(".\\resources\\test.json");
		System.out.println(file);
		String content = FileUtils.readFileToString(file);
		JSONArray jo = new JSONArray(content);
		System.out.println(Arrays.deepToString(getArray(jo)));
		
	}

}
