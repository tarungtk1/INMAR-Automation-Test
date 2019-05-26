package com.inmar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inmar.loators.Locators;
import com.inmar.utils.UtilityActions;

public class PersonalInformationPage {

	WebDriver webDriver;	

	public PersonalInformationPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		UtilityActions.webDriver = webDriver;
		UtilityActions.webDriverWait = new WebDriverWait(webDriver,45);
	}

	public void enterFirstName() {	
		UtilityActions.enterDataIntoTextBox(Locators.FIRST_NAME_TEXT_BOX);
	}

	public void selectGender() {		
		UtilityActions.selectFromDropDown(Locators.GENDER_DROPDOWN);
	}
	
	public void enterDateOfBirth() {	
		UtilityActions.enterDataIntoTextBox(Locators.BIRTH_DATE_TEXT_BOX);
	}
	
	public void enterPhoneNumber() {		
		UtilityActions.enterDataIntoTextBox(Locators.PHONE_TEXT_BOX);
	}
	
	public void pickPreferredContactMethod() {		
		UtilityActions.pickFromRadioButtonGroup(Locators.PREFERED_CONTACT_RADIO_BUTTONS_GROUP);
	}
	
	public void uploadImage() {
	//yet to be completed	
	}
	
	public void clickNextButton() {		
		UtilityActions.clickButton(Locators.PERSONAL_INFORMATION_NEXT_BUTTON);
	}
	
	public PaymentDetailsPage populateAndSubmitPersonalInformationPage() {
		enterFirstName();
		selectGender();
		enterDateOfBirth();
		enterPhoneNumber();
		pickPreferredContactMethod();
		uploadImage();
		clickNextButton();
		return new PaymentDetailsPage(webDriver);
	}

}
