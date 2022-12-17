package com.blazeDemo.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readConfiguration {
	
	Properties pro;
	
	public readConfiguration() {
		
		File src=new File("C:\\Users\\diles\\eclipse-workspace\\BlazeDemo\\src\\main\\java\\com\\blazeDemo\\Configuration\\config.properties");
		
		FileInputStream fin;
		try {
		fin=new FileInputStream(src);
		
		pro=new Properties();
		pro.load(fin);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public String setUrl() {
		
		String url=pro.getProperty("baseurl");
		return url;
	}
	
	public String setChromePath() {
		
		String chromePath=pro.getProperty("chromeurl");
		return chromePath;
	}

}
