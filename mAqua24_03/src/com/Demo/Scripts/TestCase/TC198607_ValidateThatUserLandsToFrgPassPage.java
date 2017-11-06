package com.Demo.Scripts.TestCase;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestSteps.TS_806619ClickForgotPassword;
import com.Demo.Scripts.TestSteps.TS_806620_VerifyTitlePage;
import com.Demo.Scripts.TestSteps.TS_806621_VerifyFrgPassUserName;
import com.Demo.Scripts.TestSteps.TS_806622_VerifySendEmailButton;
import com.Demo.Scripts.TestSteps.TS_806623_VerifyCancelButton;
import com.Demo.Scripts.TestSteps.TS_806624_VerifyFormat;
import com.Demo.Scripts.TestSteps.TS_806625_VerifyLableFeild;

public class TC198607_ValidateThatUserLandsToFrgPassPage extends Faulttolerence{
	String enviornment;
	public TC198607_ValidateThatUserLandsToFrgPassPage(String enviornment ) 
	{
		this.enviornment = enviornment;
		add(new TS_806619ClickForgotPassword(enviornment));
		add(new TS_806620_VerifyTitlePage(enviornment));
		//add(new TS_806621_VerifyFrgPassUserName(enviornment));
		//add(new TS_806622_VerifySendEmailButton(enviornment));
		//add(new TS_806623_VerifyCancelButton(enviornment));
		//add(new TS_806624_VerifyFormat(enviornment));
		//add(new TS_806625_VerifyLableFeild(enviornment));
		
		
	}

}
