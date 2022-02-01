import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		       
		      WebDriver driver = new FirefoxDriver();
						
		        // Open the browser
		        driver.get("https://www.training-support.net");
				
		       driver.close();
		    }

		
	}
