package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_RF_23 {
	
	@Test
	public void verifyingNavigatingToOtherPageOptionsAndLinks() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='list-inline']//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//ul[@class='list-inline']//i[@class='fa fa-phone']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Contact Us']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//ul[@class='list-inline']//i[@class='fa fa-heart']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Login']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//ul[@class='list-inline']//i[@class='fa fa-shopping-cart']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Shopping Cart']")).isDisplayed());
		driver.navigate().back();

		driver.findElement(By.xpath("//ul[@class='list-inline']//i[@class='fa fa-share']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Shopping Cart']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='container']//i[@class='fa fa-search']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Search']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Login']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.xpath("//div[@id='content']//a[text()='login page']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Login']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Register']")).click();
		assertEquals("https://tutorialsninja.com/demo/index.php?route=account/register", driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Forgotten Password']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/forgotten");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='My Account']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Address Book']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Wish List']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Order History']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Downloads']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Recurring payments']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Reward Points']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Returns']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Transactions']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Newsletter']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='pull-right']//b[text()='Privacy Policy']")).click();
		assertTrue(driver.findElement(By.xpath("//div[@class='modal-dialog']//h4[text()='Privacy Policy']")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='modal-header']//button[text()='×']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='About Us']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='About Us']")).isDisplayed());
		driver.navigate().back();
	
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Delivery Information']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Delivery Information']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Privacy Policy']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Privacy Policy']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Terms & Conditions']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Terms & Conditions']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Terms & Conditions']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Terms & Conditions']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Contact Us']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Contact Us']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Returns']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Product Returns']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Site Map']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Site Map']")).isDisplayed());
		driver.navigate().back(); 	
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Brands']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Brand']")).isDisplayed());
		driver.navigate().back(); 	
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Gift Certificates']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Gift Certificate']")).isDisplayed());
		driver.navigate().back(); 
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Affiliate']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=affiliate/login");
		driver.navigate().back(); 
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Specials']")).click();
		assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Special Offers']")).isDisplayed());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='My Account']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Order History']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Wish List']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[@class='col-sm-3']//a[text()='Newsletter']")).click();
		assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.navigate().back();
		
		driver.quit();
		
	}

}
