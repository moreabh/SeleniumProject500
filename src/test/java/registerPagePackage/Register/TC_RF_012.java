package registerPagePackage.Register;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class TC_RF_012 {

	@Test
	public void verifyRegisterAccountUsingKeyboardKeys() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		Actions act = new Actions(driver);
		
		for (int i = 1; i <= 23; i++) {
			act.sendKeys(Keys.TAB).perform();
		}
		
		act.sendKeys("jack").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB)
		.sendKeys("jones").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB)
		.sendKeys(CommonUtils.generateNewEmail()).pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB)
		.sendKeys("1234567891").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB)
		.sendKeys("1234").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB)
		.sendKeys("1234").pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).sendKeys(Keys.TAB.LEFT)
		.pause(Duration.ofSeconds(1)).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB.ENTER).perform();
		
		assertTrue(driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Success']")).isDisplayed());
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
}
