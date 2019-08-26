package utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;

public class ReadJson {
	private static String[][] data = null;

	public static String[][] getArray(File file) throws JSONException, IOException {
		JSONArray jsonArray = new JSONArray(FileUtils.readFileToString(file));
		data = new String[jsonArray.length()][];
		for (int i = 0; i < jsonArray.length(); i++) {
			// 获取一维元素
			JSONArray t = (JSONArray) jsonArray.get(i);
			// 初始化二维长度
			data[i] = new String[t.length()];
			// 二维元素遍历赋值
			for (int j = 0; j < t.length(); j++) {
				data[i][j] = (String) t.get(j);
			}

		}
		return data;
	}
}
