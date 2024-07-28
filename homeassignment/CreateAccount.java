package week2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		//initalization of chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//wait statement until page load  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//giving URL
		driver.get("http://leaftaps.com/opentaps/");
		//username field 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//Password field
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//handling popup 
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on the "Accounts" tab.
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		//Click on the "Create Account" button
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		//Enter an account name.
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Selenium1312");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		//Select "ComputerSoftware" as the industry
		WebElement element = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select opt = new Select(element);
		opt.selectByVisibleText("Computer Software");
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement element2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select  opt1 =new Select(element2);
		opt1.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue.
		WebElement element3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select  opt2 =new Select(element3);
		opt2.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement element4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select  opt3 =new Select(element4);
		opt3.selectByIndex(5);
		//Select "Texas" as the state/province using SelectByValue
		WebElement element5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select  opt4 =new Select(element5);
		opt4.selectByValue("TX");
		//Click the "Create Account" button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Verify that the account name is displayed correctly.
		String text = driver.findElement(By.xpath("//span[contains(text(),'Selenium')]")).getText();
		System.out.println(text);
		if(text.contains("Selenium1312")) {
			System.out.println("Lead Account is created");
		}else {
			System.out.println("Lead Account is not created");
		}
		//Close the browser window
		driver.close();
	}

}
