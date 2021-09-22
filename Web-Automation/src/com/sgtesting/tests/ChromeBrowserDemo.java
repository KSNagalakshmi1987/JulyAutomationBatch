package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;	
public static void main(String[] args)
{
	launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	logout();
	closeApplication();
}
static void launchBrowser()
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
static void navigate()
{
	try
	{
		oBrowser.get("http://localhost:82/login.do");
		Thread.sleep(4000);
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
static void login()
{
	try
	{
	oBrowser.findElement(By.id("username")).sendKeys("admin");
	oBrowser.findElement(By.name("pwd")).sendKeys("manager");
	oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
    Thread.sleep(4000);
    }
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void minimizeFlyOutWindow()
{
	try
	{
		oBrowser.findElement(By.id("getting startedshortcutspanels Id")).click();
	    Thread.sleep(4000);
	}	catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("logout")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
