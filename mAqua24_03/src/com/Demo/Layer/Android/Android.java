package com.Demo.Layer.Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Demo.Layer.mAqua;
import com.Demo.Layer.Interfaces.mAquaMethods;
import com.Demo.Reporter.LogSetter;
import com.Demo.Utilities.Driver;

public class Android implements mAquaMethods {
	

	
	protected RemoteWebDriver driver = null;
	AppiumFieldDecorator a = new AppiumFieldDecorator(driver);

	public Android() {
		this.driver = Driver.driver;
	}
	@Override
	public String getDisplayedText(By by) {
		return driver.findElement(by).getText();
	}

	@Override
	public String getDisplayedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean IsElementPresent(WebElement ele)

	{

		return ele.isDisplayed();

	}

	public boolean IsElementPresent(WebElement ele[]) {
		// WebElement operator =
		// driver.findElement(By.xpath("//*[@id='mobile_operator']"));
		/* Select option = new Select(driver.findElement(By.id("a"))); */

		boolean flag = true;
		for (WebElement ele1 : ele) {
			if (!ele1.isDisplayed()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementPresent(By by) {
		//System.out.println(driver.findElement(By.name("Forgot Password?")));
		WebElement ele = driver.findElement(by);
		return ele.isDisplayed();

	}

	public boolean IsElementPresent(By[] by) {
		boolean flag = true;
		for (By by2 : by) {
			if (!driver.findElement(by2).isDisplayed()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementEnabled(WebElement ele) {
		return ele.isEnabled();
	}

	public boolean IsElementEnabled(WebElement ele[]) {
		boolean flag = true;
		for (WebElement ele1 : ele) {
			if (!ele1.isEnabled()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementEnabled(By by) {

		WebElement ele = driver.findElement(by);
		return ele.isDisplayed();
	}

	public boolean IsElementEnabled(By[] by) {
		boolean flag = true;
		for (By by2 : by) {
			if (!driver.findElement(by2).isDisplayed()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementSeleted(WebElement ele) {
		return ele.isSelected();
	}

	public boolean IsElementSeleted(WebElement ele[]) {
		boolean flag = true;
		for (WebElement ele1 : ele) {
			if (!ele1.isSelected()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementSeleted(By by) {
		WebElement ele = driver.findElement(by);
		return ele.isSelected();
	}

	public boolean IsElementSeleted(By[] by) {
		boolean flag = true;
		for (By by2 : by) {
			if (!driver.findElement(by2).isSelected()) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public boolean IsElementEnabledClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		return ele.isEnabled();

	}

	public boolean IsElementEnabledClickable(By by) {
		WebElement ele = driver.findElement(by);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		return ele.isEnabled();
	}

	public boolean IsElementEnabledClickable(By[] by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		boolean flag = true;
		for (By by2 : by) {
			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(by2)));

		}

		return flag;
	}

	public boolean IsElementEnabledClickable(WebElement ele[]) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		boolean flag = true;
		for (WebElement ele1 : ele) {
			wait.until(ExpectedConditions.elementToBeClickable(ele1));

		}

		return flag;
	}

	public void ClickElement(WebElement ele) {
		LogSetter.logger.info("inside android click element");
		ele.click();

	}

	public void ClickElement(By by) {
		driver.findElement(by).click();

	}

	public void ClickElement(By[] by) {
		for (By by2 : by) {
			driver.findElement(by2).click();

		}

	}

	public void ClickElement(WebElement ele[]) {
		for (WebElement ele1 : ele) {
			ele1.click();

		}

	}

	public void selectRadioButton(WebElement ele) {

		if (ele.getAttribute("checked").equals("false"))
			ele.click();

	}

	public void selectRadioButton(By by) {
		if (driver.findElement((by)).getAttribute("checked")
				.equalsIgnoreCase("false"))
			driver.findElement((by)).click();
	}

	public void selectRadioButton(By[] by) {
		for (By by2 : by) {
			if (driver.findElement((by2)).getAttribute("checked")
					.equalsIgnoreCase("false"))
				driver.findElement((by2)).click();
		}

	}

	public void selectRadioButton(WebElement ele[]) {
		for (WebElement ele1 : ele) {
			if (ele1.getAttribute("checked").equals("false"))
				ele1.click();
		}

	}

	public void SendData(WebElement ele, String Data) {
		ele.clear();
		ele.sendKeys(Data);

	}

	public void SendData(By by, String Data) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(Data);
	}

	public void SelectDOB(By by, String Year, String Month, String Day) {
		// TODO Auto-generated method stub

	}

	public void SelectDOB(By by) {
		// TODO Auto-generated method stub

	}

	public void Rotate() {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		if (((Rotatable) augmentedDriver).getOrientation().name()
				.equals("LANDSCAPE"))
			((Rotatable) augmentedDriver).rotate(ScreenOrientation.PORTRAIT);
		else
			((Rotatable) augmentedDriver).rotate(ScreenOrientation.LANDSCAPE);
	}

	public void swipe(Double Xstart, Double YStart, Double XEnd, Double YEnd) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		swipeObject.put("startX", Xstart);
		swipeObject.put("startY", YStart);
		swipeObject.put("endX", XEnd);
		swipeObject.put("endY", YEnd);
		swipeObject.put("duration", 1.0);
		js.executeScript("mobile: swipe", swipeObject);

	}

	public void tap(Double X, Double Y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, Double> TapObject = new HashMap<String, Double>();
		TapObject.put("X", X);
		TapObject.put("Y", Y);
		js.executeScript("mobile:tap", TapObject);

	}

	public void SelectFromDropDown(By by, String Value) {
		driver.findElement(by).click();
		driver.findElement(By.name(Value)).click();

	}

	public void SelectFromDropDown(By by) {
		// needs to be tested
		driver.findElement(by).click();
		// driver.findElement(By.name(Value)).click();

	}

	public void SelectFromDropDown(WebElement ele, String Value) {
		ele.click();
		driver.findElement(By.name(Value)).click();

	}

	public void SelectFromDropDown(WebElement ele) {
		// needs to be tested
		ele.click();

	}

	public void SelectFromDropDown(By[] by, String[] Value) {
		int ctr = 0;
		for (By by2 : by) {
			driver.findElement(by2).click();
			driver.findElement(By.name(Value[ctr])).click();
			ctr++;
		}

	}

	public void SelectFromDropDown(By[] by) {

		for (By by2 : by) {
			/* driver.findElement(by2).click(); */
			Select selectBox = new Select(driver.findElement(by2));
			selectBox.getFirstSelectedOption().click();
		}

	}

	public void SelectFromDropDown(WebElement[] ele, String[] Value) {
		int ctr = 0;
		for (WebElement ele1 : ele) {
			ele1.click();
			driver.findElement(By.name(Value[ctr])).click();
			ctr++;
		}

	}

	public void SelectFromDropDown(WebElement[] ele) {

		for (WebElement ele1 : ele) {
			Select selectBox = new Select(driver.findElement((By) ele1));
			selectBox.getFirstSelectedOption().click();
		}

	}

	public boolean FeildsAreEqualInSize(By by[]) {
		Dimension BaseSize = driver.findElement(by[0]).getSize();
		Boolean a = true;
		for (By element : by) {
			if (!driver.findElement(element).getSize().equals(BaseSize)) {
				a = false;
				break;
			}

		}
		return a;
	}

	public boolean FeildsAreEqualInSize(By Base, By Feild) {
		Dimension BaseSize = driver.findElement(Base).getSize();
		if (!driver.findElement(Feild).getSize().equals(BaseSize))
			return false;
		else
			return true;
	}

	public boolean FeildsAreEqualInSize(WebElement Base, By Feild) {
		Dimension BaseSize = Base.getSize();
		if (!driver.findElement(Feild).getSize().equals(BaseSize))
			return false;
		else
			return true;
	}

	public boolean FeildsAreEqualInSize(By Base, WebElement Feild) {
		Dimension BaseSize = driver.findElement(Base).getSize();
		if (!Feild.getSize().equals(BaseSize))
			return false;
		else
			return true;
	}

	public boolean FeildsAreEqualInSize(By Base, WebElement[] Feild) {

		Dimension BaseSize = driver.findElement(Base).getSize();
		Boolean a = true;
		for (WebElement element : Feild) {
			if (!element.getSize().equals(BaseSize)) {
				a = false;
				break;
			}

		}
		return a;
	}

	public boolean FeildsAreEqualInSize(By Base, By[] Feild) {
		Dimension BaseSize = driver.findElement(Base).getSize();
		Boolean a = true;
		for (By element : Feild) {
			if (!driver.findElement(element).getSize().equals(BaseSize)) {
				a = false;
				break;
			}

		}
		return a;
	}

	public boolean FeildsAreVerticallyAlinged(By Base, By Feild) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().x;
			int ele = driver.findElement(Feild).getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().y;
			int ele = driver.findElement(Feild).getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}
	}

	public boolean FeildsAreVerticallyAlinged(WebElement Base, By Feild) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = Base.getLocation().x;
			int ele = driver.findElement(Feild).getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = Base.getLocation().y;
			int ele = driver.findElement(Feild).getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}
	}

	public boolean FeildsAreVerticallyAlinged(By by[]) {
		Boolean a = true;
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(by[0]).getLocation().x;
			for (By element : by) {
				int ele = driver.findElement(element).getLocation().x;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		} else {
			int BaseSize = driver.findElement(by[0]).getLocation().y;
			for (By element : by) {
				int ele = driver.findElement(element).getLocation().y;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		}

	}

	public boolean FeildsAreVerticallyAlinged(By Base, WebElement Feild) {

		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().x;
			int ele = Feild.getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().y;
			int ele = Feild.getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}

	}

	public boolean FeildsAreVerticallyAlinged(By Base, WebElement[] Feild) {
		Boolean a = true;
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().x;
			for (WebElement element : Feild) {
				int ele = element.getLocation().x;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().y;
			for (WebElement element : Feild) {
				int ele = element.getLocation().y;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		}
	}

	public boolean FeildsAreVerticallyAlinged(By Base, By[] Feild) {
		Boolean a = true;
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().x;
			for (By element : Feild) {
				int ele = driver.findElement(element).getLocation().x;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().y;
			for (By element : Feild) {
				int ele = driver.findElement(element).getLocation().y;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		}

	}

	public boolean FeildsAreHorizontallyAlinged(By Base, By Feild) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().y;
			int ele = driver.findElement(Feild).getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().x;
			int ele = driver.findElement(Feild).getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}
	}

	public boolean FeildsAreHorizontallyAlinged(WebElement Base, By Feild) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = Base.getLocation().y;
			int ele = driver.findElement(Feild).getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = Base.getLocation().x;
			int ele = driver.findElement(Feild).getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}
	}
	

	public boolean FeildsAreHorizontallyAlinged(By Base, WebElement Feild) {
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().y;
			int ele = Feild.getLocation().y;
			if (BaseSize != ele)
				return false;
			else
				return true;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().x;
			int ele = Feild.getLocation().x;
			if (BaseSize != ele)
				return false;
			else
				return true;
		}
	}

	public boolean FeildsAreHorizontallyAlinged(By Base, WebElement[] Feild) {
		Boolean a = true;
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().y;
			for (WebElement element : Feild) {
				int ele = element.getLocation().y;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().x;
			for (WebElement element : Feild) {
				int ele = element.getLocation().x;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		}
	}

	public boolean FeildsAreHorizontallyAlinged(By Base, By[] Feild) {
		Boolean a = true;
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String orientation = ((Rotatable) augmentedDriver).getOrientation()
				.name();
		if (orientation == "PORTRAIT") {
			int BaseSize = driver.findElement(Base).getLocation().y;
			for (By element : Feild) {
				int ele = driver.findElement(element).getLocation().y;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		} else {
			int BaseSize = driver.findElement(Base).getLocation().x;
			for (By element : Feild) {
				int ele = driver.findElement(element).getLocation().x;
				if (BaseSize != ele) {
					a = false;
					break;
				}

			}
			return a;
		}

	}

	public boolean FeildsAreBelowReqFeilds(By Base, By Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreBelowReqFeilds(WebElement Base, By Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreBelowReqFeilds(By Base, WebElement Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreBelowReqFeilds(By Base, WebElement[] Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreBelowReqFeilds(By Base, By[] Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreAboveReqFeilds(By Base, By Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreAboveReqFeilds(WebElement Base, By Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreAboveReqFeilds(By Base, WebElement Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreAboveReqFeilds(By Base, WebElement[] Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean FeildsAreAboveReqFeilds(By Base, By[] Feild) {
		// TODO Auto-generated method stub
		return false;
	}

	public void deselectAll(By Base) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.deselectAll();
	}

	public void deselectByIndex(By Base, int index) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.deselectByIndex(index);
	}

	public void deselectByValue(By Base, String value) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.deselectByValue(value);
	}

	public void deselectByVisibleText(By Base, String value) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.deselectByVisibleText(value);
	}

	public String getAllSelectedOptions(By Base) {
		String text = null;
		Select selectBox = new Select(driver.findElement(Base));
		List<WebElement> selectOptions = selectBox.getAllSelectedOptions();
		for (WebElement temp : selectOptions) {
			text = temp.getText();
		}

		return text;

	}
	


	public String getFirstSelectedOption(By Base) {
		Select selectBox = new Select(driver.findElement(Base));
		String firstOption = selectBox.getFirstSelectedOption().getText();
		return firstOption;
	}

	public String getOptions(By Base) {
		/*String gdata[];
		Select selectBox = new Select(driver.findElement(Base));
		List<WebElement> selectOptions = selectBox.getOptions();
		for (WebElement temp : selectOptions) {
			gdata[]= temp.getText();
		}

		return gdata;*/
		return null;
	}

	public boolean isMultiple(By Base) {

		Select selectBox = new Select(driver.findElement(Base));
		selectBox.isMultiple();
		return true;
	}

	public void selectByValue(By Base, String Value) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.selectByValue(Value);

	}

	public void selectByIndex(By Base, int index) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.selectByIndex(index);

	}

	public void selectByVisibleText(By Base, String value) {
		Select selectBox = new Select(driver.findElement(Base));
		selectBox.selectByVisibleText(value);

	}

	
	public void doubleTap(WebElement onElement) {
		 WebElement elem = driver.findElement((By) onElement);
	      Action TchAct = new TouchActions(driver).doubleTap(elem).build();
	      TchAct.perform();
		
	}


	public void down(int x, int y) {
		TouchActions f = new TouchActions(driver);
		f.down(x, y).build().perform();
	}


	public void up(int x, int y) {
		TouchActions f = new TouchActions(driver);
		f.up(x, y).build().perform();
		
		
	}


	public void flick(int xSpeed, int ySpeed) {
		TouchActions f = new TouchActions(driver);
		
		f.flick(xSpeed, ySpeed);
		
	}


	public void flick(WebElement onElement, int xOffset, int yOffset, int speed) {
		
		 WebElement elem = driver.findElement((By) onElement);
		Action TchAct = new TouchActions(driver) .flick(elem,xOffset,yOffset,FlickAction.SPEED_NORMAL).build();
		//SPEED_NORMAL
	      TchAct.perform();
		
		
	}


	public void longPress(WebElement onElement) {
		TouchActions act=new TouchActions(driver);
		act.longPress(onElement);
		
		
	}

	
	public void move(int x, int y) {
		TouchActions f = new TouchActions(driver);
		f.move(x, y).build().perform();
		
	}


	public void singleTap(WebElement onElement) {
		 WebElement elem = driver.findElement((By) onElement);
		 Action TchAct = new TouchActions(driver).singleTap(elem).build();
	      TchAct.perform();
	}
	public void singleTap(By by) {
		 WebElement elem = driver.findElement(by);
		 Action TchAct = new TouchActions(driver).singleTap(elem).build();
	      TchAct.perform();
	}
	@Override
	public boolean verifyErrorMessage(By by, String ExpectedMessage) {
		String actualText=driver.findElement(by).getText();
		return actualText.equals(ExpectedMessage);
		
	}
	public void waitForElement(By by)
	{
//	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	 WebElement e=driver.findElement(by);
	 
	 WebDriverWait wait=new WebDriverWait(Driver.driver,60);
	 WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	 
	}
	@Override
	public boolean verifyErrorMessage(WebElement ele, String ExpectedMessage) {
		return false;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hideKeyBoard() {
		Driver.driver.navigate().back();
		
		
		
	}

	
}
