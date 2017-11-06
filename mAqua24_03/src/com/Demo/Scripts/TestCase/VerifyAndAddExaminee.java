package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.AddNewExaminee;
import com.Demo.Scripts.TestSteps.NavigateToAddExaminee;

public class VerifyAndAddExaminee extends Faulttolerence{
	String enviornment;
	public VerifyAndAddExaminee(String enviornment ) 
	{
		this.enviornment = enviornment;
		// add(new ValidateLoginPage(enviornment));
	   add(new NavigateToAddExaminee(enviornment));
	   add(new AddNewExaminee(enviornment));
//	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
//		add(new TS_806616_VerifyFrgPassLink(enviornment));
//		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
