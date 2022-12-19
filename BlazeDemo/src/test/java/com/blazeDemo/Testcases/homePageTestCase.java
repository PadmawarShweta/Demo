package com.blazeDemo.Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazeDemo.Baseclass.Baseclass;
import com.blazeDemo.PageObject.homePage;

public class homePageTestCase extends Baseclass {
	homePage page=new homePage();
	
	@Test
	public void titleTestcase() {
		
		
		
		Boolean isTitle=page.SetTitle();
		
		if(isTitle= true) {
		Assert.assertTrue(true);
		}
		
	
	}
	@Test
	public void destLinkTestcase() {
		//driver.findElement(By.xpath("//a [@href=\"vacation.html\"]")).click();
		//driver.switchTo().defaultContent();
		page.setDestLink();
	}
	@Test
	public void sourceDesTestcase() {
		page.setSrc("Mexico City");
		page.setDest("London");
		page.clickFindFlight();
	}
	
	
	

}
