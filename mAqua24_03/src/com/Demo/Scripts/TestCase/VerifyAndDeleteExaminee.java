package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.DeleteExaminee;
import com.Demo.Scripts.TestSteps.EnterSearchInformationAndSearchScreen;
import com.Demo.Scripts.TestSteps.NavigateToSearchExamineeFromExamineeInfoScreen;
import com.Demo.Scripts.TestSteps.VerifyExamineeInformationScreen;

public class VerifyAndDeleteExaminee extends Faulttolerence{
	String enviornment;
	public VerifyAndDeleteExaminee(String enviornment ) 
	{
		this.enviornment = enviornment;
		add(new NavigateToSearchExamineeFromExamineeInfoScreen(enviornment));
		add(new EnterSearchInformationAndSearchScreen(enviornment));
		add(new VerifyExamineeInformationScreen(enviornment));
		
		add(new DeleteExaminee(enviornment));
//	   add(new TS_806615_VerifyFrgPassLinkClickable(enviornment));
//		add(new TS_806616_VerifyFrgPassLink(enviornment));
//		add(new TS_806617_VerifyFrgPassLinkNavigation(enviornment));
		
	}

}
