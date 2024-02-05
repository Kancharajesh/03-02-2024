package Bank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Baseclass.Basetest;

public class bankL1 extends Basetest{

	
	@Test(priority = 1,enabled = true)
	public static void Registraion() {
		
		driver.findElement(By.linkText(loc.getProperty("Register"))).click();
		
		driver.findElement(By.cssSelector(loc.getProperty("firstname"))).sendKeys("Dhoni");
		driver.findElement(By.cssSelector(loc.getProperty("lastname"))).sendKeys("M.S");
		driver.findElement(By.cssSelector(loc.getProperty("Address"))).sendKeys("Ranchi");
		driver.findElement(By.cssSelector(loc.getProperty("City"))).sendKeys("telangana");
		driver.findElement(By.cssSelector(loc.getProperty("State"))).sendKeys("Telangana");
		driver.findElement(By.cssSelector(loc.getProperty("Zipcode"))).sendKeys("M.S");
		driver.findElement(By.cssSelector(loc.getProperty("phonenumber"))).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector(loc.getProperty("RUsername"))).sendKeys("987654");
		driver.findElement(By.cssSelector(loc.getProperty("RPassword"))).sendKeys("123456");
		driver.findElement(By.cssSelector(loc.getProperty("Confirmpassword"))).sendKeys("123456");
		
		driver.findElement(By.cssSelector(loc.getProperty("Registers"))).click();
	}
	
	@Test(priority = 2,enabled = true)
	public static void Login ()
	{
		driver.findElement(By.cssSelector(loc.getProperty("username"))).sendKeys(loc.getProperty("Userid"));
		driver.findElement(By.cssSelector(loc.getProperty("password"))).sendKeys(loc.getProperty("passwordid"));
		
		driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
	}
	
	@Test(priority = 3,enabled = true)
	public static void openaccount() 
	{
	
		driver.findElement(By.cssSelector(loc.getProperty("username"))).sendKeys(loc.getProperty("Userid"));
		driver.findElement(By.cssSelector(loc.getProperty("password"))).sendKeys(loc.getProperty("passwordid"));
		
		driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
		
				
		//print all elements.
		List<WebElement> allElements  = driver.findElements(By.xpath("//*[@id=\"leftPanel\"]/ul"));
		  System.out.println(allElements);
		  
		  for (WebElement element: allElements) {
		        System.out.println(element.getText());
		        element.click();    		
		  }
	}
	
	@Test(priority = 4,enabled = true)	
	public static void Billpay() 
	{
	
		driver.findElement(By.cssSelector(loc.getProperty("username"))).sendKeys(loc.getProperty("Userid"));
		driver.findElement(By.cssSelector(loc.getProperty("password"))).sendKeys(loc.getProperty("passwordid"));
		driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
	
		driver.findElement(By.linkText(loc.getProperty("AccountsOverview"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("ClickonHome"))).click();
		driver.findElement(By.linkText(loc.getProperty("BillPay"))).click();
		
		driver.findElement(By.cssSelector(loc.getProperty("payeename"))).sendKeys("Dhoni");
		driver.findElement(By.cssSelector(loc.getProperty("payeeaddress"))).sendKeys("ts");
		driver.findElement(By.cssSelector(loc.getProperty("Payeecity"))).sendKeys("ts");
		driver.findElement(By.cssSelector(loc.getProperty("payeestate"))).sendKeys("ts");
		driver.findElement(By.cssSelector(loc.getProperty("payeeZipcode"))).sendKeys("20145");
		driver.findElement(By.cssSelector(loc.getProperty("Payeephonenumber"))).sendKeys("9876543210");
		driver.findElement(By.cssSelector(loc.getProperty("Payeeaccount"))).sendKeys("987654");
		driver.findElement(By.cssSelector(loc.getProperty("payeeverifyaccount"))).sendKeys("987654");
		driver.findElement(By.cssSelector(loc.getProperty("payeeamount"))).sendKeys("1000000");
		//Send amount.
		driver.findElement(By.cssSelector(loc.getProperty("payeesendamount"))).click();
		
	}
	
}
