package SelenumTestings;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SnapDeal {
	@Test
	 public static void snapDealApplication() throws InterruptedException, IOException{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 Actions acts=new Actions(driver);
		 WebElement kidsLink=driver.findElement(By.xpath("//*[@id=\"tab-category-3\"]/div"));
		 acts.moveToElement(kidsLink).perform();
		 driver.findElement(By.xpath("//*[@id=\"tab-category-3\"]/div[2]/div[2]/div[1]/div[7]")).click();
		 driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/div/div"));
		 WebElement highToLow = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/div/div"));
		 acts.moveToElement(highToLow).click().perform();
		 
		 driver.findElement(By.xpath("//*[@id=\"products\"]/section[1]/div[1]")).click();
		 Set<String> allWinHandles=driver.getWindowHandles();
		 for(String cw:allWinHandles) {
			 driver.switchTo().window(cw);
			 
		 }
		 printScreen(driver);
		 
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

	public static void printScreen(WebDriver driver) throws IOException {
		driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]")).click();
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File screenshot=ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("./Screenshots/error.png"));
	}
}
