package com.Demo.Setup.ToolInvoke;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Demo.BusinessLayer.PageObject.PageObject;
import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.GetAttributes.SetAttributes;
import com.Demo.Utilities.Driver;

public class AndroidSetup {
	public static RemoteWebDriver driver = null;
	public static PageObject Locaters;
	
	public AndroidSetup(HashMap<String, String> taskDetails) {
// Reading he required startup parameters	
				
		
//Command prompt code to launch Appium automatically 
		LaunchReqEnv Env  = new LaunchReqEnv();
		
//Command to launch the required Avd by config provided by the user			
		Env.startdevice(taskDetails.get("deviceName").replace(" ", "_"));
	
//Command prompt code to launch Appium automatically 
	//	Env.StartAppium();	
		
//Setting Appium capabilities for Andriod
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", taskDetails.get("deviceName").replace(" ", "_"));
		capabilities.setCapability(CapabilityType.VERSION, "4.2.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("fullReset", true);
		capabilities.setCapability("deviceOrientation", "POTRAIT");
	
//		capabilities.setCapability("app-package", "com.hmh.wjiv");
//		capabilities.setCapability("app-activity", "com.hmh.wjiv.view.activities.Wjiv");
		
		//capabilities.setCapability("app-package", "WJIV_Andriod.WJIV_Andriod");
		//capabilities.setCapability("app-activity", "WJIV_Andriod.MainActivity");
		
		capabilities.setCapability("newCommandTimeout",120);
		capabilities.setCapability("rotatable", true);
		//capabilities.setCapability("appWaitActivity", 600000);
		//capabilities.setCapability("deviceReadyTimeout",600000);
		//capabilities.setCapability("deviceReadyTimeout",600000);
	    capabilities.setCapability("avd", taskDetails.get("deviceName").replace(" ", "_"));
		capabilities.setCapability("avdReadyTimeout", 60000);
		capabilities.setCapability("avdLaunchTimeout", 60000);
		//change
		capabilities.setCapability("app", "/Users/shashank/Documents/Shashank/apk/WJIV.apk");
		//capabilities.setCapability("app", taskDetails.get("buildName"));
		//capabilities.setCapability("deviceName","0a3ec68f");   
// Get the page object attributes for android 
		Locaters = new PageObject();
		Locaters.Android();

//Starting the appuim server with given port number.
		try {

			//driver = new AppiumDriver(new URL("http://127.0.0.1:4728/wd/hub"),
					//capabilities);
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);
			Driver.driver = driver;
			
			

		} catch (MalformedURLException e) {			
			e.printStackTrace();
			//LogSetter.logger.error("error starting appium session "+e.getMessage());
		}
		finally
   	    {
   	    	if (driver!=null) {
   	    		LogSetter.logger.info("appium session created");
			}
   	    	else
   	    	{
   	    		  
   	    	}
   	    }
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LogSetter.logger.info("appium started with the seleced congiguration");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	public void StartAppium() {
	}

	public void LaunchAvd() {
	}
}
