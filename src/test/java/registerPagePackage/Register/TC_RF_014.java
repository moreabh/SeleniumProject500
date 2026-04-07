package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_RF_014 {

	WebDriver driver ;
	
	@Test
	public void verifyMandatoryFieldsSymbolAndColorInRegisterAccountPage() {

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		String expectedContent = "\"* \"";
		String expectedColor = "rgb(255, 0, 0)";
		
		//Firstname
		WebElement firstNameLabel = driver.findElement(By.cssSelector("label[for=\"input-firstname\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String firstNamecontent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", firstNameLabel);
		
		String firstNamecolor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", firstNameLabel);

		
		assertEquals(expectedContent, firstNamecontent);
		assertEquals(expectedColor, firstNamecolor);
		
		//lastname
		WebElement lastNameLabel = driver.findElement(By.cssSelector("label[for=\"input-lastname\"]"));
		
		String lastNamecontent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", lastNameLabel);
		
		String lastNamecolor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", lastNameLabel);
		
		assertEquals(expectedContent, lastNamecontent);
		assertEquals(expectedColor, lastNamecolor);
		
		//Email
		
		WebElement emailLabel = driver.findElement(By.cssSelector("label[for=\"input-email\"]"));
		
		String emailcontent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", emailLabel);
		
		String emailcolor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", emailLabel);
		
		assertEquals(expectedContent, emailcontent);
		assertEquals(expectedColor, emailcolor);
		
		//Telephone 
		
		WebElement telephoneLabel = driver.findElement(By.cssSelector("label[for=\"input-telephone\"]"));
		
		String telephoneContent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", telephoneLabel);
		
		String telephoneColor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", telephoneLabel);
		
		assertEquals(expectedContent, telephoneContent);
		assertEquals(expectedColor, telephoneColor);
		
		//Password 
		
		WebElement passwordLabel = driver.findElement(By.cssSelector("label[for=\"input-password\"]"));
		
		String passwordContent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", passwordLabel);
		
		String passwordColor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", passwordLabel);
		
		assertEquals(expectedContent, passwordContent);
		assertEquals(expectedColor, passwordColor);
		
		//Confirm password
		
		WebElement privacyPolicyLabel = driver.findElement(By.cssSelector("div[class=\"pull-right\"]"));
		
		String privacyPolicyContent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');", privacyPolicyLabel);
		
		String privacyPolicyColor = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", privacyPolicyLabel);
		
		assertEquals(expectedContent, privacyPolicyContent);
		assertEquals(expectedColor, privacyPolicyColor);
		
		
		
		driver.quit();
		
	}
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
		
	}
}
