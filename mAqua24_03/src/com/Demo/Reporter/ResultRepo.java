package com.Demo.Reporter;

import java.io.File;

public class ResultRepo {
	public static  File results =null;	
	public static  File screenShots=null;
	public static String screenshotName=null;
	public static String reportName=null;
	
	public static void ResultDir() {
		
		String OS = System.getProperty("os.name"); 
		
		if(OS.contains("windows"))
		{
			results = new File(System.getProperty("user.dir")+"\\Results\\");
			reportName=System.getProperty("user.dir")+"\\Results\\";
			
			screenShots = new File(System.getProperty("user.dir")+"\\Screenshots\\");
			screenshotName=System.getProperty("user.dir")+"\\Screenshots\\";
		}
		else
		{
			results = new File(System.getProperty("user.dir")+"/Results/");
			reportName=System.getProperty("user.dir")+"/Results/";
			screenShots = new File(System.getProperty("user.dir")+"/Screenshots/");
			screenshotName=System.getProperty("user.dir")+"/Screenshots/";
		}
		  if (!results.exists()) {
		    boolean result = false;

		    try{
		    	results.mkdir();
		        result = true;
		     } catch(SecurityException se){
		     }        
		     if(result) {    
		       System.out.println("DIR created");  
		     }
		  }
		  
		  if (!screenShots.exists()) {
			    System.out.println("creating directory: " + screenShots);
			    boolean result = false;

			    try{
			    	screenShots.mkdir();
			        result = true;
			     } catch(SecurityException se){
			     }        
			     if(result) {    
			       System.out.println("DIR created");  
			     }
			  }
		
	}

	

}
