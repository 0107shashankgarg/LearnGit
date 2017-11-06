package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.LogoutStep;

public class LogOut extends Faulttolerence{
	String enviornment;
	public LogOut(String enviornment ) 
	{
		this.enviornment = enviornment;
		// add(new ValidateLoginPage(enviornment));
		   add(new LogoutStep(enviornment));
	  // add(new SetCredentialAndLogin(enviornment));

		
	}

}
