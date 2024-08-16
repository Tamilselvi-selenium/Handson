package week3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications"); 
		ChromeDriver driver =new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@aria-label='search']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		List<WebElement> a = driver.findElements(By.xpath("//span[@class='price  ']"));
		for(int i=0; i<a.size();i++) {
		String text = a.get(i).getText();
		System.out.println(text);
		}
List<WebElement> b=	driver.findElements(By.xpath("//div[@class='brand']"));
for(int j=0;j<b.size();j++) {
	String n = b.get(j).getText();
	System.out.println(n);
}
List<WebElement> c =	driver.findElements(By.xpath("//div[@class='nameCls']"));
for(int h=0;h<c.size();h++) {
	String m = c.get(h).getText();
	System.out.println(m);
}
	}

}
