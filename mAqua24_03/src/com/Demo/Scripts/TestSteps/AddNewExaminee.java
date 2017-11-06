package com.Demo.Scripts.TestSteps;


import java.util.Random;

import org.testng.Assert;

import com.Demo.BusinessLayer.Interfaces.Login;
import com.Demo.models.ChildDetailsModel;




public class AddNewExaminee  {
	String enviornment;	
	public AddNewExaminee(String enviornment) {
		this.enviornment = enviornment;
	}

	public void execute() {				
		Login screen; 
		if (enviornment == "Android") 
		{
			com.Demo.BusinessLayer.Screens.Android.LoginUI screen1 = new com.Demo.BusinessLayer.Screens.Android.LoginUI(enviornment);
			screen = screen1;
		}
				
		 else 
		 {
			 com.Demo.BusinessLayer.Screens.iOS.LoginUI screen2 = new com.Demo.BusinessLayer.Screens.iOS.LoginUI(enviornment);
			screen = screen2;
		 }
//		Assert.assertTrue(false);		
//		Assert.assertFalse(screen.IsForgotPasswordLinkPresent());
//	Assert.assertTrue(screen.IsForgotPasswordLinkPresent());
		Random ran=new Random();
		int num=ran.nextInt(9999);
		
		String firstName=ChildDetailsModel.FirstName+num;
		String lastName=ChildDetailsModel.LastName+num;
		String id=ChildDetailsModel.SubjectId+num;
		/*data.put("lastName", lastName);
		data.put("firstName", firstName);
		data.put("examineeId", id);*/
		
		screen.enterLastNameName(lastName);
		screen.enterFirstName(firstName);
		screen.enterMiddleNameName("ExamM"+num);
		screen.selectGender(id);
		screen.setDob();
		screen.setEnrollmentDate();
		screen.selectCaseload("Referrals");
		screen.EnterExamineeId(id);
		screen.clickNewExamineeSaveBtn();
		Assert.assertEquals("ds", "3");
		
		ChildDetailsModel.FirstName=firstName;
		ChildDetailsModel.LastName=lastName;
		ChildDetailsModel.SubjectId=id;
		//RunTimeDataBucket.pushRunTimeData("newExaminee",data);
	
	}
}

