package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class TC_RF_17 {

	WebDriver driver;
	
	@Test(dataProvider = "passwordSupplier")
	public void checkingPasswordCoplexityStndardsOnRegisterPage(String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("dora");
		driver.findElement(By.id("input-lastname")).sendKeys("sopan"); 
		driver.findElement(By.id("input-email")).sendKeys(CommonUtils.generateNewEmail());
		driver.findElement(By.id("input-telephone")).sendKeys("1234567898");
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		
		String passwordWarning = "Password Entered is not matching the complexity standards";
		
		assertEquals(driver.findElement(By.xpath("//input[@id=\"input-password\"]/following-sibling::div")).getText(), passwordWarning);
		
		assertFalse(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Success']")).isDisplayed());
		
	
		driver.quit();
   }
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name = "passwordSupplier")
	public Object[][] passwordSupplier(){
		
		Object [][] password = {{"12345"},{"abcdefghi"},{"abcde1234"},{"abcd123#"},{"ABCDEFGHI%"},{"abcdEFGHI"},{"abcd12DF"}};
	
		return password;
	}
}
