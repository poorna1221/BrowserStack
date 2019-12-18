package Docker_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack {
	 WebDriver driver;
  public static final String USERNAME = "poorna3";
  public static final String AUTOMATE_KEY = "YCdCh9Ty7b59bhyHhq1C";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  @BeforeMethod
  public void before() throws MalformedURLException {

	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setCapability("os", "Windows");
	  caps.setCapability("os_version", "7");
	  caps.setCapability("browser", "Chrome");
	  caps.setCapability("browser_version", "79.0");
	  caps.setCapability("project", "TESTBrowserSTackPoorna");
	  caps.setCapability("build", "20.00");
	  caps.setCapability("name", "Poorna20.00");
	  caps.setCapability("browserstack.local", "false");
	  caps.setCapability("browserstack.selenium_version", "3.5.2");
//TEST
    driver = new RemoteWebDriver(new URL(URL), caps);
   

  }
  @Test
  public void test1() throws InterruptedException
  {
	  
		driver.get("https://ui.cogmento.com/ss");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Poornachandrarao.948@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Chandra@1221");
		
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		

		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
  }

}