package SelenumTestings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SeleniumTest {
// public static void main(String[] args) {
	@Test
	 public static void openApplication() throws InterruptedException{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 Assert.assertEquals(driver.getTitle(),"Google");
	 driver.findElement(By.name("q")).sendKeys("selenium");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 driver.quit();
	 
 }

}
