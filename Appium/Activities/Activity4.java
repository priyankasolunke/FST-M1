package MobiletestingPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
    AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

        
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 5);
    }

    @Test
    public void addContact() throws InterruptedException {
        // Click on add new contact floating button
        driver.findElementByAccessibilityId("Create new contact").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='First name']")));
        // Find the first name, last name, and phone number fields
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Priyanka");
        
        driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Solunke");
       
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("9404029217");
        
        driver.findElementById("editor_menu_save_button").click();
        
        // Wait for contact card to appear
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));

        // Assertion
        MobileElement mobileCard = driver.findElementById("toolbar_parent");
        Assert.assertTrue(mobileCard.isDisplayed());
        
        String contactName = driver.findElementById("large_title").getText();
        Assert.assertEquals(contactName, "Priyanka Solunke");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}