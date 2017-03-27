package org.myFirstSeleniumProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	WebDriver browser;

	@BeforeClass
	public void firstMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\capital terefe\\classOf2017\\chromedriver.exe");
		System.out.println("This Is the Bigning of the Test");
	}

	@BeforeMethod
	public void startUp() {
		browser = new ChromeDriver();
		browser.get("http://www.gmail.com");
	}

	@Test
	public void verifyLoginPage() {
		String x = browser.findElement(By.xpath("//*[@id='link-signup']/a")).getText();

		assertEquals(x, "Create account");


	}

	@Test
	public void verifyLandingPage() throws Exception {
		browser.findElement(By.xpath("//*[@id='Email']")).sendKeys("seleniumbatch2017");
		browser.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		browser.findElement(By.id("Passwd")).sendKeys("batch2017");
		browser.findElement(By.id("signIn")).click();

		WebElement webElement = browser.findElement(By.xpath("//div[text()='COMPOSE']"));
		String compose = webElement.getText();
		System.out.println(compose);

		assertEquals(compose, "COMPOSE");
	}

	@AfterMethod
	public void cleanUp() {
		browser.close();
		browser.quit();
	}

	@AfterClass
	public void secondMethod() {
		System.out.println("This The End of The Test ");

	}
}
