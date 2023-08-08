package com.yatra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yatra.qa.base.TestBase;

public class HolidaysPage extends TestBase {
	
	
	@FindBy(xpath="BE_holiday_leaving_city")
	 WebElement origincity;
	
	@FindBy(xpath="//li[normalize-space()='Mumbai']")
	 WebElement Origincity;
	
	
	@FindBy(xpath="//li[normalize-space()='Maldives']")
	 WebElement Destinationcity;
	
	
	@FindBy(xpath="//div[@class='ddTitle borderRadiusTp holi_passengerBox']")
	WebElement monthoftravel;
	
	@FindBy(xpath="//div[@class='select-with-bg holi_passengerBox flexB100']//li[1]")
	WebElement monthoftravel1;
	
	@FindBy(xpath="//input[@id='BE_holiday_search_btn']")
	WebElement Searchholiday;

	
	@FindBy(xpath="//a[normalize-space()='Honeymoon In Maldives With Water Villa']")
	WebElement selectpackage;
	
	
	  public HolidaysPage(WebDriver driver) {
		
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	
	  public void selectorigincity(String Leavingcity) {
		  
		  origincity.sendKeys(Leavingcity);
		  
	  }

	public void selectOriginCity(String ocity){
		
		
		Origincity.sendKeys(ocity);
	}
	
	
	public void selectDestinationCity(String dcity) {
		
		Destinationcity.sendKeys(dcity);
	}
	
	public void selectMonthOfTravel(String month) {
		monthoftravel.sendKeys(month);
	}
	
	public void selectMonthOfTravel1(String month1) {
		monthoftravel1.sendKeys(month1);
	}
	public void Searchholiday() {
		Searchholiday.click();
	
	}

	public void selectpackage(String string) {
		
		selectpackage.click();
		
	}
	
	
	
	}
	

