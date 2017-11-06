package com.Demo.Scripts.TestSteps;


import java.util.Random;

import com.Demo.BusinessLayer.Interfaces.Login;
import com.Demo.models.ChildDetailsModel;




public class EditExaminee  {
	String enviornment;	
	public EditExaminee(String enviornment) {
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
		Random ran1=new Random();
		int num1=ran1.nextInt(9);
		/*HashMap editData=new HashMap();
		editData.put("lastName", "ExamL"+num1);
		editData.put("firstName", "ExamF"+num1);
		editData.put("examineeId", "ExamId"+num1);*/
		
		
		
		String firstName=ChildDetailsModel.FirstName+num1;
		String lastName=ChildDetailsModel.LastName+num1;
		String id=ChildDetailsModel.SubjectId+num1;
		
		screen.clearLastNameField();
		screen.clearFirstNameField();
		screen.clearExamineeIdField();
		screen.enterEditExamineeLname(lastName);
		screen.enterEditExamineeFname(firstName);
		screen.enterEditExamineeId(id);
		
		//RunTimeDataBucket.pushRunTimeData("newExaminee",editData);
		
		ChildDetailsModel.FirstName=firstName;
		ChildDetailsModel.LastName=lastName;
		ChildDetailsModel.SubjectId=id;
		
		screen.clickEditExamineeSaveBtn();
	}
}

