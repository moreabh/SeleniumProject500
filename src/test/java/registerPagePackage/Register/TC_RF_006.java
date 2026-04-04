package registerPagePackage.Register;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC_RF_006 {

	@Test
	public void registerVerificationWithPrivacyPolicyNo() {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("fiean");
		driver.findElement(By.id("input-lastname")).sendKeys("luoois");
		driver.findElement(By.id("input-email")).sendKeys(generateNewMail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.id("input-confirm")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//verification
		String properDetailsOne = "Your Account Has Been Created!";
		String actualProperDetails = driver.findElement(By.id("content")).getText();
		assertTrue(actualProperDetails.contains(properDetailsOne));
		
		
		driver.findElement(By.xpath("//div[@id='content']//a[text()='Continue']")).click();
		driver.findElement(By.xpath("//div[@id='content']//a[text()='Subscribe / unsubscribe to newsletter']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Newsletter']")).isDisplayed());
		
		assertTrue(driver.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).isSelected());
		
		driver.quit();
		
	}
	
	public String generateNewMail() {	
		
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoColon = dateToString.replace(":", "");
		String dateNoHyphen = dateNoColon.replace("-", "");
		String dateFinal = dateNoHyphen+"@gmail.com";
		return dateFinal;
	}
}
