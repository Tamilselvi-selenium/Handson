package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//maximize the window 
		driver.manage().window().maximize();
		//wait statement until page load  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//giving URL
		driver.get("http://en-gb.facebook.com/");
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium");
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Learning");
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6789567345");
		//Enter the New password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Course123");
		//Handle all three dropdowns in Date of birth
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select opt =new Select(element);
		opt.selectByValue("12"); 
		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select opt1 =new Select(element1);
		opt1.selectByValue("2"); 
		WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select opt2 =new Select(element2);
		opt2.selectByValue("2022"); 
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		System.out.println("Successful");
		driver.close();

	}

}
