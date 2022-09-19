

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin {
@Test
public void df(){
 
	// TODO Auto-generated catch block
	System.setProperty("webdriver.chrome.driver","C:\\Users\\marri.venkateswar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get(" https://mobileworld.banyanpro.com/");
	 driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	 driver.manage().window().maximize();
	 driver.findElement(By.id("username")).sendKeys("venkatesh");
	 driver.findElement(By.name("password")).sendKeys("venky@20");
	// Thread.sleep(2000);
	 driver.findElement(By.linkText("Log In")).click();	 
}
}

	 
 




