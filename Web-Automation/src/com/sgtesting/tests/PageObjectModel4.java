package com.sgtesting.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel4 {

	public static WebDriver oBrowser=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		modifycustomer();
		deletCustomer();
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
	static void createCustomer()
	{
		try
		{
			oPage. getCustomerclick2().click();
			Thread.sleep(2000);
			oPage. getCustomerclick3().click();
			Thread.sleep(2000);
			oPage.getCustomerClick4().sendKeys("Customer1");
			Thread.sleep(2000);
			oPage.getCustomerClick5().sendKeys("From Bangalore,Karnataka");
			Thread.sleep(2000);
			oPage.getCustomerclick6().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifycustomer()
	{
		try
		{
			oPage.getmodCus1().click();
			Thread.sleep(2000);
			oPage.getmodCus2().click();
			Thread.sleep(2000);
			oPage.getmodCus3().clear();
			Thread.sleep(2000);
			oPage.getmodCus3().sendKeys("Customer2");
			Thread.sleep(2000);
			oPage.getmodCus4().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletCustomer()
	{
		try
		{
			oPage. getDelcust1().click();
			Thread.sleep(2000);
			oPage. getDelcust2().click();
			Thread.sleep(2000);
			oPage. getDelcust3().click();
			Thread.sleep(2000);
			oPage.getDelcust4().click();
			Thread.sleep(2000);
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


