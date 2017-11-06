package com.Demo.Layer.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Demo.Utilities.Driver;
import com.Demo.Utilities.RandomGenrator;

public class TextBox {

	public static WebDriver driver = Driver.driver;

	public static boolean maxLengthNumeric(By by, int maxnumbersAllowed) {

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

	public static boolean maxLengthAlphaNumeric(By by, int maxnumbersAllowed) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.ALPHANUMERIC);
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

	public static boolean maxLengthAlpha(By by, int maxnumbersAllowed) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.ALPHA);
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
	public static boolean maxLengthSpecialCharacters(By by, int maxnumbersAllowed) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.SPECIALCHARACTERS);
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

	public static boolean minLengthNumeric(By by, int minlettersAllowed) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.NUMERIC);
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

	public static boolean minLengthAlphaNumeric(By by, int minlettersAllowed) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.ALPHANUMERIC);
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

	public static boolean minLengthAlpha(By by, int minlettersAllowed) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.ALPHA);
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
	public static boolean minLengthSpecialCharacters(By by, int minlettersAllowed) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.SPECIALCHARACTERS);
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

	public static boolean maxLengthNumeric(By by, By errorMsg,
			int maxnumbersAllowed) {

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
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean maxLengthAlphaNumeric(By by, int maxnumbersAllowed,
			By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.ALPHANUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean maxLengthAlpha(By by, int maxnumbersAllowed,
			By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.ALPHA);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}
	public static boolean maxLengthSpecialCharacters(By by, int maxnumbersAllowed,
			By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(maxnumbersAllowed + 1,
					RandomGenrator.Mode.SPECIALCHARACTERS);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean minLengthNumeric(By by, int minlettersAllowed,
			By errorMsg) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.NUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean minLengthAlphaNumeric(By by, int minlettersAllowed,
			By errorMsg) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.ALPHANUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean minLengthAlpha(By by, int minlettersAllowed,
			By errorMsg) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.ALPHA);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}
	public static boolean minLengthSpecialCharacters(By by, int minlettersAllowed,
			By errorMsg) {
		try {
			String strValue = RandomGenrator.generateRandom(
					minlettersAllowed + 1, RandomGenrator.Mode.SPECIALCHARACTERS);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean ValidateNumeric(By by, int lengthOfField, By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.NUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return false;
		}
		return true;

	}

	public static boolean ValidateAlphaNumeric(By by, int lengthOfField,
			By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.ALPHANUMERIC);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean ValidateAlpha(By by, int lengthOfField, By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.ALPHA);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}
	public static boolean ValidateSpecialCharacters(By by, int lengthOfField, By errorMsg) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.SPECIALCHARACTERS);
			driver.findElement(by).sendKeys(strValue);
		} catch (Exception e) {

			e.printStackTrace();
		}

		String getValue = driver.findElement(by).getText();
		if (getValue == null) {
			driver.findElement(errorMsg).isDisplayed();
			return true;
		}
		return false;

	}

	public static boolean ValidateNumeric(By by, int lengthOfField) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
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

	public static boolean ValidateAlphaNumeric(By by, int lengthOfField) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.ALPHANUMERIC);
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

	public static boolean ValidateAlpha(By by, int lengthOfField) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.ALPHA);
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
	public static boolean ValidateSpecialCharacters(By by, int lengthOfField) {

		String strValue;
		try {
			strValue = RandomGenrator.generateRandom(lengthOfField,
					RandomGenrator.Mode.SPECIALCHARACTERS);
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
