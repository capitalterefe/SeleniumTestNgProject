package org.myFirstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	static WebDriver browser;

	public static void main(String[] args) throws Exception {
		WebDriverTest myTest = new WebDriverTest();
		myTest.startUp();
		myTest.loginToGmail();
		myTest.verification();
		myTest.cleanUp();

	}

	/**
	 * Start the Browser and Launch Google Page
	 * 
	 * @return
	 */
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\capital terefe\\classOf2017\\chromedriver.exe");
		browser = new ChromeDriver();
		browser.get("http://www.gmail.com");
		browser.findElement(By.id("dd"));
	}

	/**
	 * 
	 */
	public void cleanUp() {
		browser.close();
		browser.quit();
	}

	/**
	 * 
	 */
	public void verification() {
		WebElement webElement = browser.findElement(By.xpath("//*[@id=':3t']/div/div"));
		String compose=webElement.getText();
		// System.out.println(compose);
		
		if (compose.equals("COMPOSE")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

	/**
	 * @throws InterruptedException
	 */
	public void loginToGmail() throws InterruptedException {
		browser.findElement(By.xpath("//*[@id='Email']")).sendKeys("seleniumbatch2017");
		browser.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		browser.findElement(By.id("Passwd")).sendKeys("batch2017");
		browser.findElement(By.id("signIn")).click();
	}

}
