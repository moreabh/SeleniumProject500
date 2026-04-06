package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class TC_RF_010 {
	
	@Test
	public void verifyingRegisteringAccountUsingInvalidEmail() throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Arun");
		driver.findElement(By.id("input-lastname")).sendKeys("Motoori");
		driver.findElement(By.id("input-email")).sendKeys("amotoori");
		driver.findElement(By.id("input-telephone")).sendKeys("09246812111");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);
		
		File screenShot1 = driver.findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot1, new File( System.getProperty("user.dir") + "\\Screenshot\\sc1Actual.png"));
		assertFalse(compareTwoScreenshots(System.getProperty("user.dir")+"\\Screenshot\\sc1Expected.png",System.getProperty("user.dir")+"\\Screenshot\\sc1Actual.png"));
		
		driver.findElement(By.id("input-email")).clear();
		
		//2nd input
		driver.findElement(By.id("input-email")).sendKeys("amotoori@");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);
		
		File screenShot2 = driver.findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot2, new File(System.getProperty("user.dir")+"\\Screenshot\\sc2Actual.png"));
		assertFalse(compareTwoScreenshots(System.getProperty("user.dir")+"\\Screenshot\\sc2Actual.png", System.getProperty("user.dir")+"\\Screenshot\\sc2Expected.png"));
		
		driver.findElement(By.id("input-email")).clear();
		
		//3rd input
		driver.findElement(By.id("input-email")).sendKeys("amotoori@gmail");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);
		
		String expectedWarningMessage = "E-Mail Address does not appear to be valid!";
		assertEquals(driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText(), expectedWarningMessage);
		
		driver.findElement(By.id("input-email")).clear();
		
		//4th input
		driver.findElement(By.id("input-email")).sendKeys("amotoori@gmail.");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);
		
		File screenShot3 = driver.findElement(By.xpath("//form[@class='form-horizontal']")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot3, new File(System.getProperty("user.dir")+"\\Screenshot\\sc3Actual.png"));
		assertFalse(compareTwoScreenshots(System.getProperty("user.dir")+"\\Screenshot\\sc3Actual.png", System.getProperty("user.dir")+"\\Screenshot\\sc3Expected.png"));
		
		
		driver.quit();
	}

	public boolean compareTwoScreenshots(String actualImagePath, String expectedImagePath) throws IOException {
		
		BufferedImage actualBufferedImage = ImageIO.read(new File(actualImagePath));
		BufferedImage expectedBufferedImage = ImageIO.read(new File(expectedImagePath));
		
		ImageDiffer imgDiffer = new ImageDiffer();
		ImageDiff imgDifference = imgDiffer.makeDiff(expectedBufferedImage, actualBufferedImage);
		
		return imgDifference.hasDiff();
	}
}
