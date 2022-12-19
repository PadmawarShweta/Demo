package com.blazeDemo.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.blazeDemo.Baseclass.Baseclass;

public class homePage extends Baseclass{

	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),\"Welcome to the Simple Travel Agency!\")]") 
	private WebElement title;
	
	@FindBy(xpath="//a [@href=\"vacation.html\"]") 
	private WebElement destLink;
	
	@FindBy(name="toPort")
	private WebElement dest;
	
	@FindBy(name="fromPort")
	private WebElement src;
	
	@FindBy(xpath="//input [@type=\"submit\"]")
	private WebElement findFlight;
	
	public Boolean SetTitle() {
		Boolean tit=title.isDisplayed();
		return tit;
	}
	
	public void setDestLink() {
		destLink.click();
		}
	
	public void setSrc(String srcc) {
		Select source=new Select(src);
		source.selectByValue(srcc);
		}
	public void setDest(String des) {
		Select desti=new Select(dest);
		desti.selectByValue(des);
	}
	
	public void clickFindFlight() {
		findFlight.click();
		}
}
