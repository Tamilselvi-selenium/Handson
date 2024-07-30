package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		//Click on the "Create Lead" button.
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Learn");
		//Enter a LastName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Selenium");
		//Enter a CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//Enter a Title .
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Automation");
		//Click the "Create Lead" button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Verify that the Title is displayed correctly.
		String text = driver.findElement(By.xpath("//span[contains(text(),'Automation')]")).getText();
		System.out.println(text);
		if(text.contains("Automation")) {
			System.out.println("Title is displayed correctly");
		}else {
			System.out.println("Title is not displayed correctly");
		}
		//Close the browser window
		driver.close();
	}

}
