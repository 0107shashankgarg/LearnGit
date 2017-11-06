package com.Demo.Scripts.TestCase;

import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.TS_806646_VerifyCancelButtonFunctionality;
import com.Demo.Scripts.TestSteps.TS_806647_VerifyCancelButtonForValidUser;

public class TC198610_ValidateCancelLink extends Faulttolerence{
	String enviornment;
	public TC198610_ValidateCancelLink(String enviornment ) 
	{
		this.enviornment = enviornment;
		add(new TS_806646_VerifyCancelButtonFunctionality(enviornment));
		add(new TS_806647_VerifyCancelButtonForValidUser(enviornment));
		
		
	}

}
