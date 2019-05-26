package com.inmar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inmar.loators.Locators;
import com.inmar.utils.UtilityActions;

public class PaymentDetailsPage {
	
	WebDriver webDriver;	
	
	public PaymentDetailsPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		UtilityActions.webDriver = webDriver;
		UtilityActions.webDriverWait = new WebDriverWait(webDriver,45);
	}

	public void selectPaymentType() {			
		UtilityActions.selectFromDropDown(Locators.PAYMENT_TYPE_DROPDOWN);
	}
	
	public void enterCardHolderName() {		
		UtilityActions.enterDataIntoTextBox(Locators.CARD_HOLDER_NAME_TEXT_BOX);
	}

	public void enterCardNumber() {		
		UtilityActions.enterDataIntoTextBox(Locators.CARD_NUMBER_TEXT_BOX);
	}
	
	public void enterCVV() {		
		UtilityActions.enterDataIntoTextBox(Locators.CVC_TEXT_BOX);
	}
	
	public void enterExpiryDate() {		
		UtilityActions.enterDataIntoTextBox(Locators.EXPIRY_TEXT_BOX);
	}
		
	public void checkTermsAndConditions() {		
		UtilityActions.checkCheckbox(Locators.AGREE_TERMS_CHECK_BOX);
	}
	
	public void clickNextButton() {		
		UtilityActions.clickButton(Locators.PAYMENT_DETAILS_NEXT_BUTTON);
	}
	
	public ReviewPage populateAndSubmitPaymentDetailsPage() {
		selectPaymentType();
		enterCardHolderName();
		enterCardNumber();
		enterCVV();
		enterExpiryDate();
		checkTermsAndConditions();
		clickNextButton();
		return new ReviewPage(webDriver);
	}

}
