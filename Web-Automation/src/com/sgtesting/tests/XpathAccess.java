package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAccess {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		enterSalaryForSachin();
		enterCityForSachin();
		activeStatusIndianFreedomFighter();
		FromRahulSecondRecordSalary();
		fromSachinPrevious3active();
		getTableAttributeValue();
		basedOnParentTagSelectCheckBoxInSecondRow();
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
		oBrowser.get("file:///E:/Softwares/ExampleAutomation/Automation/WebTableHTML.html");
		Thread.sleep(2000);
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void enterSalaryForSachin()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void enterCityForSachin()
	{
		try
		{
			WebElement WE=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/select"));
		    Select SE=new Select(WE);
		   SE.selectByVisibleText("Bangalore");
		   // SE.selectByIndex(3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void activeStatusIndianFreedomFighter()
	{
		try
		{
		  oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/preceding-sibling::td/input")).click();
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void FromRahulSecondRecordSalary()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input")).sendKeys("10000");
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void fromSachinPrevious3active()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[1]/preceding::tr[1]/preceding::tr[1]/td[1]/input")).click();
	}
	static void getTableAttributeValue()
	{
		String val=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/ancestor::table")).getAttribute("id");
		System.out.println(val);
	}
	
	static void basedOnParentTagSelectCheckBoxInSecondRow()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[3]/td[1]/input")).click();
	}
}
