package com.Demo.Scripts.TestSteps;


import com.Demo.BusinessLayer.Interfaces.Login;
import com.Demo.models.LoginModel;




public class SetCredentialAndLogin  {
	String enviornment;	
	public SetCredentialAndLogin(String enviornment) {
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
		screen.SetUserName(LoginModel.Username);
		screen.SetPassword(LoginModel.Password);
		
		screen.clickLoginBtn();
	
	}
}

