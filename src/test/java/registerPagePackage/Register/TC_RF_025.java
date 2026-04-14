package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_025 {

	@Test
	public void verifyBreadcrumbPageHeadingPageURLPAgeTitleOfRegisterAccountPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());
		
		String expectedHeading = "Register Account";
		assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1[text()='Register Account']")).getText(), expectedHeading);
		
		String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/register";
		assertEquals(driver.getCurrentUrl(), expectedURL);
		
		driver.quit();

	}
}
