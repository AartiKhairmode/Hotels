package com.yatra.qa.pages;

import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest

public class Holidays_test extends TestBase{
	
	  HolidaysPage hp = new HolidaysPage(driver);
	  
	@BeforeTest
		public void setup() {
		
		WebDriverManager.chromedriver().setup();
		  
	    ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");	
	    WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/holidays");
	}
	
	@Test(priority = 1)
	public void BookDomesticandInternationalHolidays() {
		
		hp.selectorigincity("Mumbai");
		hp.selectOriginCity("Mumbai");
		hp.selectDestinationCity("Maldives");
		hp.selectMonthOfTravel1("October 2023");
		hp.Searchholiday();
	}
	
	@Test(priority = 2)
	public void packageselection() {
		
		hp.selectpackage("Honeymoon In Maldives With Water Villa");
	}
	
	

  }

	  
 		
  		
  
  

