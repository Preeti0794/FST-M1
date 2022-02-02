import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {

		 WebDriver driver = new FirefoxDriver();
			
	        // Open the browser
	        driver.get("https://www.training-support.net");
	        String title = driver.getTitle();
	        System.out.println("Title of the application::" +title);
	        
	        driver.findElement(By.xpath("//*[@id='about-link']")).click();
	        String new_Title = driver.getTitle();
	        System.out.println("Title of new tab::" +new_Title);
	        driver.close();
	}

}
