package com.Demo.Scripts.Sprints;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;
import com.Demo.Utilities.Driver;
import com.Demo.Utilities.taskConfig;




 public class AfterSuit {
	 
	
	 @Test
	public void afterTest() {				
		
	System.out.println("after suit");
	LogSetter.logger.info("executing after suit");
	taskConfig.updateTaskStatus(EnviornmentSetup.taskDetails.get("taskId"),EnviornmentSetup.taskDetails.get("taskDeviceId"));
	if (EnviornmentSetup.taskDetails.get("platformName").equalsIgnoreCase("Android")) {
		try {
			Runtime.getRuntime().exec("/Users/shashank/Documents/Java/adt-bundle-mac-x86_64-20140321/sdk/platform-tools/adb emu kill");
			//p = Runtime.getRuntime().exec("pwd");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else
	{
		LogSetter.logger.info("clocsing appium seassion.");
		Driver.driver.quit();
		//p = Runtime.getRuntime().exec("pwd");
	}
	LogSetter.logger.info("execution completed");
	}
	
	
	
	
	
}
