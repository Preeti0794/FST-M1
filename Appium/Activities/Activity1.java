package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AndroidDriver<MobileElement> driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        
        URL RemoteURL = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(RemoteURL, caps);
	}
	
	@Test
	public void additionTest() {
		
		driver.findElementById("digit_5").click();
       
        driver.findElementByAccessibilityId("plus").click();
       
        driver.findElementById("digit_5").click();
 
        // Perform Calculation
        driver.findElementById("eq").click();
 
        // Display Result
        String result = driver.findElement(MobileBy.id("result")).getText();
        System.out.println(result);
        
        Assert.assertEquals(result, "10");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
