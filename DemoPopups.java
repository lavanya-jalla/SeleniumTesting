package SelenumTestings;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoPopups {
	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver = new EdgeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
System.out.println(driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div/div[6]/div[1]/div/div/div/div[5]/pre[5]/span/span[7]")).getText());
driver.switchTo().frame("iframeResult");
System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
driver.findElement(By.xpath("/html/body/button")).click();
Alert popup = driver.switchTo().alert();
popup.dismiss();
System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
Thread.sleep(5000);
driver.quit();

}
}
