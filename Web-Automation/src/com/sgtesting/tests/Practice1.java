package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
    	createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApp();
		
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		    oBrowser=new ChromeDriver();
		}
		catch(Exception e)
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
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
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
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApp()
	{
		try
		{
			oBrowser.close();
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
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv']/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("UserDemo@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("UserDemo1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Demo1User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Demo1User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try

	{
	    oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).clear();
		oBrowser.findElement(By.name("firstName")).sendKeys("Lakshmi");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("lastName")).clear();
		oBrowser.findElement(By.name("lastName")).sendKeys("K S");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("email")).clear();
		oBrowser.findElement(By.name("email")).sendKeys("Lakshmi@gmail.com");
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("lakshmiKS");
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("lakshmi20");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("passwordCopy")).clear();
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("lakshmi20");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(2000);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	static void deleteUser()
	{ 
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert obj=oBrowser.switchTo().alert();
		obj.accept();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
