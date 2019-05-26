package com.inmar.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inmar.loators.Locators;

public class AccountPage {

	WebDriver webDriver;	
	WebElement webElement;
	List<WebElement> webElements;

	public AccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;		
	}

	public void enterUserName() {
		System.out.println(Locators.USER_NAME_TEXT_BOX.getDataValue());
		webElement = webDriver.findElement(By.name(Locators.USER_NAME_TEXT_BOX.getLocator()));
		webElement.sendKeys(Locators.USER_NAME_TEXT_BOX.getDataValue());
	}

	public void enterEmail() {

	}
	
	public void enterPassword() {
		
	}
	
	public void enterConfirmPassword() {
		
	}

}
