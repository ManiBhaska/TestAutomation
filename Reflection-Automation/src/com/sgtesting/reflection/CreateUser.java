package com.sgtesting.reflection;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		

		
		
	}

public void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", "F:\\CurrentWorkSpace\\TestAutomation\\Reflection-Automation\\Library\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}

public void navigate()
{
	try
	{
		oBrowser.navigate().to("http://localhost/login.do");
		oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}

public void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}

public void minimizeFlyOutWindow()
{
	try
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();		
	}
}
public void create()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);	
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			Thread.sleep(2000);	
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User2");
			Thread.sleep(2000);	
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo@gmail.com");
			Thread.sleep(2000);	
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("DemoUser3");
			Thread.sleep(2000);	
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
public void delete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
public void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
public void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
