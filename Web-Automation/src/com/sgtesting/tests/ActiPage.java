package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {

	public ActiPage(WebDriver oBrowser)
	{
     PageFactory.initElements(oBrowser, this);
	}
	//User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//Login button Field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	//Fly Out Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWin()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Create User
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement UserClick;
	public WebElement getCreateUser()
	{
		return UserClick;
	}
	
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement addClick;
	public WebElement getCreateUser1()
	{
		return addClick;
	}
	
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getLastname()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement getuserMail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername1()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement saveClick;
	public WebElement getsaveChanges()
	{
		return saveClick;
	}
	//Modify User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement modifyclick1;
	public WebElement getmodify1()
	{
		return modifyclick1;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement modifyclick2;
	public WebElement getmodify2()
	{
		return modifyclick2;
	}
	
	//delete User
		@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
		private WebElement deleteclick1;
		public WebElement getdeleteclick1()
		{
			return deleteclick1;
		}
		
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getdeleteclick2()
		{
			return userDataLightBox_deleteBtn;
		}

	//CreateCustomer
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
	private WebElement Customerclick1;
	public WebElement getCustomerclick1()
	{
		return Customerclick1;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement Customerclick2;
	public WebElement getCustomerclick2()
	{
		return Customerclick2;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement Customerclick3;
	public WebElement getCustomerclick3()
	{
		return Customerclick3;
	}

	private WebElement 	customerLightBox_nameField;
	public WebElement getCustomerClick4()
	{
		return customerLightBox_nameField;
	}

	private WebElement 	customerLightBox_descriptionField;
	public WebElement getCustomerClick5()
	{
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement Customerclick6;
	public WebElement getCustomerclick6()
	{
		return Customerclick6;
	}
	//modify customer
	
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement modCus1;
	public WebElement getmodCus1()
	{
		return modCus1;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement modCus2;
	public WebElement getmodCus2()
	{
		return modCus2;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement modCus3;
	public WebElement getmodCus3()
	{
		return modCus3;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement modCus4;
	public WebElement getmodCus4()
	{
		return modCus4;
	}
	//modify project
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement modifyPro1;
	public WebElement getmodifyPro1()
	{
		return  modifyPro1;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[1]")
	private WebElement modifyPro2;
	public WebElement getmodifyPro2()
	{
		return  modifyPro2;
	}
	//Delete customer
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Delcust1;
	public WebElement getDelcust1()
	{
		return  Delcust1;
	}
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement Delcust2;
	public WebElement getDelcust2()
	{
		return  Delcust2;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement Delcust3;
	public WebElement getDelcust3()
	{
		return  Delcust2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement Delcust4;
	public WebElement getDelcust4()
	{
		return  Delcust3;
	}
	private WebElement 	customerPanel_deleteConfirm_submitTitle;
	public WebElement getDelcust5()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//Create Project
	
			@FindBy(xpath="/html/body/div[14]/div[2]")
			private WebElement crePro1;
			public WebElement getcrePro1()
			{
				return  crePro1;
			}
			
			private WebElement 	projectPopup_projectNameField;
			public WebElement getcrePro2()
			{
				return projectPopup_projectNameField;
			}
		
			@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div/span")
			private WebElement crePro3;
			public WebElement getcrePro3()
			{
				return  crePro3;
			}
			
			//delete Project
			@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
			private WebElement delPro1;
			public WebElement getdelPro1()
			{
				return   delPro1;
			}
			
			@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
			private WebElement delPro2;
			public WebElement getdelPro2()
			{
				return   delPro2;
			}
			@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
			private WebElement delPro3;
			public WebElement getdelPro3()
			{
				return   delPro3;
			}
			
			private WebElement projectPanel_deleteConfirm_submitTitle;
			public WebElement getdelPro4()
			{
				return projectPanel_deleteConfirm_submitTitle;
			}
	//Logout Link Field
		@FindBy(linkText="Logout")
		private WebElement oLogOut;
		public WebElement getLogout()
		{
			return oLogOut;
		}
}
