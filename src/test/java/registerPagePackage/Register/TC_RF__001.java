package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF__001 {

	@Test
	public void main() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://tutorialsninja.com/demo/");
		
		//Fill The form of register page
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		driver.findElement(By.name("lastname")).sendKeys("More");
		driver.findElement(By.id("input-email")).sendKeys(generateNewMail());
		driver.findElement(By.id("input-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.id("input-confirm")).sendKeys("1234");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		//verifying user is loged in or not
		assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		String expectedHeading = "Your Account Has Been Created!";
		
		assertEquals(driver.findElement(By.xpath("//div[@id='common-success']//h1")).getText(), expectedHeading);
		
		System.out.println("executed");
		

		String actualProperDetailsOne = "Congratulations! Your new account has been successfully created!";
		String actualProperDetailsTwo = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String actualProperDetailsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String actualProperDetailsFour = "contact us";
		
		String expectedProperDetails = driver.findElement(By.id("content")).getText();
		
		
		assertTrue(expectedProperDetails.contains(actualProperDetailsOne));
		assertTrue(expectedProperDetails.contains(actualProperDetailsTwo));
		assertTrue(expectedProperDetails.contains(actualProperDetailsThree));
		assertTrue(expectedProperDetails.contains(actualProperDetailsFour));	
		
		driver.findElement(By.linkText("Continue")).click();
		
		//verify login page is displayed or not
		assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit();
		
	}
	
	public static  String generateNewMail() {
		LocalDateTime date = LocalDateTime.now();
		
		String dateToString = date.toString();
		String dateNoColon = dateToString.replaceAll(":", "");
		String dateNoHyphen = dateNoColon.replaceAll("-", "");
		String finalDate = dateNoHyphen+"@gmail.com";
		return finalDate;
		
	}

}
