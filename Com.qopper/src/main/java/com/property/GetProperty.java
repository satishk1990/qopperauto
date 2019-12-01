package com.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {

	
	public static String gtProperty(String key) throws IOException {
		Properties pt = new Properties();
		FileInputStream fs = new FileInputStream("D:/QopperTestingnew/Com.qopper/src/main/java/com/property/Common.properties");
		pt.load(fs);
		return pt.getProperty(key);
		
		
	}
}
