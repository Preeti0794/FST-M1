package FST_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FST_Project {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {

		driver = new FirefoxDriver();
		// Open browser
		driver.get("http://alchemy.hguy.co/crm");
		driver.manage().window().maximize();
	}

	// 1. Verify the website title
	@Test(priority = 1, enabled = true)
	public void pageTitle() {
		// Verify the website title
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals("SuiteCRM", title);

	}

	// 2. Get the url of the header image
	@Test(priority = 2, enabled = true)
	public void headerImageURL() {
		// Print the url of the header image to the console
		String headerImageURL = driver.findElement(By.tagName("a")).getAttribute("href");
		System.out.println("headerImageURL::" + headerImageURL);
	}

	// 3. Get the copyright text
	@Test(priority = 3, enabled = true)
	public void copyRightText() {
		// Print the first copyright text in the footer to the console
		String copyRightText = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
		System.out.println("The first copyright text in the footer is " + copyRightText);

	}

	// 4. Logging into the site
	@Test(priority = 4, enabled = true)
	public void logging() {
		// Logging into the site
		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).clear();
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		// Verify the homepage
		String homePageURL = driver.getCurrentUrl();
		System.out.println("Homepage URL is::" + homePageURL);

	}

	// 5. Getting colors
	@Test(priority = 5, dependsOnMethods = "logging", enabled = true)
	public void gettingColors() {
		// headerColor
		logging();
		String headerColor = driver.findElement(By.id("toolbar")).getCssValue("color");
		System.out.println("The color of the navigation menu is::" + headerColor);

	}

	// 6. Menu checking
	@Test(priority = 6, dependsOnMethods = "logging", enabled = true)
	public void activitiesMenu() {
		logging();
		String activitiesMenu = driver.findElement(By.id("grouptab_3")).getText();
		driver.findElement(By.id("grouptab_3")).click();
		if (activitiesMenu.equalsIgnoreCase("Activities")) {
			System.out.println("“Activities” menu item exists.");
		} else {
			System.out.println("“Activities” menu item is not exist.");
		}
	}

	// 7. Reading additional information
	@Test(priority = 7, dependsOnMethods = "logging", enabled = true)
	public void readingAdditionalInfo() throws InterruptedException {
		logging();
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("grouptab_0")))
				.moveToElement(driver.findElement(By.id("moduleTab_9_Leads"))).click().build().perform();
		Thread.sleep(3000);
		String lead_Header = driver.findElement(By.className("module-title-text")).getText();
		System.out.println("Lead table is open::" + lead_Header);
		// find the Additional information icon at the end of the row of the lead
		// information. Click it.
		driver.findElement(By.xpath("//*[@id='MassUpdate']/div[3]//tr[1]/td[10]")).click();
		System.out.println("Pop up is open successfully");

		// Read the phone number
		Thread.sleep(3000);
		String phoneNo = driver.findElement(By.xpath(" //span[@class=\"phone\"]")).getText();
		System.out.println("print the phone number displayed in it" + phoneNo);

	}

	// 8.Traversing table: Open the accounts page and print the contents of the
	// table
	@Test(priority = 8, dependsOnMethods = "logging", enabled = true)
	public void traversingTable() throws InterruptedException {

		// Login to the application
		logging();
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='grouptab_0'  and text()='Sales']")))
				.moveToElement(driver.findElement(By.id("moduleTab_9_Accounts"))).click().build().perform();
		// Verify that account table is opened
		Thread.sleep(3000);
		String account_Table = driver.findElement(By.className("module-title-text")).getText();

		System.out.println("Verify that account table is opened:::" + account_Table);

		String name = driver
				.findElement(By.xpath("//*[@id='MassUpdate']/div[3]/table/tbody/tr[position() mod 2=1]/td[3]"))
				.getText();
		System.out.println("Print the name row value:::" + name);
	}

	// 9. Traversing tables 2
	@Test(priority = 9, dependsOnMethods = "logging", enabled = true)
	public void traversingTable2() throws InterruptedException {
		logging();
		action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("grouptab_0")))
				.moveToElement(driver.findElement(By.id("moduleTab_9_Leads"))).click().build().perform();
		Thread.sleep(3000);
		String lead_Header = driver.findElement(By.className("module-title-text")).getText();
		System.out.println("Lead table is open::" + lead_Header);
		
		// Print the full name
		for (int i = 1; i <= 10; i++) {
			String name = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[" + i + "]/td[3]"))
					.getText();
			System.out.println("Print the name row value:::" + name);
			
			// Print the user
			String userName = driver
					.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[" + i + "]/td[8]")).getText();
			System.out.println("Print the User name :::" + userName);

		}

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}