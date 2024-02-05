package Baseclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import locators.filereader;

public class Basetest 
{
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static filereader fr;
	public static Properties loc = new Properties();
	public static filereader pr;

 
	
	@BeforeTest
	public void setup() throws IOException{
	 if (driver==null) {
		 FileReader fr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\Zazz\\src\\test\\java\\locators\\zazz");
		prop.load(fr);
		FileReader pr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\Zazz\\src\\test\\java\\locators\\Bank");
		loc.load(pr);
		
		
		//else if 
		 
	 }
		
	 if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new ChromeDriver(); // base
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("website"));
	 }	
			else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup(); // base
				driver = new FirefoxDriver(); // base
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.get(prop.getProperty("website"));
	 }
	 
	}
	
	
	@AfterTest
	public void closeser () throws IOException{
		
		driver.quit();
		
		System.out.println("Basetest.close");
		
	}
	
}
