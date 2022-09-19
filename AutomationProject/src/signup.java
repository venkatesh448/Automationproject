
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
@Test
public void rf() {
		// TODO Auto-generated method stub                
		// TODO Auto-generated method stub                  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\marri.venkateswar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.get(" https://mobileworld.banyanpro.com/");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("venkatesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("venkatesh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("venky@123");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20/01/2000");
		driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8769865431");
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("hello");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
	//	System.out.println(driver.switchTo().alert().getText());
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        //System.out.println(driver.switchTo().alert().getText());           
        //driver.quit();                }
 }


}


