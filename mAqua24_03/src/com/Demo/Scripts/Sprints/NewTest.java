package com.Demo.Scripts.Sprints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.Demo.BusinessLayer.PageObject.PageObject;
import com.Demo.Setup.ToolInvoke.LaunchReqEnv;

public class NewTest {
  @Test
  public void f() {
	RemoteWebDriver driver = null;
/*	  RemoteWebDriver driver = null;
	     	   	LaunchReqEnv Env  = new LaunchReqEnv();
	     	   Process p = null;
	     	  String name = "Moto_E";
	   		String Avd = "emulator -avd "  + name; 
	   		try {
	   			Runtime.getRuntime().exec("/Users/shashank/Documents/Java/adt-bundle-mac-x86_64-20140321/sdk/tools/emulator -avd Moto_E");
	   			//p = Runtime.getRuntime().exec("pwd");
	   		} catch (IOException e) {
	   			// TODO Auto-generated catch block
	   			e.printStackTrace();
	   		}*/
	           
	          // BufferedReader stdInput = new BufferedReader(new
	             //   InputStreamReader(p.getInputStream()));
	      	//Command prompt code to launch Appium automatically 
	      	//Env.StartAppium();	
	     	   	
	   // Reading he required startup parameters	
	  DesiredCapabilities capabilities = new DesiredCapabilities();
  	//capabilities.setCapability("deviceName","iPad");        
    // capabilities.setCapability("platformVersion", "7.1");
  	capabilities.setCapability("deviceName", "iPhone 6");  
  //	capabilities.setCapability("deviceName", taskDetails.get("deviceName").toString());
     capabilities.setCapability("platformVersion", "8.1");
  	
      capabilities.setCapability("platformName", "iOS");  
      capabilities.setCapability("launchTimeout", 60000);  
      capabilities.setCapability("fullReset", true); 
      capabilities.setCapability("rotatable", true);
     capabilities.setCapability("app", "/Users/shashank/Downloads/WJIV_iOS 4.app");
     // capabilities.setCapability("app", "/Users/shashank/Desktop/untitled folder 4/WJIV_iOS.app"); 
     // capabilities.setCapability("app", capb.AppPath);    
      //iPhone 5s (8.1 Simulator)
//Get the page object attributes for android         
	   	
	     	    try {
	              driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	            
	          } catch (MalformedURLException e1) {
	          
	              e1.printStackTrace();
	          }
	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	              
	                      
	          try {
	              Thread.sleep(3000);
	          } catch (InterruptedException e) {
	             
	              e.printStackTrace();
	          }
	          try {
	        	  driver.quit();
	  			Runtime.getRuntime().exec("killall \"iOS Simulator\"");
	  			//p = Runtime.getRuntime().exec("pwd");
	  		} catch (IOException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	      }
	  
	  	


  }

