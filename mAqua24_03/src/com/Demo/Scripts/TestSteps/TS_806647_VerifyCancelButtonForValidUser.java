package com.Demo.Scripts.TestSteps;


import com.Demo.BusinessLayer.Interfaces.Login;




public class TS_806647_VerifyCancelButtonForValidUser  {
	String enviornment;	
	public TS_806647_VerifyCancelButtonForValidUser(String enviornment) {
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
				
		
	
	}
}

