package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.EnterSearchInformationAndSearchScreen;
import com.Demo.Scripts.TestSteps.NavigateToSearchExaminee;
import com.Demo.Scripts.TestSteps.VerifyExamineeScreen;
import com.Demo.Scripts.TestSteps.VerifySearchExamineeResultScreen;

public class VerifyAndSearchExaminee extends Faulttolerence{
	String enviornment;
	public VerifyAndSearchExaminee(String enviornment ) 
	{
		this.enviornment = enviornment;
		// add(new ValidateLoginPage(enviornment));
	   add(new NavigateToSearchExaminee(enviornment));
	   add(new VerifyExamineeScreen(enviornment));
	    add(new EnterSearchInformationAndSearchScreen(enviornment));
	    add(new VerifySearchExamineeResultScreen(enviornment));
	   
	   
	   
//	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
//		add(new TS_806616_VerifyFrgPassLink(enviornment));
//		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
