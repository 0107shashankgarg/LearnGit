package com.Demo.Scripts.TestSteps;


import com.Demo.BusinessLayer.Interfaces.Login;




public class DeleteExaminee  {
	String enviornment;	
	public DeleteExaminee(String enviornment) {
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
	/*	Random ran1=new Random();
		int num1=ran1.nextInt(9999);
		HashMap editData=new HashMap();
		editData.put("lastName", "ExamL"+num1);
		editData.put("firstName", "ExamF"+num1);
		editData.put("examineeId", "ExamId"+num1);
		
		screen.clearLastNameField();
		screen.clearFirstNameField();
		screen.clearExamineeIdField();
		screen.enterEditExamineeLname("ExamL"+num1);
		screen.enterEditExamineeFname("ExamF"+num1);
		screen.enterEditExamineeId("ExamId"+num1);
		
		RunTimeDataBucket.pushRunTimeData("newExaminee",editData);
		screen.clickEditExamineeSaveBtn();*/
		screen.deleteExaminee();
		
	}
}

