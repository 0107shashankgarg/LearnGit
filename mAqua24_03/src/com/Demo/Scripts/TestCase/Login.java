package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.SetCredentialAndLogin;
import com.Demo.Scripts.TestSteps.ValidateLoginPage;
import com.Demo.Scripts.TestSteps.VerifyLoginScreen;

public class Login extends Faulttolerence{
	String enviornment;
	public Login(String enviornment ) 
	{
		this.enviornment = enviornment;
		 add(new ValidateLoginPage(enviornment));
		   add(new VerifyLoginScreen(enviornment));
	   add(new SetCredentialAndLogin(enviornment));
	  
//	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
//		add(new TS_806616_VerifyFrgPassLink(enviornment));
//		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
