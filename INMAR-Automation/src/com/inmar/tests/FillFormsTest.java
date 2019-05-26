package com.inmar.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inmar.pages.AccountPage;

public class FillFormsTest {
	WebDriver webDriver;
		
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException {
				
				
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");		
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://mgsdemo.mgscoder.com/mgscode/regform/index-2.html");
	}
	
	@Test
	public void fillForm() throws InterruptedException {
		
		WebDriverWait webDriverWait = new WebDriverWait(webDriver,30);
				
		
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form")));
		System.out.println("aaaaaaaaaaaaaaaaa");
		
		System.out.println(webDriver.findElements(By.xpath("//input")).size());
		System.out.println(webDriver.getPageSource());
		
		new AccountPage(webDriver).enterUserName();
		
		/*WebElement ele = webDriver.findElement(By.xpath("//input"));

		System.out.println("bbbbbbbbbbbb");
		System.out.println(ele.getAttribute("outerHTML"));*/
		
		for(WebElement e : webDriver.findElements(By.xpath("//input"))) {
//			System.out.println(e.getAttribute("outerHTML"));
		}
		
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		webDriver.quit();
	}
	
}
