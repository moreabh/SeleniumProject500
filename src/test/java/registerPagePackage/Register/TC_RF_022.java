package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_022 {
	
	@Test
	public void verifyPasswordAndPasswordConfirmFieldToggledAfterEnteringPassword() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		
		assertEquals(driver.findElement(By.id("input-password")).getAttribute("type"), "password");
		assertEquals(driver.findElement(By.id("input-confirm")).getAttribute("type"),"password");
		
		driver.quit();
	}
}
