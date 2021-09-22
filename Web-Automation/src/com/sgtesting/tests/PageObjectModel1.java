package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel1 {

	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deletUser();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiPage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			oPage.getCreateUser1().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("User1");
			Thread.sleep(2000);
			oPage.getLastname().sendKeys("Demo1");
			Thread.sleep(2000);
			oPage.getuserMail().sendKeys("ABC@gmail.com");
			Thread.sleep(2000);
			oPage.getusername1().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("abcd");
			Thread.sleep(2000);
			oPage.getpasswordCopy().sendKeys("abcd");
			Thread.sleep(2000);
			oPage.getsaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deletUser()
	{
		try
		{
			oPage.getdeleteclick1().click();
			Thread.sleep(2000);
			oPage.getdeleteclick2().click();
			Thread.sleep(2000);
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


