package com;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

	private static Properties properties;
	
	static {
		try {
			FileInputStream fl = new FileInputStream("src/main/resources/config.properties");
			properties = new Properties();
			properties.load(fl);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static String get(String key) {
		return properties.getProperty(key);
	}
	
}
