package com.Demo.Scripts.TestSteps;


import org.testng.Assert;

import com.Demo.BusinessLayer.Interfaces.Login;




public class ValidateLoginPage  {
	String enviornment;	
	public ValidateLoginPage(String enviornment) {
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
//		Assert.assertTrue(false);		
//		Assert.assertFalse(screen.IsForgotPasswordLinkPresent());
//	Assert.assertTrue(screen.IsForgotPasswordLinkPresent());
		screen.SetUserName("12345");
		screen.SetPassword("asdf");
		//mAqua.generic.hideKeyBoard();
		screen.clickLoginBtn();
		Assert.assertTrue(screen.verifyInvalidLoginErrorMsg("Username and/or Password is incorrect"));
		screen.clickOkBtn();
		
		/*screen.SetUserName("12345");
		screen.clickLoginBtn();
		Assert.assertTrue(screen.verifyInvalidLoginErrorMsg("Password field is required."));
		screen.clickOkBtn();
		
		screen.SetPassword("asdf");
		screen.clickLoginBtn();
		Assert.assertTrue(screen.verifyInvalidLoginErrorMsg("Username field is required."));
		screen.clickOkBtn();*/
		
	}
}

