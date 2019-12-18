package Docker_Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setHubURL() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		cap.setPlatform(Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
		
		driver = new RemoteWebDriver(new URL("http://192.168.1.105:4444/wd/hub"),cap);
		driver.manage().window().fullscreen();
	}
	
	
	@Test
	public void user_logged_into_application(){
		
		driver.get("https://ui.cogmento.com/ss");
		
		//driver.findElement(By.name("email")).sendKeys("Poornachandrarao.948@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Chandra@1221");
		
		//driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		System.out.println("URL is"+ driver.getCurrentUrl());
		System.out.println("Title is" +driver.getTitle());

	}


}
