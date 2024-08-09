package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		//Click "Find leads."
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("97");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Capture the lead ID of the first resulting lead.
		String text = driver.findElement(By.xpath("//a[contains(text(),'13313')]")).getText();
		System.out.println(text);
		//Click the first resulting lead.
		driver.findElement(By.xpath("//a[contains(text(),'13313')]")).click();
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		//Enter the captured lead ID. 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		System.out.println(text2);
		//Close the browser.
		driver.close();

	}

}
