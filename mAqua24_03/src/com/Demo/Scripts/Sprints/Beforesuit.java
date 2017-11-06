package com.Demo.Scripts.Sprints;

import org.apache.log4j.MDC;
import org.testng.annotations.Test;

import com.Demo.Reporter.LogSetter;
import com.Demo.Setup.ToolInvoke.EnviornmentSetup;



 public class Beforesuit {
	 
	
	 @Test
	public void beforeTest() {		
		 MDC.put("projectId","2");
		 LogSetter.setLogClass("beforeTest");	
		
	LogSetter.logger.info("executing before suit");
	
    EnviornmentSetup.deviceEnviornmentSetup();
	
					
	}
	
	
	
	
}
