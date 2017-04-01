package com.resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

	public void selectDropDownByVisibleTxt(By locator, String visibleText) {
		WebElement myElement = driver.findElement(locator);
		Select select = new Select(myElement);
		select.selectByVisibleText(visibleText);
	}

}
