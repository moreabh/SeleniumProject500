package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_008 {

	@Test
	public void registerPasswordFieldVerification() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("auanish");
		driver.findElement(By.id("input-lastname")).sendKeys("honur");
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("123454");
		driver.findElement(By.id("input-confirm")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//verification
		
		String expectedWarning = "Password confirmation does not match password!";
		
		assertEquals(driver.findElement(By.xpath("//div[text()='Password confirmation does not match password!']")).getText(),expectedWarning);
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	public String generateNewEmail() {
		
		LocalDateTime date = LocalDateTime.now();
		String dateToString = date.toString();
		String dateNoColon = dateToString.replace(":", "");
		String dateNoHyphen = dateNoColon.replace("-", "");
		String dateFinal = dateNoHyphen+"@gmail.com";
		return dateFinal;
	}
}
