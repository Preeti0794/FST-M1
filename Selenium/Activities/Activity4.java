import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {

		 WebDriver driver = new FirefoxDriver();
			
	        // Open the browser
	        driver.get(" https://www.training-support.net/selenium/simple-form");
	        String title = driver.getTitle();
	        System.out.println("Title of the application::" +title);
	        
	        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Charles");
	        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("John");
	        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("charles89@gmail.com");
	        driver.findElement(By.xpath("//*[@id='number']")).sendKeys("8789098900");
	        //Click on submit button
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        System.out.println("Form submitted successfully using xpath");
	        driver.close();
	}

}
