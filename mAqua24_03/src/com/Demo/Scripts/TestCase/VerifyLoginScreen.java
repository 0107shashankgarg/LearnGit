package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.TS_806614_VerifyFrgPassLinkPos;
import com.Demo.Scripts.TestSteps.TS_806615_VerifyFrgPassLinkClickable;
import com.Demo.Scripts.TestSteps.TS_806616_VerifyFrgPassLink;
import com.Demo.Scripts.TestSteps.TS_806617_VerifyFrgPassLinkNavigation;

public class VerifyLoginScreen extends Faulttolerence{
	String enviornment;
	public VerifyLoginScreen(String enviornment ) 
	{
		this.enviornment = enviornment;
	   add(new TS_806614_VerifyFrgPassLinkPos(enviornment));
	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
		add(new TS_806616_VerifyFrgPassLink(enviornment));
		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
