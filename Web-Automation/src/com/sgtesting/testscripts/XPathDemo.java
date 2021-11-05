package com.sgtesting.testscripts;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		//absoluteXPathDemo();
		//relativeXPathUsingTagNameAlone();
		//relativeXPathUsingTagNameWithIndex();
		//relativeXPathUsingTagNameWithAttributeNameAndValue();
		//relativeXPathUsingAttributeNameAndValueCombination();
		//relativeXPathUsingAttributeValueAlone();
		relativeXPathUsingMultipleAttributeNameAndValue();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("file:\\D:\\bhaskar java notes\\Selenium\\XPATH_26th_OCT_2021\\Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser2");
	}
	/**
	 * Case 1: Identify Element based on <tagName> alone
	 * Syntax:
	 * //<tagName>
	 */
	static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser12");
	}
	/**
	 * Case 2: Identify Element based on <tagName> with index
	 * Syntax:
	 * //<tagName>[index]
	 */
	static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser12");
	}
	/**
	 * Case 3: Identify Element based on <tagName> 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue']
	 */
	static void relativeXPathUsingTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	/**
	 * Case 4: Identify Element based on irrespective of any tag 
	 *  with attributename and attribute value combination
	 * Syntax:
	 * //*[@attributename='attributevalue']
	 */
	static void relativeXPathUsingAttributeNameAndValueCombination()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	/**
	 * Case 5: Identify Element based on irrespective of any tag 
	 *  and irrespective of attribute name only using attribute value 
	 * Syntax:
	 * //*[@*='attributevalue']
	 */
	static void relativeXPathUsingAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	/**
	 * Case 6: Identify Element based on Multiple
	 *   attributename and attribute value combination
	 * Syntax:
	 * //<tagName>[@attributename='attributevalue'][@attributename='attributevalue']
	 */
	static void relativeXPathUsingMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@type='button']")).click();
	}

}
