package SelenumTestings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMICalculator {
	@Test
	 public static void openApplication() throws InterruptedException{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.calculator.net/bmi-calculator.html");
		 driver.findElement(By.linkText("Metric Units")).click();
		 driver.findElement(By.name("cage")).clear();
		 driver.findElement(By.name("cage")).sendKeys("20");
		 driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[2]/td[2]/label[2]")).click();
		 driver.findElement(By.name("cheightmeter")).clear();
		 driver.findElement(By.name("cheightmeter")).sendKeys("155");
		 driver.findElement(By.name("ckg")).clear();
		 driver.findElement(By.name("ckg")).sendKeys("60");
		 driver.findElement(By.name("x")).click();
		 Thread.sleep(4000);
		 driver.quit();
		
}
}
