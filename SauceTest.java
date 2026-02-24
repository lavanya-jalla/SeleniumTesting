package SelenumTestings;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceTest {
	@Test
	 public static void openApplication() throws InterruptedException{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	
	 driver.findElement(By.name("user-name")).sendKeys("standard_user");
	 driver.findElement(By.name("user-name")).sendKeys(Keys.ENTER);
	 driver.findElement(By.name("password")).sendKeys("secret_sauce");
	 driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	 driver.findElement(By.name("login-button")).click();
	 Assert.assertEquals(driver.getTitle(),"Swag Labs");
	 String textOnpage=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
//	 Assert.assertEquals(textOnpage,"Products");
	 Thread.sleep(4000);
	 driver.quit();

	}
	}
