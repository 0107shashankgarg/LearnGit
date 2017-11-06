package com.Demo.Layer.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Demo.Utilities.Driver;
import com.Demo.Utilities.RandomGenrator;

public class Button {
	
	public static WebDriver driver = Driver.driver;

	public static boolean Click(By by, int maxnumbersAllowed) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.NUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			return false;
		}
		return true;

	}

}
