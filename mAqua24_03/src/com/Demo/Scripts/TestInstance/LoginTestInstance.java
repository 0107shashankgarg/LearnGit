package com.Demo.Scripts.TestInstance;


import com.Demo.Reporter.Faulttolerence;
import com.Demo.Scripts.TestCase.LogOut;
import com.Demo.Scripts.TestCase.Login;
import com.Demo.Scripts.TestCase.VerifyAndAddExaminee;
import com.Demo.Scripts.TestCase.VerifyAndDeleteExaminee;
import com.Demo.Scripts.TestCase.VerifyAndEditExaminee;
import com.Demo.Scripts.TestCase.VerifyAndSearchExaminee;
public class LoginTestInstance extends Faulttolerence    {
	String enviornment;
	public LoginTestInstance(String enviornment) throws ClassNotFoundException
	{
		this.enviornment = enviornment;		
	   // add( new VerifyLoginScreen(enviornment));	   
		add(new Login( enviornment));	
		//add(new TC198608_ValidateFunctionalityForInvalidUser( enviornment));			
		//add(new TC198610_ValidateCancelLink(enviornment));
		add(new VerifyAndAddExaminee( enviornment));
		add(new VerifyAndSearchExaminee( enviornment));
		add(new VerifyAndEditExaminee( enviornment));
		add(new VerifyAndSearchExaminee( enviornment));
		add(new VerifyAndDeleteExaminee( enviornment));
		add(new LogOut(enviornment));
		ExecuteSteps();
	
		
	}
}


