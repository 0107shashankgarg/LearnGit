package com.Demo.BusinessLayer.PageObject;
import org.openqa.selenium.By;

public class PageObject {
	public By Image, Text, usernameLocater, EnterUserNameText, ForgotPassText,
	passwordLocater, RememberMechk, loginButtonLocater, RememberMe,
	ForgotPasswordBtn, ForgotPassUser, SendEmail, ForgotPassCancel,
	UserNameMandatory, EmailSent, InvalidUer, IsOnDashboard,
	PleaseEnterUserNamePopup, TapOk, EmailSentPopup,
	InvalidUserNamePAssword, PasswordMandatory, UsernamePassBlankError,
	TapYes, TapNo, MenuOption, AddChild, FirstName, AddLastName,
	AddDOB, AddGender, AddLocation, AddPhoneNo, AddEmail, AddUserID,
	AddPassword, AddConfPassword, Cancel, AddNext, AddIndustry,
	AddEducation, AddkeySkills, LogoutButton, LogoutOk, ClikUploadImg,
	Clickbrowse, ClickGallery, SearchChild, CallHelp, AcessMessage,
	HoughtonMessage, Copyrite, SrchFirstName, SrchLastName, SrchDOB,
	SrchLocation, SrchEmail, SrchButton, EditButton, Delete,
	ResumeManagement, LougoutConfirmation, Message1, Message2,
	Message3, Message2FirstLine, Collapse, Expand, TimeStamp,
	DateStamp, NoMessage, CollapseM2, ExpandM2, TotalMessage,
	CaseLoadTab, DisplayedCaseLoads, AcadamicYearDropDown,
	AcademicYearHeading, AcademicYearHeadingValue, FirstCaseLoadFolder,
	examineeFirstNameOnTable, ExamineeActionMenu, AddTestRecordImage,
	AddCaseload, CaseLoadImages, DashboardTabs,
	AccountHolderMessageTab, AccountHolderMessagePageHeading,
	AddExaminee, AddLastname, AddFirstName, AddMiddleName,
	AddRadioButtonMale, AddRadioButtonFemale, AddRadioButtonUnspecific,
	AddExamineeDob, AddExamineeAge, AddEnrollmentDate,
	AddExamineeCaseload, AddExamineeId, AddParentName1,
	AddParentEmail1, AddParentName2, AddParentEmail2, AddCancel,
	AddSave, AddSaveandAnother, AddDemographicMaximize,
	AddDemographicMinimize, AddPrimarySpokenLanguage, AddEtnicity,
	AddRace, AddIFSPRadioNone, AddIFSPRadioYes, AddIFSPRadioNo,
	AddIEPRadioNone, AddIEPRadioYes, AddIEPRadioNo, AddFundingSources,
	AddFreeLunchRadioNone, AddFreeLunchRadioYes, AddFreeLunchRadioNo,
	AddIESPIntialDateofEligibility, AddIESPExitDate,
	AddIEPIntialDateofEligibility, AddIEPExitDate, ClickSaveOK,
	AddPrimaryDiagnosis, AddSecondaryDiagnosis, ClickEditIcon,
	EditIcon, ClickDeleteIcon, DeleteIcon, VerifyMessageonDelete,
	AddGeneralTabMaximize, AddGeneralTabMinimize, AddSaveSucessMessage,
	ListofExaminees, caseloadfolder, searchexaminee1, searchexaminee2,
	clickEditlink1, clickEditlink2, Editsearch, EditSaveMessage,
	DeleteSucessMessage, DeleteConformationMessage, Yes, No;

public void Android() {
// General
Image = By.className("android.widget.ImageButton");
Text = By.className("android.widget.TextView");

usernameLocater = By
		.xpath("//android.widget.RelativeLayout[1]/android.widget.EditText[1]");
passwordLocater = By
		.xpath("//android.widget.RelativeLayout[1]/android.widget.EditText[2]");
;
UserNameMandatory = By.name("The Username field is required.");
PasswordMandatory = By.name("The Password field is required.");

CallHelp = By.name("Call Help");
Copyrite = By
		.name("Copyright � 2014 by The Riverside Publishing Company. � All rights reserved. � (800) 323�9540 � www.hmhco.com");
HoughtonMessage = By
		.name("Houghton Mifflin Harcourt - Riverside now provides web-based access to individually administered tests. You can access scoring and reporting for the Woodcock-Johnson IV (WJ IV) and the Woodcock-Munoz Language Survey (WMLS-R) from any computer with Internet access. This secure environment allows examiners to enter assessment data, add test session observations, generate scores, and provides a variety of reports for any test.");
AcessMessage = By
		.name("You now have access to the newest, trusted, and ground-breaking leader in individually administered assessments.");
UsernamePassBlankError = By
		.name("The Username and Password fields are required.");
InvalidUserNamePAssword = By
		.name("Username and/or Password is incorrect.");
PleaseEnterUserNamePopup = By.name("The Username field is required.");
EmailSentPopup = By.name("Email sent!");
TapOk = By.name("OK");
TapYes = By.name("Yes");
TapNo = By.name("No");
IsOnDashboard = By.name("Caseload Folders");
EmailSent = By.id("com.hmh.wjiv:id/username");
InvalidUer = By.name("Invalid User!");

// loginButtonLocater =
// By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[3]");
loginButtonLocater = By.name("Log In");
RememberMechk = By
		.xpath("//android.widget.RelativeLayout[1]/android.widget.ImageView[2]");
RememberMe = By.name("Remember Me?");
ForgotPasswordBtn = By.name("Forgot Password?");
ForgotPassText = By.name("Forgot your Password?");
ForgotPassUser = By
		.xpath("//android.widget.RelativeLayout[1]/android.widget.EditText[1]");
SendEmail = By.name("Send Email");
ForgotPassCancel = By.name("Cancel");
EnterUserNameText = By.name("Please enter your username.");

AddFirstName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[1]");
AddLastName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[3]");
AddDOB = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[4]");
AddGender = By.name("Select Gender");
AddLocation = By.name("Select Location");

LogoutOk = By.name("OK");
LogoutButton = By
		.xpath("//android.widget.RelativeLayout[1]/android.widget.ImageButton[2]");

// Message Elements
Message1 = By
		.name("The last date for submitting the Test forms is Aug");
Message2 = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]");
Message3 = By.name("Edit");
Message2FirstLine = By
		.name("All examiners should make sure that all the formal");
Collapse = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]");
Expand = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView[1]");
CollapseM2 = By.className("android.widget.ImageView");
ExpandM2 = By.className("android.widget.ImageView");
TimeStamp = By.name("07/21/2014 05:12:59 AM");
DateStamp = By.name("07/20/2014 06:06:23 AM");
NoMessage = By
		.name("There are no messages available from your account holder.");
TotalMessage = By.name("......");

// DashBoard
DashboardTabs = By
		.xpath("//android.widget.TabWidget[1]/android.widget.LinearLayout");
AccountHolderMessageTab = By
		.xpath("//android.widget.TabWidget[1]/android.widget.LinearLayout[2]");
AccountHolderMessagePageHeading = By
		.xpath("//android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]");

// For caseload
CaseLoadTab = By
		.xpath("//android.widget.TabWidget[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]");
DisplayedCaseLoads = By
		.xpath("//android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout");
AcadamicYearDropDown = By
		.xpath("//android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner[1]");
AcademicYearHeading = By
		.xpath("//android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
AcademicYearHeadingValue = By
		.xpath("//android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
FirstCaseLoadFolder = By
		.xpath("//android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
examineeFirstNameOnTable = By
		.xpath("//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
ExamineeActionMenu = By
		.xpath("//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
AddTestRecordImage = By
		.xpath("//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]");
AddCaseload = By
		.xpath("//android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]");
// Add Examinee
AddGeneralTabMaximize = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]");
AddGeneralTabMinimize = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]");
AddExaminee = By.name("+ Add Examinee");
AddLastname = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddFirstName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddMiddleName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddRadioButtonMale = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]");
AddRadioButtonFemale = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]");
AddRadioButtonUnspecific = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]");
AddExamineeDob = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddEnrollmentDate = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddExamineeCaseload = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
AddExamineeId = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[9]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddParentName1 = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddParentEmail1 = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[11]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddParentName2 = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[12]/android.widget.LinearLayout[2]/android.widget.EditText[1]");
AddParentEmail2 = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[13]/android.widget.LinearLayout[2]/android.widget.EditText[1]");

AddDemographicMaximize = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[2]");
AddDemographicMinimize = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]");

AddPrimarySpokenLanguage = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
AddEtnicity = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
AddRace = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddIFSPRadioNone = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]");
AddIFSPRadioYes = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]");
AddIFSPRadioNo = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]");
AddIEPRadioNone = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[6]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]");
AddIEPRadioYes = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[7]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]");
AddIEPRadioNo = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[6]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]");
AddFundingSources = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.LinearLayout[2]/android.widget.TextView[1]");

AddFreeLunchRadioNone = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[9]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]");
AddFreeLunchRadioYes = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[11]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]");
AddFreeLunchRadioNo = By
		.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[9]/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]");
AddIESPIntialDateofEligibility = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddIESPExitDate = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddIEPIntialDateofEligibility = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddIEPExitDate = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[1]");
AddPrimaryDiagnosis = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
AddSecondaryDiagnosis = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
// Edit Examinee
Editsearch = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ListView[1]/android.widget.LinearLayout");
searchexaminee1 = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ListView[1]/android.widget.LinearLayout[");
searchexaminee2 = By.xpath("]/android.widget.TextView[1]");
clickEditlink1 = searchexaminee1;
clickEditlink2 = By
		.xpath("]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]");

caseloadfolder = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]");
AddCancel = By.name("Cancel");

AddSave = By.name("Save");
AddSaveSucessMessage = By.name("Examinee saved.");
AddSaveandAnother = By.name("Save and Add another");
ClickSaveOK = By.name("Ok");
ListofExaminees = By
		.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ListView[1]/android.widget.LinearLayout");
// /android.widget.ListView[1]
EditSaveMessage = By.name("Examinee has been updated successfully");
// Delete Examinee

DeleteConformationMessage = By
		.name(" Are you sure you want to delete this examinee information? ");
DeleteSucessMessage = By.name("Examinee deleted successfully");
Yes = By.name("Yes");
No = By.name("No");

}

public void iOS() {
// General
Image = By.className("android.widget.ImageButton");
Text = By.className("android.widget.TextView");
usernameLocater = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
passwordLocater = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]");

// UserNameMandatory = By.name("The Username field is required.");
// PasswordMandatory = By.name("The Password field is required.");
UserNameMandatory = By
		.name("The Username and password fields are required");
PasswordMandatory = By
		.name("The Username and password fields are required");
CallHelp = By.name("Call Help");
Copyrite = By
		.name("Copyright � 2014 by The Riverside Publishing Company. � All rights reserved. � (800) 323-9540 �");
HoughtonMessage = By
		.name("1Houghton Mifflin Harcourt - Riverside now provides web-based access to individually administered tests. You can access scoring and reporting for the Woodcock-Johnson IV (WJ IV) and the Woodcock-Munoz Language Survey (WMLS-R) from any computer with Internet access. This secure environment allows examiners to enter assessment data, add test session observations, generate scores, and provides a variety of reports for any test.");
AcessMessage = By
		.name("You now have access to the newest, trusted, and ground-breaking leader in individually administered assessments.");
UsernamePassBlankError = By
		.name("The Username and password fields are required");
InvalidUserNamePAssword = By
		.name("Username and/or Password is incorrect");
PleaseEnterUserNamePopup = By.name("The Username field is required.");
EmailSentPopup = By.name("Email sent!");
TapOk = By.name("OK");
TapYes = By.name("Yes");
TapNo = By.name("No");
IsOnDashboard = By.name("Caseload Folders");
EmailSent = By.id("com.hmh.wjiv:id/username");
InvalidUer = By.name("Invalid User!");

// loginButtonLocater =
// By.xpath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[3]");
loginButtonLocater = By.name("Log In");
RememberMechk = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]");
RememberMe = By.name("Remember Me?");
ForgotPasswordBtn = By.name("Forgot Password?");
//ForgotPasswordBtn = By.name("Forgot Passwordwewe?");


ForgotPassText = By.name("Forgot Your Password?");
ForgotPassUser = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
SendEmail = By.name("Send Email");
ForgotPassCancel = By.name("Cancel");
EnterUserNameText = By.name("Please enter your username.");

AddFirstName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[1]");
AddLastName = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[3]");
AddDOB = By
		.xpath("//android.widget.ScrollView[1]/android.widget.EditText[4]");
AddGender = By.name("Select Gender");
AddLocation = By.name("Select Location");

LogoutButton = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]");
LougoutConfirmation = By.name("Logout");
LogoutOk = By.name("OK");

// Message Elements
Message1 = By
		.name("The last date for submitting the Test forms is August 2014.");
Message2 = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextView[1]");
Message3 = By.name("Edit");
Message2FirstLine = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAStaticText[1]");
Collapse = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]/UIAButton[1]");
Expand = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAButton[1]");
CollapseM2 = By.className("android.widget.ImageView");
ExpandM2 = By.className("android.widget.ImageView");
TimeStamp = By.name("Posted 07/21/2014 05:12:59 AM EST");
DateStamp = By.name("07/20/2014 06:06:23 AM");
NoMessage = By
		.name("There are no messages available from your account holder.");
TotalMessage = By
		.xpath(" //UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup");

// DashBoard
DashboardTabs = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton");
AccountHolderMessageTab = By
		.xpath("//android.widget.TabWidget[1]/android.widget.LinearLayout[2]");
AccountHolderMessagePageHeading = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]");

// For caseload
CaseLoadTab = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]");
// UIAApplication[1]/UIAWindow[1]/UIAButton[5]
DisplayedCaseLoads = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText");
AcadamicYearDropDown = By.name("Academic Year");
AcademicYearHeading = By.name("Academic Year");
AcademicYearHeadingValue = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[3]");
FirstCaseLoadFolder = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[1]");
examineeFirstNameOnTable = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]");
ExamineeActionMenu = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton");
AddTestRecordImage = By
		.xpath("/UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAButton[6]");
AddCaseload = By.name("+  Add Examinee");
CaseLoadImages = By
		.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton");
// Add Examinee
		AddGeneralTabMaximize =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]/UIAButton[1]");
		AddGeneralTabMinimize = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[1]/UIAButton[1]");
		AddExaminee = By.name("+ Add Examinee");
		//AddExaminee =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[10]");

		AddLastname = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIATextField[1]");
		AddFirstName = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextField[1]");
		AddMiddleName =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIATextField[1]");

		AddRadioButtonMale =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[1]");
		AddRadioButtonFemale = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[2]");
		AddRadioButtonUnspecific =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAButton[3]"); 
		AddExamineeDob =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIATextField[1]");
		AddEnrollmentDate = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[7]/UIATextField[1]");
		AddExamineeCaseload = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]");
		//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]//UIATextField[1]
		
		AddExamineeId = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIATextField[1]");
		AddParentName1 = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]/UIATextField[1]");
		AddParentEmail1 = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[11]/UIATextField[1]");
		AddParentName2 = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[12]/UIATextField[1]");
		AddParentEmail2 = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[13]/UIATextField[1]");
		AddDemographicMaximize = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAButton[1]");
		AddDemographicMinimize = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableGroup[2]/UIAButton[1]");
		AddPrimarySpokenLanguage = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIATextField[1]");
		AddEtnicity = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]/UIATextField[1]");

		AddRace = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]/UIATextField[1]");
		//A//ddIFSPRadioNone By.xpath("");
		AddIFSPRadioYes =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAButton[3]");

		AddIFSPRadioNo = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAButton[2]");
		AddIFSPRadioNone = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]/UIAButton[1]");
		AddIEPRadioYes =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAButton[3]");

		AddIEPRadioNo = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAButton[2]");
		AddIEPRadioNone = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[9]/UIAButton[1]");
		
		AddFundingSources =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[14]/UIATextField[1]");
		AddFreeLunchRadioNone =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[15]/UIAButton[1]"); 
		AddFreeLunchRadioYes =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[15]/UIAButton[3]");
		AddFreeLunchRadioNo = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[15]/UIAButton[2]");
		AddIESPIntialDateofEligibility =By.name("Initial Date of Eligibility");
		AddIESPExitDate = By.name("Exit Date");
		AddIEPIntialDateofEligibility = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[10]/UIATextField[1]");
		AddIEPExitDate = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[11]/UIATextField[1]");
		AddPrimaryDiagnosis =By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[8]/UIATextField[1]");
		AddSecondaryDiagnosis = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[12]/UIATextField[1]");
		AddSave = By.name("Save");
		AddSaveSucessMessage = By.name("Examinee Su");
		AddSaveandAnother = By.name("Save and Add Another");
		ClickSaveOK = By.name("OK");
		// Edit Examinee
		Editsearch =By.xpath("/UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell");
		searchexaminee1 = By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ListView[1]/android.widget.LinearLayout[");
		searchexaminee2 = By.xpath("]/android.widget.TextView[1]");
		clickEditlink1 = searchexaminee1;
		clickEditlink2 = By
				.xpath("]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]");

		caseloadfolder = By
				.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ViewFlipper[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]");
		AddCancel = By.name("Cancel");

		
		ListofExaminees = By
				.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell");
		// /android.widget.ListView[1]
		EditSaveMessage =By.xpath("//UIAApplication[1]/UIAWindow[3]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]");
		//EditSaveMessage = By.name("Examinee has been updated successfully");
		// Delete Examinee
		//DeleteConformationMessage = By.xpath("//UIAApplication[1]/UIAWindow[3]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]");
		DeleteConformationMessage = By.name("Are you sure you want to delete this examinee information?");
		DeleteSucessMessage = By.name("Examinee deleted successfully");
		Delete=By.name("Delete");
		Yes = By.name("Yes");
		No = By.name("No");


}
    
    
}