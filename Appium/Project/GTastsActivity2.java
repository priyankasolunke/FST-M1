package MobiletestingPackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
public class GTastsActivity2 {
	
	AppiumDriver<MobileElement> driver = null;
	
@BeforeClass
	
	public void Setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "Pixel 4 API 28");
    caps.setCapability("platformName", "Android");
    caps.setCapability("appPackage", "com.google.android.keep");
    caps.setCapability("appActivity", ".activities.BrowseActivity");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("noReset", true);
	
    URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
    driver = new AndroidDriver<MobileElement>(appServer, caps);
	}
@Test
public void goglkp1() {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("new_note_button"))).click();
	MobileElement note = driver.findElementById("edit_note_text");
	note.sendKeys("Note that you need to finish this ASAP2");
	MobileElement Title = driver.findElementById("editable_title");
	Title.click();
	Title.sendKeys("Title new 4");
	//wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("edit_note_text")));
	MobileElement back = driver.findElement(MobileBy.AccessibilityId("Open navigation drawer"));
	back.click();
	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.keep:id/index_note_title")));
	
	Assert.assertEquals(((WebElement) driver.findElementById("com.google.android.keep:id/index_note_title")).getText(), "Title new 4");
	Assert.assertEquals(((WebElement) driver.findElementById("com.google.android.keep:id/index_note_text_description")).getText(), "Note that you need to finish this ASAP2");
	
}
@AfterClass
public void afterClass() {
    driver.quit();
}
}