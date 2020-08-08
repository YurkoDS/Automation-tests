package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GotoShop_test {

    WebDriver driver;
    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://account.gotoshop.ua/login/");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("nikky@test.net");
        System.out.println("--email--");
         }

    @Test
    public void testSuccessfulLoginTest() throws InterruptedException {

        driver.findElement(By.name("password")).sendKeys("nikky");
        System.out.println("--password--");
        Thread.sleep(2000);
        driver.findElement(By.id("rememberme")).sendKeys(Keys.ENTER);
        System.out.println("--RememderMe--");
        Thread.sleep(6000);

        Assert.assertNotNull( driver.findElement(By.className("plus-icon")));
    }

   @Test
   public void testErrorPageTest() throws InterruptedException {

       Thread.sleep(2000);
       driver.findElement(By.id("rememberme")).sendKeys(Keys.ENTER);
       Assert.assertNotNull( driver.findElement(By.className("form-element-errors")));
       Thread.sleep(6000);
       //driver.findElement(By.name("password")).sendKeys("nikkkkky");
       System.out.println("-- No password , correct error message--");

   }

    @Test
    public void testLogOUT() throws InterruptedException {

        driver.findElement(By.name("password")).sendKeys("nikky");
        System.out.println("--valid password--");
        Thread.sleep(2000);
        driver.findElement(By.id("rememberme")).sendKeys(Keys.ENTER);
        System.out.println("--Enter--");
        Thread.sleep(4000);
        driver.findElement(By.className("glyphicon-log-out")).click();
        System.out.println("--Log out--");
        Thread.sleep(4000);

        Assert.assertNotNull( driver.findElement(By.className("bg-info")));
    }


    @After
    public void quit(){
        driver.quit();
    }

}











