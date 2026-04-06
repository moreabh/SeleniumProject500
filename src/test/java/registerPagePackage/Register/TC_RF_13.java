package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_13 {
	
	@Test
	public void verifyRegisterPageFieldPlaceHolders() {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		String expectedFirstNamePlaceHolderText = "First Name";
		assertEquals(driver.findElement(By.id("input-firstname")).getAttribute("placeholder"), expectedFirstNamePlaceHolderText);
		
		String expectedLastNamePlaceHolderText = "Last Name";
		assertEquals(driver.findElement(By.id("input-lastname")).getAttribute("placeholder"), expectedLastNamePlaceHolderText);
		
		String expectedEmailPlaceHolderText = "E-Mail";
		assertEquals(driver.findElement(By.id("input-email")).getAttribute("placeholder"),expectedEmailPlaceHolderText);
		
		String expectedTelephonePlaceHolderText = "Telephone";
		assertEquals(driver.findElement(By.id("input-telephone")).getAttribute("placeholder"), expectedTelephonePlaceHolderText);
		
		String expectedPasswordPlaceHolderText = "Password";
		assertEquals(driver.findElement(By.id("input-password")).getAttribute("placeholder"), expectedPasswordPlaceHolderText);
		
		String expectedConfirmPasswordPlaceHolderText = "Password Confirm";
		assertEquals(driver.findElement(By.id("input-confirm")).getAttribute("placeholder"), expectedConfirmPasswordPlaceHolderText);
		
		
		driver.quit();
	}

}
