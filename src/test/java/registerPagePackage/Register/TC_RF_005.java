package registerPagePackage.Register;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_005 {

	@Test
	public void registerFunctionality() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jacks");
		driver.findElement(By.id("input-lastname")).sendKeys("Den");
		driver.findElement(By.id("input-email")).sendKeys(generateNewMail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("Pass@1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Pass@1234");
		driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"agree\"][@value=\"1\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
		
		//verification
		
		assertTrue(driver.findElement(By.xpath("//ul[@class=\"breadcrumb\"]//a[text()=\"Newsletter\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//input[@name=\"newsletter\"][@value=\"1\"]")).isSelected());
		
		driver.close();
		
	}
	
	public String  generateNewMail() {
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoColon = dateToString.replace(":", "");
		String dateNoHyphen = dateNoColon.replace("-", "");
		String finalDate = dateNoHyphen+"@gmail.com";
		return finalDate;
	}
}
