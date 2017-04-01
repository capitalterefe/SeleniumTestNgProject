package com.gricit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.resource.Utility;

public class AccountInformation {

	Utility utility = new Utility();
	By lastName = By.name("lastname");
	By firstName = By.name("firstname");
	WebDriver driver;
	WebElement myAccountInformationTxt;
	WebElement genderMale;
	WebElement genderFemale;
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
	WebElement continueBtutton;

	// This is what we trying to avoid
	public void typeFirstName() {
		// firstName = driver.findElement(By.name("firstname"));
		// firstName.sendKeys("MY FirstName");
	}

	@Test
	public void registration() {

		utility.typeInto(lastName, "Terefe");
		utility.typeInto(firstName, "Capital");
	}



}
