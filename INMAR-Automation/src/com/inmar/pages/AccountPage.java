package com.inmar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inmar.loators.Locators;
import com.inmar.utils.UtilityActions;

public class AccountPage {

	WebDriver webDriver;
	
	public AccountPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		UtilityActions.webDriver = webDriver;
		UtilityActions.webDriverWait = new WebDriverWait(webDriver,45);
	}

	public void enterUserName() {		
		UtilityActions.enterDataIntoTextBox(Locators.USER_NAME_TEXT_BOX);
	}

	public void enterEmail() {		
		UtilityActions.enterDataIntoTextBox(Locators.EMAIL_TEXT_BOX);
	}
	
	public void enterPassword() {	
		UtilityActions.enterDataIntoTextBox(Locators.PASSWORD_TEXT_BOX);
	}
	
	public void enterConfirmPassword() {		
		UtilityActions.enterDataIntoTextBox(Locators.CONFIRM_PASSWORD_TEXT_BOX);
	}
	
	public void clickNextButton() {		
		UtilityActions.clickButton(Locators.ACCOUNT_PAGE_NEXT_BUTTON);
	}
	
	public PersonalInformationPage populateAndSubmitAccountPage() {
		enterUserName();
		enterEmail();
		enterPassword();
		enterConfirmPassword();
		clickNextButton();
		return new PersonalInformationPage(webDriver);
	}

}
