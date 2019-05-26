package com.inmar.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inmar.pages.AccountPage;
import com.inmar.pages.ReviewPage;

/*Element inspector for https://mgsdemo.mgscoder.com/mgscode/regform/index-2.html was disabled, 
hence I had to use getPageSource() method to create locators for all the fields.
This is one approach, I can do it in other approaches.  
*/
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
		
		AccountPage accountPage = new AccountPage(webDriver);
		
		ReviewPage reviewPage = accountPage.populateAndSubmitAccountPage()
								.populateAndSubmitPersonalInformationPage()
								.populateAndSubmitPaymentDetailsPage();
		
		boolean isDataReviewed = reviewPage.reviewData();
		reviewPage.enterCaptch();
		reviewPage.clickSubmitButton();
		
		Assert.assertTrue(isDataReviewed, "Input data did not match with data on Review Page");
	}
	
	@AfterMethod
	public void tearDown() {
		webDriver.quit();
	}
	
}
