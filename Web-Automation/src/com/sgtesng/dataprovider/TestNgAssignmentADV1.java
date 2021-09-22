package com.sgtesng.dataprovider;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAssignmentADV1 {

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
	@Test(priority=6)
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
	@Test(priority=7)
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


	@Test(priority=4,dataProvider="getcreateUser")
	public void createuser(String a,String b,String c,String d,String f,String g)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(a);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(b);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys(c);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys(d);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(f);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(g);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getcreateUser()
	{
		return new Object[][] {{"SgSoftware","RPCLayout","SGSoftware@gmail.com","user1","Raghu123","Raghu123"},
			{"Albert","JEinstein","demo23jon@gmail.com","user2","Raghu123","Raghu123"},
			{"Thomas","PEdison","Deom3@gmail.com","user3","Raghu123","Raghu123"}};
	}
	@Test(priority=5)
	public void deleteUser()
	{
		try
		{
			log.info("in deleteUser method");
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=oBrowser.switchTo().alert();
			String content=obj.getText();
			System.out.println(content);
			obj.accept();
			Thread.sleep(2000);
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
	@Test(priority=4,dataProvider="getLoginData1")
	public void createUser(String fn,String ln,String em,String un,String PW,String PWC)
	{
	
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys(fn);
			oBrowser.findElement(By.name("lastName")).sendKeys(ln);
			oBrowser.findElement(By.name("email")).sendKeys(em);
			oBrowser.findElement(By.name("username")).sendKeys(un);
			oBrowser.findElement(By.name("password")).sendKeys(PW);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(PWC);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getLoginData1()

	{
		return new Object[][] {{"User1","Demo1","User1@gmail.com","DemoUser1","password1","passwordcopy1"},{"User2","Demo2","Use2@gmail.com","DemoUser2","password2","passwordcopy2"},{"User3","Demo3","User3@gmail.com","DemoUser3","password3","passwordcopy3"}};
	}
}
