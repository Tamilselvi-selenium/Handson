package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		//initalization of chrome
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//wait statement until page load  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//giving URL
		driver.get("https://www.leafground.com/radio.xhtml");
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("//label[contains(text(),'Firefox')]")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
		boolean selected = driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).isEnabled();
		System.out.println(selected);
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
		boolean enabled = driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).isSelected();
		System.out.println(enabled);
		//Identify the radio button that is initially selected by default
		boolean selected2 = driver.findElement(By.xpath("(//label[contains(text(),'Safari')])[2]")).isEnabled();
		System.out.println(selected2);
		//Check and select the age group (21-40 Years) if not already selected
		boolean selected3 = driver.findElement(By.xpath("//label[contains(text(),'21-40 Years')]")).isEnabled();
		System.out.println(selected3);
		if(selected3==true) {
			System.out.println("age group is already selected");
		}
	}

}
 