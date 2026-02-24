package SelenumTestings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoanCalculator {
	@Test
	 public static void openApplication() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.calculator.net/");
	 driver.findElement(By.linkText("Loan Calculator")).click();
	 driver.findElement(By.name("cloanamount")).clear();
	 driver.findElement(By.name("cloanamount")).sendKeys("200000");
	 WebElement compounddropdown=driver.findElement(By.name("ccompound"));
	 Select oSelect=new Select(compounddropdown);
	 oSelect.selectByValue("quarterly");
	 WebElement payBackDropdown=driver.findElement(By.name("cpayback"));
	 Select oSelect1=new Select(payBackDropdown);
	 oSelect1.selectByValue("quarter");
	 driver.findElement(By.name("x")).click();
	 System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/table/tbody/tr[6]/td/input[2]")).getText());
	 Thread.sleep(2000);
	 driver.quit();
	}

}
