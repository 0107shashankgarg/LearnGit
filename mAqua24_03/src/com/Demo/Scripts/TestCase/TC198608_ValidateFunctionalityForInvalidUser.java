package com.Demo.Scripts.TestCase;

import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.TS_806614_VerifyFrgPassLinkPos;

public class TC198608_ValidateFunctionalityForInvalidUser extends Faulttolerence{
	String enviornment;
	public TC198608_ValidateFunctionalityForInvalidUser(String enviornment ) 
	{
		this.enviornment = enviornment;
		add(new TS_806614_VerifyFrgPassLinkPos(enviornment));
		
		
	}

}
