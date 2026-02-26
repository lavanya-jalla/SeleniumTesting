package SelenumTestings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		Actions acts=new Actions(driver);
		WebElement boxA=driver.findElement(By.id("column-a"));
		WebElement boxB=driver.findElement(By.id("column-b"));
		acts.dragAndDrop(boxA, boxB).perform();
		acts.moveToElement(boxB)
		.clickAndHold()
		.moveToElement(boxA)
		.release()
		.build().perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
