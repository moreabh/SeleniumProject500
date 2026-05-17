package registerPagePackage.Register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import utils.CommonUtils;

public class TC_RF_026 {

	@Test
	public void verifyingTheUIOfRegisterAccountPage() throws IOException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screeenshot = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(screeenshot, new File(System.getProperty("user.dir")+"\\Screenshot\\actualScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(CommonUtils.compareTwoScreenshots(System.getProperty("user.dir")+"\\Screenshot\\actualScreenshot.png", System.getProperty("user.dir")+"\\Screenshot\\expectedScreenshot.png"));
		
		driver.quit();
			
			
	}
}
