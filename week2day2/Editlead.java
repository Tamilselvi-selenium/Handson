package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

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
		//Click on the "CRM/SFA" link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on the "Leads" tab
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//Click on Create Lead
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Automation");
		//Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Learning");
		//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Selenium");
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("test");
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("sel");
		//Enter the Description Field Using any Locator of your choice
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testautomation");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nhjh@gmail.com");
		//Select State/Province as NewYork Using Visible Text.
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select obj = new Select(element);
		obj.selectByVisibleText("Arizona");
		//Click on the Create Button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//Click on the edit button.
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		//Clear the Description Field.
		driver.findElement(By.xpath("//textarea[contains(text(),'testautomation')]")).clear();
		//Fill the Important Note Field with Any text
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("deleted the description");
		//Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Get the Title of the Resulting Page.
		String text = driver.findElement(By.xpath("//div[contains(text(),'View Lead')]")).getText();
		if(text.contains("View Lead")) {
			System.out.println("title is verified");
		}else {
			System.out.println("title is wrong");
		}
		//Close the browser window.
		driver.close();
	}

}
