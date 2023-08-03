package com.yatra.qa.pages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Holidays {
  @Test
  public void selectOriginCity() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  	
	    ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
	
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(800);
		driver.get("https://www.yatra.com/holidays");
		
		driver.findElement(By.id("BE_holiday_leaving_city")).click();
		
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Mumbai']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//li[normalize-space()='Maldives']")).click();
		
		driver.findElement(By.id("BE_holiday_search_btn")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Honeymoon In Maldives With Water Villa']")).click();
		
		
  }
}
