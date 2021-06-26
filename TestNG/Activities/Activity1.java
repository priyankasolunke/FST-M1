package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod(){
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
  @Test
  public void sampletest() {
	  System.out.println("in Test now");


      String title = driver.getTitle();
          
      //Print the title of the page
      System.out.println("Page title is: " + title);
      
	 Assert.assertEquals(driver.getTitle(), "About Training Support");
	 driver.findElement(By.xpath("//a[@id='about-link']")).click();
	 Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
  
  @AfterMethod
	public void aftermethod(){
		driver.quit();
	}
}