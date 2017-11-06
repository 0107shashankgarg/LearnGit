
package com.Demo.BusinessLayer.Screens.Android;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Demo.BusinessLayer.Interfaces.Login;
import com.Demo.Layer.mAqua;
import com.Demo.Utilities.Driver;

public class LoginUI  implements  Login{




	

	

	

	protected WebDriver driver = null;
	public LoginUI(String enviornment )
	 {
		new mAqua();
		
	 }
	 
	
	@Override
	public void logOut() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handlecsld"));
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/logout_txt"));
		mAqua.generic.ClickElement(By.id("android:id/button1"));
		
		
	}
	@Override
	public void deleteExaminee()
	{
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//examinee info action enabvle 
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/textView2"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/cl_srch_delete"));
		mAqua.generic.ClickElement(By.id("android:id/button2"));
	}
	

	@Override
	public void navigateToExamineeSearchFromExamineeInfoScreen() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/back_search_examine"));
		
	}

	@Override
	public void clearFirstNameField() {
		// TODO Auto-generated method stub
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit")).clear();
	}






	@Override
	public void clearLastNameField() {
		// TODO Auto-generated method stub
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit")).clear();
	}






	@Override
	public void clearExamineeIdField() {
		// TODO Auto-generated method stub
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit")).clear();
	}






	@Override
	public void enterEditExamineeFname(String fName) {
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit"),fName);
		
	}






	@Override
	public void enterEditExamineeLname(String lName) {
		// TODO Auto-generated method stub
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit"), lName);
	}






	@Override
	public void enterEditExamineeId(String id) {
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit"),id);
		
	}






	@Override
	public void clickEditExamineeSaveBtn() {
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		
		
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/sv"));
		mAqua.generic.ClickElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]"));
		
	}


	@Override
	public void navigateToEditExaminee() {
		// TODO Auto-generated method stub
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//examinee info action enabvle 
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/textView2"));
		// click on edit actiion
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit"));

		
	}

	@Override
	public void enterSearchFirstName(String firstName) {
		// TODO Auto-generated method stub
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_FirstName"),firstName);
		
	}



	@Override
	public void enterSearchLastName(String LastName) {
		// TODO Auto-generated method stub
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_LastName"),LastName);
		
	
	}



	@Override
	public void enterSearchExamineeId(String examineeId) {
		// TODO Auto-generated method stub
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_examinee_id"),examineeId);
		
	}



	@Override
	public void clickSearchBtn() {
		// TODO Auto-generated method stub
		//serxh btn
				mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_search_button"));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public void navigateToSearchExamineeScreen() {
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handle"));
		//navigate to search child
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit_txt"));
		
		
	}
	public void clickNewExamineeSaveBtn()

	{
		Driver.driver.navigate().back();
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		
		
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/sv"));
		//androird 500 issue
		mAqua.generic.ClickElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]"));
		
		
	}
	@Override
	public void enterFirstName(String firstName) {
		
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit"), firstName);
	}

	@Override
	public void enterLastNameName(String Lastname) {
		// TODO Auto-generated method stub
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit"), Lastname);
	}

	@Override
	public void enterMiddleNameName(String firstName) {
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_middlename_edit"), firstName);
		
	}

	@Override
	public void setDob() {
		// TODO Auto-generated method stub
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_dateofbirth_edit"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Driver.driver.navigate().back();
		mAqua.generic.ClickElement(By.id("android:id/button1")); 
		
		mAqua.generic.ClickElement(By.name("OK"));
	}

	@Override
	public void setEnrollmentDate() {
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_enrolldate_edit"));
		mAqua.generic.ClickElement(By.id("android:id/button1"));
		mAqua.generic.ClickElement(By.name("OK"));
		
	}

	@Override
	public void EnterExamineeId(String examineeId) {
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit"), examineeId);
		
	}
	

	@Override
	public void selectGender(String gender) {
		// TODO Auto-generated method stub
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/locname"));
		mAqua.generic.ClickElement(By.name("Male"));
	}



	@Override
	public void selectCaseload(String caseloadName) {
	mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/spCaseFolders"));
		
		mAqua.generic.ClickElement(By.name(caseloadName));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.driver.navigate().back();
		
	}
	@Override
	public void navigateToAddExaminee() {
		// TODO Auto-generated method stub
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handlecsld"));
		//
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/add_txt"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void SetUserName(String Username) {
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//mAqua.generic.SendData(Driver.driver.findElements(By.className("android.widget.LinearLayout")).get(0), Username);
		mAqua.generic.SendData(By.name("Username"), Username);
		//driver.findElement(By.className("fsdfsd"));
	 
	}
	public void SetPassword(String Password) {
		// TODO Auto-generated method stub
		//mAqua.generic.IsElementPresent(mAqua.Locaters.loginButtonLocater);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/password"), Password);
	}
	@Override
	public void clickLoginBtn() {
		Driver.driver.navigate().back();
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/btn_lgn"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handlecsld"));
		//
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/add_txt"));
		
		Random ran=new Random();
		int num=ran.nextInt(9999);
		HashMap data=new HashMap();
		data.put("lastName", "ExamL"+num);
		data.put("firstName", "ExamF"+num);
		data.put("examineeId", "ExamId"+num);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit"), "ExamL"+num);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit"), "ExamF"+num);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_middlename_edit"), "ExamM"+num);
		RunTimeDataBucket.pushRunTimeData("newExaminee",data);
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/locname"));
		mAqua.generic.ClickElement(By.name("Male"));
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_dateofbirth_edit"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		/*mAqua.generic.ClickElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]"));
//		//mAqua.generic.ClickElement(By.name("Done"));
//		mAqua.generic.ClickElement(By.className("android.widget.Button"));
//		mAqua.generic.ClickElement(By.id("android:id/button1"));
		Driver.driver.navigate().back();		
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_enrolldate_edit"));
		mAqua.generic.ClickElement(By.id("android:id/button1"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2nd date 
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/spCaseFolders"));
		
		mAqua.generic.ClickElement(By.name("Referrals"));
		
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit"), "ExamId"+num);*/
		
		
		
		
		
		
		
		
	/*	Driver.driver.navigate().back();
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		
		
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/sv"));
		//androird 500 issue
		mAqua.generic.ClickElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]"));
		
		
		//click menu
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handle"));
		//navigate to search child
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit_txt"));
		
		//search first naame click
		HashMap newExaminee=(HashMap) RunTimeDataBucket.runTimeData.get("newExaminee");
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_FirstName"),newExaminee.get("firstName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_LastName"),newExaminee.get("lastName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_examinee_id"),newExaminee.get("examineeId").toString());
		//serxh btn
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_search_button"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Verify search result 
		String displayedFname= mAqua.generic.getDisplayedText(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_fst_nm"));
		String displayedLname= mAqua.generic.getDisplayedText(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		Assert.assertTrue(displayedFname.equals(newExaminee.get("firstName").toString()));	
		Assert.assertTrue(displayedLname.equals(newExaminee.get("lastName").toString()));	
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		
		//examinee info action enabvle 
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/textView2"));
		// click on edit actiion
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//edit First name
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit")).clear();
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit")).clear();
		//Driver.driver.navigate().back();
		Driver.driver.findElement(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit")).clear();
		//WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit
		Random ran1=new Random();
		int num1=ran1.nextInt(9999);
		HashMap editData=new HashMap();
		editData.put("lastName", "ExamL"+num1);
		editData.put("firstName", "ExamF"+num1);
		editData.put("examineeId", "ExamId"+num1);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_lastname_edit"), "ExamL"+num1);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_firstname_edit"), "ExamF"+num1);
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/addexm_examineeid_edit"), "ExamId"+num1);
		RunTimeDataBucket.pushRunTimeData("EditedExaminee",editData);
		
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		mAqua.generic.swipe(0.5,0.2,0.5,5.5);
		
		
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/sv"));
		
		
		//Navigate and verify edit examinee 
mAqua.generic.ClickElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]"));
		
		
		//click menu
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/handle"));
		//navigate to search child
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit_txt"));
		
		//search first naame click
		HashMap editedExaminee=(HashMap) RunTimeDataBucket.runTimeData.get("EditedExaminee");
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_FirstName"),editedExaminee.get("firstName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_LastName"),editedExaminee.get("lastName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_examinee_id"),editedExaminee.get("examineeId").toString());
		//serxh btn
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_search_button"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Verify edit search result 
		 displayedFname= mAqua.generic.getDisplayedText(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_fst_nm"));
		 displayedLname= mAqua.generic.getDisplayedText(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		Assert.assertTrue(displayedFname.equals(editedExaminee.get("firstName").toString()));	
		Assert.assertTrue(displayedLname.equals(editedExaminee.get("lastName").toString()));	
		//mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_lst_nm"));
		
		
		// search child againb for delete 
		//click menu
		
		//navigate to search child
		//mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_edit_txt"));

		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/back_search_examine"));
		
		//search first naame click
		 newExaminee=(HashMap) RunTimeDataBucket.runTimeData.get("editedExaminee");
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_FirstName"),newExaminee.get("firstName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_caseLoad_LastName"),newExaminee.get("lastName").toString());
		mAqua.generic.SendData(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_examinee_id"),newExaminee.get("examineeId").toString());
		//serxh btn
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/srch_exm_search_button"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mAqua.generic.ClickElement(By.id("WJIV_Andriod.WJIV_Andriod:id/cl_srch_delete"));
		*/
	}
	
	@Override
	public boolean verifyInvalidLoginErrorMsg(String message) {
		//new WebDriverWait(Driver.driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.id("android:id/message")));
		mAqua.generic.waitForElement(By.id("android:id/message"));
		return mAqua.generic.verifyErrorMessage(By.id("android:id/message"), message);
		
	}
	
	@Override
	public void clickOkBtn() {
		
		mAqua.generic.ClickElement(By.id("android:id/button1"));
	
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

	
}

