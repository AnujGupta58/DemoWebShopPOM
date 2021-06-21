package com.dws.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dws.utilities.TestUtil;

/* Imp Points
 * 
 * 	Define all the common variables like WebDriver, Properties, Excel, Log, fileInputStream
 * 
 *  Initialization of browser, properties file, excel(Test Data), 
 *  
 *  
 *  
 *  
 *  
 */
public class TestBase {


	public static WebDriver driver;
	public static Properties configProp= new Properties();
	public static FileInputStream fis;
	public static String browser;
	public static WebDriverWait wait;
	
	public static void initialization() {
		
		if(browser == null) {
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties/Config.properties");
				configProp.load(fis);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			browser = configProp.getProperty("browser");
			
			if(browser.equals("firefox")) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/src/main/resources/executables/geckodriver.exe");
				driver = new FirefoxDriver(); 
			}
			else if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/executables/chromedriver.exe");
				driver = new ChromeDriver(); 
			}
			else if(browser.equals("IE")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/main/resources/executables/IEDriverServer.exe");
				driver = new InternetExplorerDriver(); 
			}
			
			driver.get(configProp.getProperty("url"));
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		
		
	}
	
	public static void tearDown() {
		driver.close();
	}

	public static void click(WebElement element) {
		element.click();
		System.out.println("clicked element - " + element);
	}
	
	public static void type(WebElement element, String value) {
		element.sendKeys(value);
		System.out.println("element - " + element + " value " + value);
	}
	
	public static void actions(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void verifyEquals(String actual, String expected) {
		
		Assert.assertEquals(actual, expected);
	}
	
}


