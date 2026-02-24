package SelenumTestings;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new EdgeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	String parentWindow=driver.getWindowHandle();
	Set<String> allWinHandles=driver.getWindowHandles();
	for(String cw:allWinHandles) {
		System.out.println(cw);
		driver.switchTo().window(cw);
	}
	System.out.println(parentWindow);
	driver.getWindowHandles();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.quit();
	
}
}
