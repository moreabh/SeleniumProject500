package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_RF_11 {
	WebDriver driver = new ChromeDriver() ;

	@Test
	public void VerifyRegisterAccountByProvidingInvalidPhoneNumber() throws InterruptedException {
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Arun");
		driver.findElement(By.id("input-lastname")).sendKeys("Motoori");
		driver.findElement(By.id("input-email")).sendKeys(generateNewMail());
		driver.findElement(By.id("input-telephone")).sendKeys("111");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String expectedWarning = "Telephone Number does not appear to be valid";
		assertEquals(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")), expectedWarning);
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void tearDown() {
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
