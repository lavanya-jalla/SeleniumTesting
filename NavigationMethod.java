package SelenumTestings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NavigationMethod  {
	
@Test
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.calculator.net/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
