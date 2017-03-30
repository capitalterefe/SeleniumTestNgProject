package com.gricit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistraionPage {

	WebDriver driver;
	WebElement continueButton;

	public void clickContiueButton() {
		continueButton = driver.findElement(By.id("tdb4"));
		continueButton.click();
	}

}
