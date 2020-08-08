package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1Autor {


    WebDriver driver;
 //   WebDriverWait wait = new WebDriverWait(driver, 30);

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testing-ground.scraping.pro/login");
        Thread.sleep(2000);
        driver.findElement(By.id("usr")).sendKeys("admin");
    }

    @Test
    public void testSuccessfulLoginTest() throws InterruptedException {
        driver.findElement(By.id("pwd")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("pwd")).sendKeys(Keys.ENTER);
  //      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("<< GO BACK")));
        Assert.assertNotNull( driver.findElement(By.className("success")) );
    }

    @Test
    public void testErrorPageTest() throws InterruptedException {

        driver.findElement(By.id("pwd")).sendKeys("999999");
        Thread.sleep(2000);
        driver.findElement(By.id("pwd")).sendKeys(Keys.ENTER);
 //       wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("<< GO BACK")));
        Assert.assertNotNull( driver.findElement(By.className("error")) );
    }

    @After
    public void quit(){
        driver.quit();
    }

}
