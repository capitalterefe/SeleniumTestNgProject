package com.gricit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountInformation {

	WebDriver driver;
	WebElement myAccountInformationTxt;
	WebElement genderMale;
	WebElement genderFemale;
	WebElement lastName;
	WebElement dateOfBirth;
	WebElement email;
	WebElement companyName;
	WebElement streetAddress;
	WebElement suburb;
	WebElement postCode;
	WebElement city;
	WebElement state;
	WebElement province;
	WebElement country;
	WebElement telephoneNumber;
	WebElement faxNumber;
	WebElement newsLetter;
	WebElement password;
	WebElement passwordConfirmation;
	WebElement continueBtn;
	WebElement firstName;

	public void typeFirstName() {
		firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("MY FirstName");
	}



}
