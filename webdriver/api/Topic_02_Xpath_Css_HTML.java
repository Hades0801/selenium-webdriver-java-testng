package api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Xpath_Css_HTML {
  WebDriver driver;
	  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://alada.vn/tai-khoan/dang-ky.html");
  }
  
  @Test
  public void TC_01_Validate() throws InterruptedException {
	  driver.findElement(By.xpath("//form[@id='frmLogin']//button[text()='ĐĂNG KÝ']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("input[id = 'txtFirstname']")).sendKeys("Trần Xuân Lộc");
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("input[id = 'txtPassword']")).sendKeys("123456");
	  Thread.sleep(3000);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
