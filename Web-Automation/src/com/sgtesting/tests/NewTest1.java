package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest1 {
	public static WebDriver oBrowser=null;
	
	public void launchBrowser()
	{ 
		try
		{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
	    oBrowser =new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void login(String a,String b)
	{ 
		try
		{

		oBrowser.findElement(By.id("username")).sendKeys(a);
		oBrowser.findElement(By.name("pwd")).sendKeys(b);
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void minimizeFlyoutWindow()
	{ 
		try
		{

		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void createUser(String fn,String ln,String em,String un,String pw,String rpw)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys(fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(ln);
			oBrowser.findElement(By.name("email")).sendKeys(em);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(un);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pw);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(rpw);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();	
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void logOut()
	{ 
		try
		{

		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void modifyPassword(String ps1,String ps2)
	{ 
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);	
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(ps1);
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(ps2);
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NewTest1 obj=new NewTest1();
		obj.launchBrowser();
		obj.navigate();
		obj.login("admin","manager");
		obj.minimizeFlyoutWindow();
//		obj.createUser("User1","UN1","user1@gmail.com","User1Demo1","Password1","Password1");
//		obj.createUser("User2","UN2","user2@gmail.com","User2Demo2","Password2","Password2");
//		obj.createUser("User3","UN3","user3@gmail.com","User3Demo3","Password3","Password3");
		obj.logOut();
//		obj.login("User1Demo1","Password1");
//		obj.logOut();
//		obj.login("User2Demo2","Password2");
//		obj.logOut();
//		obj.login("User3Demo3","Password3");
//		obj.logOut();
		obj.login("admin", "manager");
		obj.modifyPassword("Password11","Password11");
		obj.modifyPassword("Password22","Password22");
		obj.modifyPassword("Password33","Password33");
	}

}
