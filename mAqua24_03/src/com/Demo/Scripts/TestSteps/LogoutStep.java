package com.Demo.Scripts.TestSteps;


import com.Demo.BusinessLayer.Interfaces.Login;




public class LogoutStep  {
	String enviornment;	
	public LogoutStep(String enviornment) {
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
		

	/*	String firstName= ChildDetailsModel.FirstName;
		String lastName=ChildDetailsModel.LastName;
		String id =ChildDetailsModel.SubjectId;*/
		
		
		//HashMap newExaminee=(HashMap) RunTimeDataBucket.runTimeData.get("newExaminee");
		screen.logOut();
	}
}

