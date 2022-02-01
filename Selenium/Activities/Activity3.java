import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
			
	        // Open the browser
	        driver.get("https://training-support.net/selenium/simple-form");
	        String title = driver.getTitle();
	        System.out.println("Title of the application::" +title);
	        //Form
	        driver.findElement(By.id("firstName")).sendKeys("Charles");
	        driver.findElement(By.id("lastName")).sendKeys("JOhn");
	        //Email
	        driver.findElement(By.id("email")).sendKeys("charles.john@gmail.com");
	        driver.findElement(By.id("number")).sendKeys("9898098900");
	        
	        driver.findElement(By.cssSelector(".ui.green.button")).click();
	        System.out.println("Application has been submitted successfully");
	        
	        driver.close();
	        

	}

}
