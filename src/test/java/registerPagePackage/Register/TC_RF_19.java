package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class TC_RF_19 {
	
	WebDriver driver;
	
	@Test
	public void verifyLeadingAndTrailingSpaceTrimmedAfterAccountCreationInRegisterPage() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
	
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//li[@class ='dropdown open']//a[text()='Register']")).click();
		String firstName="     Abhi      ";
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		String lastName = "    More    ";
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		
		String email = CommonUtils.generateNewEmail();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		String telephone = "    1234567891     ";
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.findElement(By.linkText("Continue")).click();
		
		//verification 
		
		driver.findElement(By.linkText("Edit your account information")).click();
		
		assertEquals(driver.findElement(By.id("input-firstname")).getAttribute("value"), firstName.trim());
		
		assertEquals(driver.findElement(By.id("input-lastname")).getAttribute("value"), lastName.trim());
		
		assertEquals(driver.findElement(By.id("input-email")), email.trim());
		
		assertEquals(driver.findElement(By.id("input-telephone")).getAttribute("value"), telephone.trim());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
