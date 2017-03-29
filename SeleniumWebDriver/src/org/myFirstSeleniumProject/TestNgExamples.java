package org.myFirstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNgExamples {

	static WebDriver driver;

	@BeforeMethod
	public void startUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\capital terefe\\classOf2017\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("seleniumbatch2017");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("batch2017");
		// browser.findElement(By.id("PersistentCookie")).click();
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(9000);

	}

	@Test
	public void verification() {
		WebElement webElement = driver.findElement(By.xpath("//*[@id=':3t']/div/div"));
		String compose = webElement.getText();
		// System.out.println(compose);

		if (compose.equals("COMPOSE")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
		driver.quit();
	}

}
