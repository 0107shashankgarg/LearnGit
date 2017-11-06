package com.Demo.Reporter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import com.Demo.Utilities.Driver;

public class ExceptionManager{
	 File scrFile;
	public HashMap<String, String> processException(Exception e,String stepFailReason,String failureReason,String simpleclassName)
	{
		
		Random ran = new Random();
		String imageName=simpleclassName+ran.nextInt()+".png";
		String screenShotFileName=ResultRepo.screenshotName+imageName; 
		//String screenShotFileName=ResultRepo.screenshotName+simpleclassName+ran.nextInt()+".png";
		HashMap<String, String>stepExceptionData=new HashMap<>();
		try {   
		Thread.sleep(1000);
	//	WebDriver d =  new Augmenter().augment(Driver.driver);
		 
	
		    // scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			 scrFile = ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	    try {

	    File testScreenShot = new File(screenShotFileName);
	    FileUtils.copyFile(scrFile, testScreenShot);
	    
	    File webDirFile = new File("/Users/shashank/Documents/Shashank/mAquaWebL/mAquaWeb/Screenshots/"+imageName);
	    FileUtils.copyFile(scrFile,webDirFile);
	    } catch (IOException e2) {
	    	e2.printStackTrace();
	    }

	/*	File scrFile = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(scrFile, new File(screenShotFileName));*/
			/*  augmentedDriver = new Augmenter().augment(Driver.driver);
			  File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE); 
			  File screenshot = ((TakesScreenshot)
			  Driver.driver).getScreenshotAs(OutputType.FILE);
			  filename =System.getProperty("user.dir")+"\\Screenshots\\"+CurrentStep+ran.nextInt()+".png"; 
			  filename = ResultRepo.screenshotName+CurrentStep+ran.nextInt()+".png";
			  FileUtils.copyFile(screenshot, new File(filename));*/
			 
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		stepFailReason = e.getCause().toString();

		if (failureReason == null)
			failureReason = e.getCause().toString() + "("
					+ simpleclassName + ")";
		else
			failureReason = failureReason + "<br>" + e.getCause()
					+ "(" + simpleclassName + ")";
	stepExceptionData.put("stepFailReason", stepFailReason);
	stepExceptionData.put("failureReason", failureReason);
	stepExceptionData.put("simpleclassName", simpleclassName);
	stepExceptionData.put("filename", screenShotFileName);
	return stepExceptionData;
	}
}
