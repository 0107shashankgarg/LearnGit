package com.Demo.Scripts.Sprints;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

	public WebDriver driver = null;

	@BeforeMethod
	public void setUp() throws Exception {

		// set up appium

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "iPad2");
		capabilities.setCapability("platformName", "iOS");

		capabilities.setCapability("udid",
				"86f954587a2096d62618ab75423ae5229192cfc9");

		capabilities.setCapability("bundleId", "com.adeptpros.WJIVDemo");

		capabilities.setCapability("ipa",
				"/Users/shashank/Desktop/tod/WJIV_iOS.ipa");

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		System.out.println("App launched");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testCases() throws InterruptedException {

		String myname = "Smriti";

		driver.findElement(By.name("Add")).click();
		driver.findElement(By.xpath("//textfield[1]")).sendKeys(myname);
		driver.findElement(By.name("Save")).click();

		Thread.sleep(5000);

		// write all your tests here

	}

}