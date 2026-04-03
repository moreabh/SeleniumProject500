package registerPagePackage.Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RF__003 {
	
	public void main() {
	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://tutorialsninja.com/demo/");
		
	driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
	
	}
}
