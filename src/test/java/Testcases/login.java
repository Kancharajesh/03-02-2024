package Testcases;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.text.html.parser.Element;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import com.sun.net.httpserver.Authenticator.Retry;

import Baseclass.Basetest;


public class login extends Basetest{
	
	
	@Test
	(priority = 1)
	public static void login() throws InterruptedException 
	{
				//Enter Username & Password
				driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("Usernametext"));
				driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("passwordtext"));
		     
				// click on login
				driver.findElement(By.cssSelector(prop.getProperty("Login"))).click();	
				
				
    }
	@Test 
	(priority = 2)  
	public static void checkoutallproducts() throws InterruptedException, IOException
	{ 
	
		//Enter Username & Password
		driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("Usernametext"));
		driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("passwordtext"));
     
		// click on login
		driver.findElement(By.cssSelector(prop.getProperty("Login"))).click();
		Thread.sleep(2400);
		
		//click on left three dot option.
		driver.findElement(By.cssSelector(prop.getProperty("threedots"))).click();
		
		// click on all items.
		driver.findElement(By.cssSelector(prop.getProperty("allitems"))).click(); 
		 
		//add to cart second product.
		driver.findElement(By.xpath(prop.getProperty("addtocart"))).click();
				
		//click on cart
		driver.findElement(By.cssSelector(prop.getProperty("cart"))).click();
		Thread.sleep(2000);
		
		//click on Check out.
		driver.findElement(By.linkText(prop.getProperty("checkout1"))).click();
		Thread.sleep(2000);	
		
		
		//firstname & lastname.
		driver.findElement(By.cssSelector(prop.getProperty("Firsttime"))).sendKeys(prop.getProperty("Firstnametext"));
		driver.findElement(By.cssSelector(prop.getProperty("Lastname"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector(prop.getProperty("postalcode"))).sendKeys(prop.getProperty("post"));
		
		driver.findElement(By.cssSelector(prop.getProperty("checkoutconfirmation"))).click();
		driver.findElement(By.linkText(prop.getProperty("Finish"))).click();
		
		// screenshort.
		TakesScreenshot screenshort = (TakesScreenshot)driver;
		File Source = screenshort.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File ("C://tmp//2.png"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("Window.scrollBy (0,document.body.scrollheight)", null);
		
		
		
		//get text.
		String	text = driver.findElement(By.cssSelector(prop.getProperty("thankyou1"))).getText();
		System.out.println(text); 
		
	}
	 
	@Test(priority = 3)
	public static void Logout() throws InterruptedException
	{
		
		//Enter Username & Password
				driver.findElement(By.cssSelector(prop.getProperty("Username"))).sendKeys(prop.getProperty("Usernametext"));
				driver.findElement(By.cssSelector(prop.getProperty("Password"))).sendKeys(prop.getProperty("passwordtext"));
		     
				// click on login
				driver.findElement(By.cssSelector(prop.getProperty("Login"))).click();
				Thread.sleep(2400);
				
				//click on left three dot option.
				driver.findElement(By.cssSelector(prop.getProperty("threedots"))).click();
				
				//Logout.
				driver.findElement(By.cssSelector(prop.getProperty("logout"))).click();
				Thread.sleep(10000);	 
				
	}
	
	
	
}
