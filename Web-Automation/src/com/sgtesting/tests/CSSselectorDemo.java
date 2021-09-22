package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {
public static WebDriver oBrowser=null;	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		absoluteCSSSelector();
//		relativeCSSWithTagName();
		//relativeCSSWithTagNameAndIdAttributeValue();
//		relativeCSSWithIdAttributeValue();
		//relativeCSSWithTagNameAndClassAttributeValue();
	//	relativeCSSWithClassAttributeValue();
	//	relativeCSSWithTagNameAndAttributeNameAndValue();
	//	relativeCSSWithAttributeNameAndValue();
		//relativeCSSWithTagNameAndMultipleAttributeNameAndValue();
		// relativeCSSWithTagNameAndAttributeName();
		//relativeCSSWithPartialMatchingOfAttributeValue();
		// relativeCSSWithParentReference();
	//	relativeCSSWithNthChildAppraoch();
		relativeCSSWithSiblingApproach();
	}

	static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
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
		oBrowser.get("file://E:/Sample.html");
		Thread.sleep(2000);
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
static void absoluteCSSSelector()
{
	try
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("user1");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
/**
 * Case 1
 * Identify based on the <tagName>
 * Syntax: <tagName>
 */
static void relativeCSSWithTagName()
{
	oBrowser.findElement(By.cssSelector("input")).sendKeys("user1");
}
/**
 * case 2
 * Identify based on the <tagName> with<id attribute value>
 * Syntax: <tagName>#<id attribbute value>
 */
static void relativeCSSWithTagNameAndIdAttributeValue()
{
	oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
}
/**
 * Case 3
 * Identify based on the <id attribute value>
 * Syntax: #<id attribbute value>
 */
static void relativeCSSWithIdAttributeValue()
{
	oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("SGSOFT");
}
/**
 * case 4
 * Identify based on the <tagName> with<class attribute value>
 * Syntax: <tagName>.<class attribbute value>
 */
static void relativeCSSWithTagNameAndClassAttributeValue()
{
	oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("Demopwd1");
}
/**
 * case 5
 * Identify based on the <class attribute value>
 * Syntax: .<class attribbute value>
 */
static void relativeCSSWithClassAttributeValue()
{
	oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("Demk1");
}

/**
 * case 6
 * Identify based on the <tagname> with attribte name and value combination
 * Syntax: <tagName>[attributename='attribute value']
 */
static void relativeCSSWithTagNameAndAttributeNameAndValue()
{
	oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
}
/**
 * case 7
 * Identify based on the attribte name and value combination
 * Syntax: [attributename='attribute value']
 */
static void relativeCSSWithAttributeNameAndValue()
{
	oBrowser.findElement(By.cssSelector("[value='Submit']")).click();
}
/**
 * case 8
 * Identify based on the <tagname> with multiple attribte name and value combination
 * Syntax: <tagName>[attributename='attribute value'][attributename='attribute value']
 */
static void relativeCSSWithTagNameAndMultipleAttributeNameAndValue()
{
	oBrowser.findElement(By.cssSelector("input[value='Submit'][name='submit1btn1']")).click();
}
/**
 * case 10
 * Identify based on the <tagname> with attribute name
 * Syntax: <tagName>[attributename]
 */
static void relativeCSSWithTagNameAndAttributeName()
{
	List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
	System.out.println("number of links"+oLinks.size());
	for(int i=0;i<oLinks.size();i++)
	{
		WebElement link=oLinks.get(i);
		System.out.println(link.getText());
	}
}

/**
 * case 11
 * Identify based on the partial matching of Attribute value
  * $=  Starts-with
	 * *=  contains
	 * ^=  ends with
	 * <tagName>[attributename $='attribute value']
	 * <tagName>[attributename *='attribute value']
	 * <tagName>[attributename ^='attribute value']
	 */

static void relativeCSSWithPartialMatchingOfAttributeValue()
{
	oBrowser.findElement(By.cssSelector("input[id *='submit1']")).click();
	//oBrowser.findElement(By.cssSelector("input[id $='btn1']")).click();
}

/**
 * case 12
 * Identify based on  Parent Element reference
 * syntax:<tagName> # <id attribute value> ><child Elements>
*/
 static void relativeCSSWithParentReference()
 {
  oBrowser.findElement(By.cssSelector("form#frm2>input")).click();
 }
 /**
	 * case 13
	 * Identify based on  nth-child appraoch
	 * Syntax: <tagName>#<id attribute value> > <child Element>
	 */
	static void relativeCSSWithNthChildAppraoch()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
		//oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser5");
	}
	/**
	 * case 13
	 * Identify based on  Parent Element reference
	 * Syntax: <tagName>#<id attribute value> > <child Element>
	 */
	static void relativeCSSWithSiblingApproach()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser123");
	}
}
