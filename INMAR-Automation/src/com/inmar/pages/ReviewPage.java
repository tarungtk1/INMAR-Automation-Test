package com.inmar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inmar.loators.Locators;
import com.inmar.utils.UtilityActions;

public class ReviewPage {
	
	WebDriver webDriver;	
	
	public ReviewPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		UtilityActions.webDriver = webDriver;
		UtilityActions.webDriverWait = new WebDriverWait(webDriver,45);
	}

	public boolean reviewData() {
		//yet to be completed
	  return true;	
	}
	
	public void enterCaptch() {
		
		String firstNumberLabel = webDriver.findElement(By.xpath(Locators.VERIFICATION_FIRST_NUMBER_LABEL.getLocator())).getText();
		String secondNumberLabel = webDriver.findElement(By.xpath(Locators.VERIFICATION_SECOND_NUMBER_LABEL.getLocator())).getText();
		
		int sum = Integer.parseInt(firstNumberLabel) + Integer.parseInt(secondNumberLabel);
		
		webDriver.findElement(By.xpath(Locators.ENTER_SUM_TEXT_BOX.getLocator())).sendKeys(String.valueOf(sum));
		
	}
	
	public void clickSubmitButton() {		
		UtilityActions.clickButton(Locators.REVIEW_SUBMIT_BUTTON);
	}
	
	

}
