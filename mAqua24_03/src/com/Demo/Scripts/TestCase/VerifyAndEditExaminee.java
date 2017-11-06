package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.EditExaminee;
import com.Demo.Scripts.TestSteps.NavigateToEditExaminee;
import com.Demo.Scripts.TestSteps.VerifyEditExamineeScreen;

public class VerifyAndEditExaminee extends Faulttolerence{
	String enviornment;
	public VerifyAndEditExaminee(String enviornment ) 
	{
		this.enviornment = enviornment;
		add(new NavigateToEditExaminee(enviornment));
		add(new VerifyEditExamineeScreen(enviornment));
		add(new EditExaminee(enviornment));
//	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
//		add(new TS_806616_VerifyFrgPassLink(enviornment));
//		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
