package com.Demo.Scripts.TestInstance;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestCase.TC198606_ValidateForgotPasswordLink;
import com.Demo.Scripts.TestCase.TC198607_ValidateThatUserLandsToFrgPassPage;
import com.Demo.Scripts.TestCase.TC198610_ValidateCancelLink;
public class WJIV_3326_ResetPasswordTestInstance extends Faulttolerence    {
	String enviornment;
	public WJIV_3326_ResetPasswordTestInstance(String enviornment) throws ClassNotFoundException
	{
		this.enviornment = enviornment;		
	    add( new TC198606_ValidateForgotPasswordLink(enviornment));	   
		add(new TC198607_ValidateThatUserLandsToFrgPassPage( enviornment));	
		//add(new TC198608_ValidateFunctionalityForInvalidUser( enviornment));			
		//add(new TC198610_ValidateCancelLink(enviornment));
		ExecuteSteps();
		
	}
}


