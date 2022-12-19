package com.blazeDemo.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazeDemo.Baseclass.Baseclass;

public class findFlight extends Baseclass {

	public findFlight() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class="table"]")
	private List<WebElement> flightTable;
	
	public void flightTable() {
		flightTable.size();
	}
}
