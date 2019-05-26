package com.inmar.loators;

public enum Locators {

	USER_NAME_TEXT_BOX("uname","Test User Name"), 
	EMAIL_TEXT_BOX("email","test@gmail.com"), 
	PASSWORD_TEXT_BOX("pass","testpassword"),
	CONFIRM_PASSWORD_TEXT_BOX("cpass","testpassword"),
	ACCOUNT_PAGE_NEXT_BUTTON("//button[text()='Are you ready!']/following-sibling::button[contains(.,'Next')]"),
	FIRST_NAME_TEXT_BOX("fname","Test First Name"),
	LAST_NAME_TEXT_BOX("fname","Test Last Name"),
	GENDER_DROPDOWN("gender","Male"),
	BIRTH_DATE_TEXT_BOX("birthdate","26/05/1990"),
	PHONE_TEXT_BOX("phone","1234567890"),
	PREFERED_CONTACT_RADIO_BUTTONS_GROUP("//input[@name='preferedcontact']/parent::label","Phone"),
	CHOOSE_FILE_BUTTON(""),
	PERSONAL_INFORMATION_NEXT_BUTTON("//div[contains(@class,'attachment') and contains(.,'Browse')]/following-sibling::div/button[text()='Next ']"),
	PAYMENT_TYPE_DROPDOWN("paymenttype","Master Card"),
	CARD_HOLDER_NAME_TEXT_BOX("hname","Test Card Holder Name"),
	CARD_NUMBER_TEXT_BOX("cardnumber","1234561235647896"),
	CVC_TEXT_BOX("cvc","120"),
	EXPIRY_TEXT_BOX("expirydate","2/05/2020"),
	AGREE_TERMS_CHECK_BOX("aggre"),	
	PAYMENT_DETAILS_NEXT_BUTTON("//div[contains(.,'Aggre with terms & conditions')]/following-sibling::div/button[text()='Next ']"),
	VERIFICATION_FIRST_NUMBER_LABEL("mathfirstnum"),
	VERIFICATION_SECOND_NUMBER_LABEL("mathsecondnum"),
	REVIEW_SUBMIT_BUTTON("//button[text()='Submit']"),
	ENTER_SUM_TEXT_BOX("humanCheckCaptchaInput"),
	;
	
	

	String locator,dataValue;

	private Locators(String locator) {
		this.locator = locator;
	}
	
	private Locators(String locator,String dataValue) {
		this.locator = locator;
		this.dataValue = dataValue;
	}

	public String getLocator() {
		return locator;
	}
	
	public String getDataValue() {
		return dataValue;
	}

}
