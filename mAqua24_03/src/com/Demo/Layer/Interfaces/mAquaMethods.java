package com.Demo.Layer.Interfaces;


import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface mAquaMethods {
	public boolean IsElementPresent(WebElement ele) ;
	public boolean IsElementPresent(By by);
	public boolean IsElementPresent(By by[]);
	public boolean IsElementPresent(WebElement ele[]);
	
	public boolean IsElementEnabled(WebElement ele);
	public boolean IsElementEnabled(WebElement ele[]);
	public boolean IsElementEnabled(By by);
	public boolean IsElementEnabled(By by[]);
	
	public boolean IsElementSeleted(WebElement ele);
	public boolean IsElementSeleted(WebElement ele[]);
	public boolean IsElementSeleted(By by);
	public boolean IsElementSeleted(By by[]);
	
	public boolean IsElementEnabledClickable(WebElement ele);
	public boolean IsElementEnabledClickable(WebElement ele[]);
	public boolean IsElementEnabledClickable(By by);
	public boolean IsElementEnabledClickable(By by[]);
	
	public void ClickElement(WebElement ele);
	public void ClickElement(WebElement ele[]);
	public void ClickElement(By by);
	public void ClickElement(By by[]);
	
	
	public void selectRadioButton(WebElement ele);
	public void selectRadioButton(By by);
	public void selectRadioButton(By by[]);
	public void selectRadioButton(WebElement ele[]);
	
	public void SendData(WebElement ele, String Data);
	public void SendData(By by, String Data);
	
	public  void SelectDOB(By by, String Year, String Month, String Day);
	public  void SelectDOB(By by);
	
	
	public void Rotate();
	public  void swipe(Double Xstart, Double YStart,Double XEnd, Double YEnd );
	public  void tap (Double X, Double Y );
	
	public  void SelectFromDropDown(By by, String Value);
	public  void SelectFromDropDown(By by);
	public  void SelectFromDropDown(WebElement ele, String Value);
	public  void SelectFromDropDown(WebElement ele);	
	public  void SelectFromDropDown(By by[], String Value[]);
	public  void SelectFromDropDown(By by[]);
	public  void SelectFromDropDown(WebElement ele[], String Value[]);
	public  void SelectFromDropDown(WebElement ele[]);
	public boolean verifyErrorMessage(By by,String ExpectedMessage);
	public boolean verifyErrorMessage(WebElement ele,String ExpectedMessage);
	// UI testing methods
	public boolean FeildsAreEqualInSize(By Base, By Feild);
	public boolean FeildsAreEqualInSize(WebElement Base, By Feild);
	public boolean FeildsAreEqualInSize(By Base, WebElement Feild);
	public boolean FeildsAreEqualInSize(By Base, WebElement Feild[]);
	public boolean FeildsAreEqualInSize(By Base, By Feild[]);
	public boolean FeildsAreEqualInSize (By by[]);
	
	public boolean FeildsAreVerticallyAlinged(By by[]);
	public boolean FeildsAreVerticallyAlinged(By Base, By Feild);
	public boolean FeildsAreVerticallyAlinged(WebElement Base, By Feild);
	public boolean FeildsAreVerticallyAlinged(By Base, WebElement Feild);
	public boolean FeildsAreVerticallyAlinged(By Base, WebElement Feild[]);
	public boolean FeildsAreVerticallyAlinged(By Base, By Feild[]);
	
	public boolean FeildsAreHorizontallyAlinged(By Base, By Feild);
	public boolean FeildsAreHorizontallyAlinged(WebElement Base, By Feild);
	public boolean FeildsAreHorizontallyAlinged(By Base, WebElement Feild);
	public boolean FeildsAreHorizontallyAlinged(By Base, WebElement Feild[]);
	public boolean FeildsAreHorizontallyAlinged(By Base, By Feild[]);
	
	public boolean FeildsAreBelowReqFeilds(By Base, By Feild);
	public boolean FeildsAreBelowReqFeilds(WebElement Base, By Feild);
	public boolean FeildsAreBelowReqFeilds(By Base, WebElement Feild);
	public boolean FeildsAreBelowReqFeilds(By Base, WebElement Feild[]);
	public boolean FeildsAreBelowReqFeilds(By Base, By Feild[]);
	
	public boolean FeildsAreAboveReqFeilds(By Base, By Feild);
	public boolean FeildsAreAboveReqFeilds(WebElement Base, By Feild);
	public boolean FeildsAreAboveReqFeilds(By Base, WebElement Feild);
	public boolean FeildsAreAboveReqFeilds(By Base, WebElement Feild[]);
	public boolean FeildsAreAboveReqFeilds(By Base, By Feild[]);
	
	public void deselectAll(By Base);
	public void deselectByIndex(By Base,int index);
	public void deselectByValue(By Base,String value);
	 public void deselectByVisibleText(By Base,String value);
	 public String getAllSelectedOptions(By Base);
	 public String getFirstSelectedOption(By Base);
	 public String getOptions(By Base);
	 public boolean isMultiple(By Base);
	 public void selectByValue(By Base,String Value);
	 public void selectByIndex(By Base,int index);
	 public void selectByVisibleText(By Base,String value);
	 
	 public void doubleTap(WebElement onElement);
	 public void down(int x, int y);
	 public void up(int x, int y);
	 public void flick(int xSpeed, int ySpeed);
	 public void flick(WebElement onElement, int xOffset, int yOffset, int speed);
	 public void longPress(WebElement onElement);
	 public void move(int x, int y);
	 public void singleTap(WebElement onElement);
	 public void singleTap(By by);
	 
	 public void waitForElement(By by);
	 
	public void hideKeyBoard();
	public String getDisplayedText(By by);
	public String getDisplayedText(WebElement ele);
	
	

}
