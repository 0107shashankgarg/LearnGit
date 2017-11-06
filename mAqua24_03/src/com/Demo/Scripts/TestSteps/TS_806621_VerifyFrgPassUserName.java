package com.Demo.Scripts.TestSteps;


import org.testng.Assert;

import com.Demo.BusinessLayer.Interfaces.Login;




public class TS_806621_VerifyFrgPassUserName  {
	String enviornment;	
	public TS_806621_VerifyFrgPassUserName(String enviornment) {
		this.enviornment = enviornment;
	}

	public void execute() {				
		Login screen; 
		if (enviornment == "Android") 
		{
			com.Demo.BusinessLayer.Screens.Android.LoginUI screen1 = new com.Demo.BusinessLayer.Screens.Android.LoginUI(enviornment);
			screen = screen1;
		}
				
		 else 
		 {
			 com.Demo.BusinessLayer.Screens.iOS.LoginUI screen2 = new com.Demo.BusinessLayer.Screens.iOS.LoginUI(enviornment);
			screen = screen2;
		 }
				
		Assert.assertTrue(screen.IsForUserNameFeildPresent());
	
	}
}

