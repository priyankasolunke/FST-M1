package MobiletestingPackage;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
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
public class GTasksActivity1 {
	
AppiumDriver<MobileElement> driver = null;
	
	@BeforeClass
	
	public void Setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Pixel 4 API 28");
    caps.setCapability("platformName", "Android");
    caps.setCapability("appPackage", "com.google.android.apps.tasks");
    caps.setCapability("appActivity", ".ui.TaskListsActivity");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("noReset", true);
	
    URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
    driver = new AndroidDriver<MobileElement>(appServer, caps);
	}
	
	@Test
	
	public void Activity1() {
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title"))).click();
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
		driver.findElementById("add_task_done").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title"))).click();
		driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
		driver.findElementById("add_task_done").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title"))).click();
		driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
		driver.findElementById("add_task_done").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Tasks\")")));
		MobileElement task1 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Tasks\")"));
		Assert.assertEquals(task1.getText(),"Complete Activity with Google Tasks" );
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Keep\")")));
		MobileElement task2 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Keep\")"));
		Assert.assertEquals(task2.getText(),"Complete Activity with Google Keep" );
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Complete the second Activity Google Keep\")")));
		MobileElement task3 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete the second Activity Google Keep\")"));
		Assert.assertEquals(task3.getText(),"Complete the second Activity Google Keep" );
		
	}
	
	
		
		 @AfterTest
		    public void tearDown() {
		        driver.quit();
		   
		
		
		
		
		
	}
	
	
}




