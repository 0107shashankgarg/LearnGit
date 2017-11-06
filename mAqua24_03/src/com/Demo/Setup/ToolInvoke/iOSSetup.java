package com.Demo.Setup.ToolInvoke;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Demo.BusinessLayer.PageObject.PageObject;
import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.GetAttributes.SetAttributes;
import com.Demo.Utilities.Driver;
import com.Demo.Utilities.TestForceStop;

public class iOSSetup {
    public static RemoteWebDriver driver = null;
    public static PageObject Locaters;
    public String env = null;
    public iOSSetup(HashMap<String, String> taskDetails)  {
    	
   	   	LaunchReqEnv Env  = new LaunchReqEnv();
   	   	
    	//Command prompt code to launch Appium automatically 
    	//Env.StartAppium();	
   	   	
 // Reading he required startup parameters	
       
//Setting Appium capabilities for iOS      
    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	//capabilities.setCapability("deviceName","iPad");        
      // capabilities.setCapability("platformVersion", "7.1");
    	capabilities.setCapability("deviceName", taskDetails.get("deviceName"));  
    //	capabilities.setCapability("deviceName", taskDetails.get("deviceName").toString());
       capabilities.setCapability("platformVersion", "8.1");
    	
        capabilities.setCapability("platformName", "iOS");  
        capabilities.setCapability("launchTimeout", 60000);  
        capabilities.setCapability("fullReset", true); 
        capabilities.setCapability("rotatable", true);
      // capabilities.setCapability("app", "/Users/adeptpros/Desktop/WJIV_iOS 4.app");
        capabilities.setCapability("app", "/Users/shashank/Downloads/WJIV_iOS 4.app"); 
        capabilities.setCapability("newCommandTimeout", 120);  
       // capabilities.setCapability("app", capb.AppPath);    
        //iPhone 5s (8.1 Simulator)
// Get the page object attributes for android         
        Locaters = new PageObject();		
   	    Locaters.iOS();
   		
//Starting the appium server with given port number.   
   	    try {
   	     LogSetter.logger.info("creating appium seassion");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Driver.driver = driver;
        } catch (Exception e1) {
        	//LogSetter.logger.error("error starting appium session ");
        	TestForceStop.stopExec("can not crate appium season");
            e1.printStackTrace();
        }
   	    finally
   	    {
   	    	if (driver!=null) {
   	    		LogSetter.logger.info("appium session created");
			}
   	    	else
   	    	{
   	    		LogSetter.logger.error("error in appium cration");
   	    		
   	    	}
   	    }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
            LogSetter.logger.info("appium started with the seleced congiguration");
                    
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }
}
	

