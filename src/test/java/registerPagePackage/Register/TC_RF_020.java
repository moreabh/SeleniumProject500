package registerPagePackage.Register;

import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_020 {

	@Test
	public void verifyPrivacyPolicyFieldOnRegisterAccountPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click(); 
		
		assertFalse(driver.findElement(By.xpath("//input[@name='agree'][@value='1']")).isSelected());
		
		driver.quit();
		
	}
}
