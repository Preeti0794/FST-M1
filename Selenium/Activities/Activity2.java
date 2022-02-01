import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
	      WebDriver driver = new FirefoxDriver();
			
	        // Open the browser
	        driver.get("https://www.training-support.net");
	        String title = driver.getTitle();
	        System.out.println("Title of the application::" +title);
	        
	        String abtlink_ID= driver.findElement(By.id("about-link")).getText();
	        System.out.println("About link text is displayed using ID::" +abtlink_ID);
	        
	        String abtLink_ClassNmae = driver.findElement(By.className("ui inverted huge green button")).getText();
	        System.out.println("About link is displayed using ClassName id::" +abtLink_ClassNmae);
	       	
	        String abtlink_LinkText = driver.findElement(By.linkText("About Us")).getText();
	        System.out.println("About link text is displayed using link text::" +abtlink_LinkText);
	        String abtlink_Css= driver.findElement(By.cssSelector("#about-link")).getText();
	        	        
	        System.out.println("About link text is displayed using CSS Selector::"  +abtlink_Css);
	        
			
	      // driver.close();
	    }

	


	}

