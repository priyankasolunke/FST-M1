package MobiletestingPackage;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GoogleChromeActivity2
{
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 API 28");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.training-support.net/selenium");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollForward()"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View"))).click();
		//driver.findElementByXPath("//android.view.View[@content-desc=\"Login Form Please sign in.\"]").click();
	}

	@Test(priority = 1)
	public void Successlog() 
	{
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").sendKeys("admin");
		  driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").sendKeys("password");	  
		  driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();
		  
		  String message = driver.findElementByXPath("//android.view.View[@resource-id = 'action-confirmation']").getText();
		  System.out.println(message);
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Assert.assertEquals(message, "Welcome Back, admin");
		}
	@Test(priority = 2)
	  public void Failedlog() 
	{
		 //android.webkit.WebView/android.view.View[1]/android.view.View[5]/android.widget.Button
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").clear(); 
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'username']").sendKeys("adminx");
		 
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").clear();
		 driver.findElementByXPath("//android.widget.EditText[@resource-id = 'password']").sendKeys("password123"); 
		 
		 driver.findElementByXPath("//android.widget.Button[@text = 'Log in']").click();	  
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View[@resource-id = 'action-confirmation']")));
		 String message = driver.findElementByXPath("//android.view.View[@resource-id = 'action-confirmation']").getText();
		 System.out.println(message);
		 
		 Assert.assertEquals(message, "Invalid Credentials");
	 
	  }
	
	@AfterTest
    public void afterClass() 
	{
        driver.quit();
    }
}
