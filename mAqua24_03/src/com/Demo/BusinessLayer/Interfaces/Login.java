
package com.Demo.BusinessLayer.Interfaces;

public interface Login {
		
	public	void SetUserName(String Username);
	public void SetPassword(String Password);
	public void clickLoginBtn();
//	public	void ClickLogin();
	public Boolean IsUserNameFeildPresent();
	public Boolean IsPasswordFeildPresent();
	public Boolean IsLoginButtonPresent();
	public Boolean IsRememberMeCheckBoxPresesnt();
	public Boolean IsForgotPasswordLinkPresent();	
	public Boolean IsForgotPasswordCancelButtonPresent();
	public Boolean IsForgotPasswordHeadingPresent();
	public Boolean IsForgotPasswordPopupPresent();
	public Boolean IsCancelButtonPresent();
	public void clickNewExamineeSaveBtn();
	
	//public Boolean IsUserNameMandatoryErrorPresent();
	//public Boolean IsPasswordNameMandatoryErrorPresent();
	//public Boolean IsPasswordBelowUserName();
	//public Boolean IsPasswordAndUserOfSameSize();	
	//public Boolean IsPasswordAndUserAlinged();
	//public Boolean IsEnterValidUserErrorPresent();
	//public Boolean UsernameAndPasswordReq();
	public void ClearUserName();
	public void ClearPassword();
	public Boolean IsEmailSentMessagePresent();
	public Boolean IsOnDashboard();
	public void ClickForgetPassword();
	public Boolean IsForgotPassPageFormatted();	
	public Boolean IsEnterUserNameTextPresent();	
	public Boolean IsRememberMeTextPresesnt();	
	public Boolean IsPleaseEnterUserNamePopupPresent();
	public void CheckRememberMe();
	public Boolean IsRememberMeClickable();
	public Boolean IsForgotPasswordBelowRememberMe();
	public Boolean IsRememberMeBelowPassword();
	public Boolean IsForPassEnableClickable();
	public Boolean IsLoginEnableClickable();
	public Boolean IsSendEmailButtonPresent();
	public void ClickCancel();
	public Boolean IsForUserNameFeildPresent();
//	public Boolean IsCallRPCButtonPresent();
	/*public void ClickLogout();
	public void ClickOK();
	
	
	
	
	public Boolean CompareUsername(String Username);
	public Boolean ComparePassword(String Password);
	public void ClickSendEmail();	
	public Boolean IsCallHelpButtonPresent();
	public Boolean IsCallHelpButtonClickable();
	public Boolean IsCopyriteMessagePresent();
	public Boolean IsUserAccessMessagePresent();
	public Boolean IsHoughtonMessagePresent();
	public void clickCallHelp();
	public Boolean CallHelpBelowForgotPass();
	public Boolean UserNamePassIncorrect();*/
	public boolean verifyInvalidLoginErrorMsg(String string);
	public void clickOkBtn();
	public void navigateToAddExaminee();
	
	public void enterFirstName(String firstName);
	public void enterLastNameName(String firstName);
	public void enterMiddleNameName(String firstName);
	public void setDob();
	public void setEnrollmentDate();
	public void EnterExamineeId(String examineeId);
	public void selectGender(String gender);
	public void selectCaseload(String caseloadName);
	
	
	
	//serach sereen
	public void navigateToSearchExamineeScreen();
	public void enterSearchFirstName(String firstName);
	public void enterSearchLastName(String LastName);
	public void enterSearchExamineeId(String examineeId);
	public void clickSearchBtn();
	
	
	
	
	//edit examinee
	public void navigateToEditExaminee();
	public void clearFirstNameField();
	public void clearLastNameField();
	public void clearExamineeIdField();
	
	public void enterEditExamineeFname(String fName);
	public void enterEditExamineeLname(String lName);
	public void enterEditExamineeId(String id);
	public void clickEditExamineeSaveBtn();
	public void navigateToExamineeSearchFromExamineeInfoScreen();
	
	//delete
	public void deleteExaminee();
	
	//logout
	public void logOut();
}
