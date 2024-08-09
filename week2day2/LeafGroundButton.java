package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {
 
	public static void main(String[] args) {
		//initalization of chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//wait statement until page load  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//giving URL
		driver.get("https://leafground.com/button.xhtml");
		//Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean enabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println(enabled);
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).getLocation();
		System.out.println(location);
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		String cssValue = element.getCssValue("background-color");
		System.out.println(cssValue);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize();
		System.out.println(size);
		//Close the browser window
		driver.close();
	}

}
