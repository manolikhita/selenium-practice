package com.myntra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProps {
	
	
		private static Properties prop;
		
		static {
		try {
		FileInputStream fis = new FileInputStream("C:/Users/Personal/eclipse-workspace/com/src/main/java/com/myntra/Config.properties");
        prop = new Properties();
        prop.load(fis);
		
		}catch(IOException e){
			System.out.println("Failed To Load Properties"+ e.getMessage());
			e.printStackTrace();
		}
		}
		
		
		public static String get(String key) {
			return prop.getProperty(key);
		}
	}
	


