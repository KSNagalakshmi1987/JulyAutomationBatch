package com.sgtesng.dataprovider;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAssignment4{

	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("Loop Output");

	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			log.info("in launchBrowser method");
			System.setProperty("webdriver.chrome.driver","E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			log.info("in navigate method");
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void logout()
	{
		try
		{
			log.info("in logout method");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void closeApplication()
	{
		try
		{
			log.info("in closeApplication method");
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




	@Test(priority=4)
	public void createCustomer()
	{
		try
		{
			log.info("in createCustomer method");
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Joe biden");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void deleteCustomer()
	{
		try
		{
			log.info("in deleteCustomer method");
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="getLoginData")
	public void login(String user,String pwd)
	{
		try
		{
			log.info("in login and minimize Flyout window method");
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] getLoginData()

	{

		return new Object[][] {{"admin","manager"}};
	}

	@Test(priority=5)
public void modifyCustomer()
{
	try
	{
		log.info("In modifyCustomer method");
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")).clear();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")).clear();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys("DONALD Trump");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
		Thread.sleep(4000);
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}