package com.blazeDemo.Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.blazeDemo.Configuration.readConfiguration;

public class Baseclass {
	
	public static WebDriver driver;
	readConfiguration read=new readConfiguration();
	public String url=read.setUrl();
	public String chromepath=read.setChromePath();
	public String testconflict="Feature Branch";
	//rtytetye
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
