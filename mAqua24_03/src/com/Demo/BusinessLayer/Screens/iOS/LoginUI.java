package com.Demo.BusinessLayer.Screens.iOS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Demo.BusinessLayer.Interfaces.Login;
import com.Demo.Layer.mAqua;
import com.Demo.Reporter.LogSetter;

public class LoginUI  implements  Login{

	
	@Override
	public void SetPassword(String Password) {
		// TODO Auto-generated method stub
		
	}

	protected WebDriver driver = null;
	public LoginUI(String enviornment )
	 {
		
		new mAqua();
	 }

public void SetUserName(String Username) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		mAqua.generic.ClickElement(mAqua.Locaters.Image);
	 
	}

	@Override
	public Boolean IsUserNameFeildPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsPasswordFeildPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsLoginButtonPresent() {
		return mAqua.generic.IsElementPresent(mAqua.Locaters.loginButtonLocater);
	}

	@Override
	public Boolean IsRememberMeCheckBoxPresesnt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsForgotPasswordLinkPresent() {
		// TODO Auto-generated method stub
		
		return mAqua.generic.IsElementPresent(mAqua.Locaters.ForgotPasswordBtn);
	}

	@Override
	public Boolean IsForgotPasswordCancelButtonPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsForgotPasswordHeadingPresent() {
		return mAqua.generic.IsElementPresent(mAqua.Locaters.ForgotPassText);
	}

	@Override
	public Boolean IsForgotPasswordPopupPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ClearUserName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ClearPassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean IsEmailSentMessagePresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsOnDashboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ClickForgetPassword() {
		// TODO Auto-generated method stub
		LogSetter.logger.info("screen 2 619");
		LogSetter.logger.info(mAqua.Locaters.ForgotPasswordBtn);
		mAqua.generic.ClickElement(mAqua.Locaters.ForgotPasswordBtn);
	}

	@Override
	public Boolean IsForgotPassPageFormatted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsEnterUserNameTextPresent() {
		return mAqua.generic.IsElementPresent(mAqua.Locaters.EnterUserNameText);
	}

	@Override
	public Boolean IsRememberMeTextPresesnt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsPleaseEnterUserNamePopupPresent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CheckRememberMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean IsRememberMeClickable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsForgotPasswordBelowRememberMe() {
		
	return mAqua.generic.FeildsAreBelowReqFeilds(mAqua.Locaters.RememberMe, mAqua.Locaters.ForgotPasswordBtn);
	}

	@Override
	public Boolean IsRememberMeBelowPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsForPassEnableClickable() {
		// TODO Auto-generated method stub
		return mAqua.generic.IsElementEnabledClickable(mAqua.Locaters.ForgotPasswordBtn);
	}

	@Override
	public Boolean IsLoginEnableClickable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean IsSendEmailButtonPresent() {
		return mAqua.generic.IsElementPresent(mAqua.Locaters.SendEmail);
	}

	@Override
	public void ClickCancel() {
		mAqua.generic.ClickElement(mAqua.Locaters.ForgotPassCancel);
		
	}

	@Override
	public Boolean IsForUserNameFeildPresent() {
		return mAqua.generic.IsElementPresent(mAqua.Locaters.ForgotPassUser);
	}

	@Override
	public Boolean IsCancelButtonPresent() {
	
		return mAqua.generic.IsElementPresent(mAqua.Locaters.ForgotPassCancel);
	}

	@Override
	public void clickLoginBtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNewExamineeSaveBtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyInvalidLoginErrorMsg(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clickOkBtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToAddExaminee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLastNameName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMiddleNameName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDob() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnrollmentDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EnterExamineeId(String examineeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectGender(String gender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectCaseload(String caseloadName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToSearchExamineeScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSearchFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSearchLastName(String LastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSearchExamineeId(String examineeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickSearchBtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToEditExaminee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearFirstNameField() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearLastNameField() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearExamineeIdField() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEditExamineeFname(String fName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEditExamineeLname(String lName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEditExamineeId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickEditExamineeSaveBtn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToExamineeSearchFromExamineeInfoScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExaminee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logOut() {
		// TODO Auto-generated method stub
		
	}

	
}




