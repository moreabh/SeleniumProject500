package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_018 {
	
	@Test
	public void verifyingTheRegisteringFieldAccordingToClientRequirement() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		String expectedHeight  = "34px";
		String expectedWidth  = "701.25px";
		WebElement continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
		
		//------------------------------------FirstName Field----------------------------------------------------------------------
		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		String actualFirstNameHeight= firstName.getCssValue("height");
//		String actualFirstNameWidth = firstName.getCssValue("width");
//		
//		assertEquals(expectedHeight, actualFirstNameHeight);
//		assertEquals(expectedWidth, actualFirstNameWidth);
//		
//		firstName.sendKeys(" ");
//		continueButton.click();
//		
//		String firstnameExpectedWarning = "First Name must be between 1 and 32 characters!";
//		
//		assertEquals(firstnameExpectedWarning, driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText());
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
//		firstName.sendKeys("a");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
//		firstName.sendKeys("ab");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
//		firstName.sendKeys("abcddhdeurthsky"); //15
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
//		firstName.sendKeys("ashskerthtyuiokashskerthtyuiokqr"); //32
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
//		firstName.sendKeys("ashskerthtyuiokashskerthtyuiokqrf"); //33
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertTrue(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		firstName = driver.findElement(By.id("input-firstname"));
//		firstName.clear();
//		
////		-----------------------------------------LastNameField Field Start---------------------------------------------------------------
//		
//		WebElement lastNameField = driver.findElement(By.id("input-lastname"));
//		
//		String actualLastNameHeight = lastNameField.getCssValue("height");
//		String actualLastNameWidth = lastNameField.getCssValue("width");
//		
//		assertEquals(actualLastNameHeight, expectedHeight);
//		assertEquals(actualLastNameWidth, expectedWidth);
//		
//		String lastNameExpectedWarning = "Last Name must be between 1 and 32 characters!";
//		
//		lastNameField.sendKeys(" ");
//		continueButton.click();
//		assertEquals(lastNameExpectedWarning, driver.findElement(By.xpath("//input[@id=\"input-lastname\"]/following-sibling::div")).getText());
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
//		
//		lastNameField.sendKeys("a");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id=\"input-lastname\"]/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
//		
//		lastNameField.sendKeys("ab");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
//		
//		lastNameField.sendKeys("abcddhdeurthsky"); //15
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
//		
//		lastNameField.sendKeys("ashskerthtyuiokashskerthtyuiokqr"); //32
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
//		
//		lastNameField.sendKeys("ashskerthtyuiokashskerthtyuiokqrf"); //33
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertTrue(driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		lastNameField = driver.findElement(By.id("input-lastname"));
//		lastNameField.clear();
		
//		-------------------------------------------------Email Field Start------------------------------------------------------------
		
		
//		WebElement emailField = driver.findElement(By.id("input-email"));
//		
//		String actualEmailFiledNameHeight = emailField.getCssValue("height");
//		String actualEmailFiledNameWidth = emailField.getCssValue("width");
//		
//		assertEquals(actualEmailFiledNameHeight, expectedHeight);
//		assertEquals(actualEmailFiledNameWidth, expectedWidth);
//	
//		String emailCharacterLimitWarning = "E-Mail Address does not appear to be valid!";
//		
//		emailField.sendKeys("sasdsdghtjeutkrjtudksasdsdghtjeutkrgdeerererererererererererwwree@gmail.com");
//		continueButton.click();
//
//		assertTrue(driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).isDisplayed());
//		
//		Reporter.log("BUG: Email field has character limit!", true);
		
//		---------------------------------------------------Telephone Field Start-----------------------------------------------------
	
//		WebElement telephoneField = driver.findElement(By.id("input-telephone"));
//		
//		String actualTelephoneFieldHeight = telephoneField.getCssValue("height");
//		String actualTelephoneFieldWidth = telephoneField.getCssValue("width");
//		
//		assertEquals(actualTelephoneFieldHeight, expectedHeight);
//		assertEquals(actualTelephoneFieldWidth, expectedWidth);
//		
//		String telephoneFieldExpectedWarning = "Telephone must be between 3 and 32 characters!";
//		telephoneField.sendKeys(" ");
//		continueButton.click();
//		
//		assertEquals(telephoneFieldExpectedWarning, driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText());
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		telephoneField.sendKeys("a");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		assertTrue(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		telephoneField.sendKeys("ab");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		assertTrue(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		telephoneField.sendKeys("abc");
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		
//		telephoneField.sendKeys("abcwertythuyikr");//15
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		
//		telephoneField.sendKeys("abcwertythuyikrabcwertythuyikrwe");//32
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		try {
//			assertFalse(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//			
//		} catch (NoSuchElementException e) {
//			// TODO: handle exception
//		}
//		
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
//		
//		
//		telephoneField.sendKeys("abcwertythuyikrabcwertythuyikrwew");//33
//		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
//		continueButton.click();
//		assertTrue(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).isDisplayed());
//		telephoneField = driver.findElement(By.id("input-telephone"));
//		telephoneField.clear();
		
//	---------------------------------------------------PasswordField Start ---------------------------------------------------)
		WebElement passwordField = driver.findElement(By.id("input-password"));
		
		String actualPasswordFieldHeight = passwordField.getCssValue("height");
		String actualPasswordFieldWidth = passwordField.getCssValue("width");
		
		assertEquals(actualPasswordFieldHeight, expectedHeight);
		assertEquals(actualPasswordFieldWidth, expectedWidth);
		
		String passwordFiledWarning = "Password must be between 4 and 20 characters!";
		
		passwordField.sendKeys("12a");
		continueButton.click();
		driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).isDisplayed();
		passwordField = driver.findElement(By.id("input-password"));
		passwordField.clear();
		
		passwordField.sendKeys("abc1");
		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
		continueButton.click();
		try {
			assertFalse(driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).isDisplayed());
		} catch (Exception e) {
			// TODO: handle exception
		}
		passwordField = driver.findElement(By.id("input-password"));
		passwordField.clear();
		
		passwordField.sendKeys("abc1345sdf");//10
		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
		continueButton.click();
		try {
			assertFalse(driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).isDisplayed());
		} catch (Exception e) {
			// TODO: handle exception
		}
		passwordField = driver.findElement(By.id("input-password"));
		passwordField.clear();
		
		passwordField.sendKeys("abc1345sdfabc1345sdf");//20
		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
		continueButton.click();
		try {
			assertFalse(driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).isDisplayed());
		} catch (Exception e) {
			// TODO: handle exception
		}
		passwordField = driver.findElement(By.id("input-password"));
		passwordField.clear();
		
		passwordField.sendKeys("abc1345sdfabc1345sdfq");//21
		continueButton = driver.findElement(By.xpath("//input[@value=\"Continue\"]"));
		continueButton.click();
		try {
			assertTrue(driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).isDisplayed());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

		passwordField = driver.findElement(By.id("input-password"));
		passwordField.clear();
		
		driver.quit();
	}

}
