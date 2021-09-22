package com.sgtesting.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chromeBrowser
{
	public static WebDriver oBrowser=null;
	public static void main(String args[]) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyWindow();
		createUser();
		logout();
		login();
		deleteUser();
		logout();
	}
	public static void launchBrowser()
	{ 
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			 oBrowser = new ChromeDriver();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
		oBrowser.get("http://localhost:82/login.do");
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
	public static void login()
	{
		try
		{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyWindow()
	{
		try
		{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
		    oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		    oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
		    oBrowser.findElement(By.name("email")).sendKeys("UserDemo@gmail.com");
		    oBrowser.findElement(By.name("username")).sendKeys("UserDemo1");
		    oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
		    oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
		    oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
		    Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	static void modifyUser()
//	{
//		try
//		{
//			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a")).click();
//		    oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
//		    oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_accountInformationSection\"]/div[2]")).click();
//		    Alert obj=oBrowser.switchTo().alert();
//			obj.accept();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=oBrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	 static void logout()
	 {
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
