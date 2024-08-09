package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHome {

	public static void main(String[] args) throws InterruptedException {
		//initalization of chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//wait statement until page load  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//giving URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
		//Verify that the expected message is displayed.
		String text = driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText();
		if(text.contains("Checked")) {
			System.out.println("Verified the Expected Message is displayed correctly");
		}else {
			System.out.println("Verified the Expected Message is not displayed correctly");
		}
		//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[contains(text(),'Python')]")).click();
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		System.out.println("success");
		//Verify which tri-state option has been chosen.
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'1')]")).getText();
		if(text1.contains("1")) {
			System.out.println("Verified the tri-state option is 1");
		}else {
			System.out.println("Verified the tri-state option is not equal to 1");
		}
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//Verify that the expected message is displayed.
		Thread.sleep(1000);
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText();
		if(text2.contains("Checked")) {
			System.out.println("Verified the Expected Message is displayed correctly");
		}else {
			System.out.println("Verified the Expected Message is not displayed correctly");
		}
		//Verify if the Checkbox is disabled
		boolean enabled = driver.findElement(By.xpath("//span[contains(text(),'Disabled')]")).isSelected();
		if(enabled==false) {
			System.out.println("element is disabled");
		}else {
			System.out.println("element is enabled");
		}
	
		//Select multiple options on the page (details may be needed)
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class, 'ui-selectcheckboxmenu-panel ui-widget ui-widget-content ui-corner-all ui-helper-hidden ui-input-overlay')]//ul/li/div[@class='ui-chkbox ui-widget'])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((//div[contains(@class, 'ui-selectcheckboxmenu-panel ui-widget ui-widget-content ui-corner-all ui-helper-hidden ui-input-overlay')]//ul/li/div[@class='ui-chkbox ui-widget']))[2]")).click();
		//Perform any additional actions or verifications required
		//driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget ui-toggleswitch-checked']")).click();
		//Close the web browser when done
		System.out.println("success");
		//driver.close();
	}

}
