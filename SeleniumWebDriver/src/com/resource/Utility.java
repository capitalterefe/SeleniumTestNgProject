package com.resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	WebDriver driver;

	public void clickOn(By locator) {
		WebElement myElement = driver.findElement(locator);
		myElement.click();
	}

	public void typeInto(By locator, String myText) {
		WebElement myElement = driver.findElement(locator);
		myElement.sendKeys(myText);
	}

}
