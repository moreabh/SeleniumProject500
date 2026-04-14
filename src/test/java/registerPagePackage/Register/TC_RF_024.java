package registerPagePackage.Register;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class TC_RF_024 {

	@Test
	public void verifyPasswordFiledByKeepingConfirmPasswordFieldEmpty() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("Abhi");
		driver.findElement(By.id("input-lastname")).sendKeys("More");
		driver.findElement(By.id("input-email")).sendKeys(CommonUtils.generateNewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verification 
		assertTrue(driver.findElement(By.xpath("//input[@id='input-confirm']/following-sibling::div")).isDisplayed());
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	
}
