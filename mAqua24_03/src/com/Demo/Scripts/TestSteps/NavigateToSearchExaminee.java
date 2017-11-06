package com.Demo.Scripts.TestSteps;


import com.Demo.BusinessLayer.Interfaces.Login;




public class NavigateToSearchExaminee  {
	String enviornment;	
	public NavigateToSearchExaminee(String enviornment) {
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
		screen.navigateToSearchExamineeScreen();
	
	}
}

