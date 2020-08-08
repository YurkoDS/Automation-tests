package web_tests.Lingualeo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_test {

    WebDriver driver;
    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://lingualeo.com/ru");
        Thread.sleep(2000);}


    @Test
    public void ActiveLink() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']//div[@class='ll-landing__store-link ll-landing__store-link--main']/a[@href='https://appgallery8.huawei.com/#/app/C100980145']/img[@src='/neo-static/huawei_ru.bb2e2a95521bf8d648320c4f1246e952.svg']")).click();
        Thread.sleep(5000);
        System.out.println("--OK--");
        Thread.sleep(2000);
          }

    @Test
    public void Language() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']//div[@class='ll-locale-selector2__button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//a[@href='/es']")).click();

        System.out.println("--It's OK--");
        Thread.sleep(2000);
        Assert.assertNotNull(driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-landing__main-right-LoginForm-top-text']")));
        Thread.sleep(3000);
    }



    @Test
    public void SuccessfulLodin() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-login-form ll-login-form__m-mode-switch']")).click();
      driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='email']")).sendKeys("Test_QA_2@ukr.net");
        System.out.println("--user email--");
        Thread.sleep(2000);
       driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='password']")).sendKeys("testing62625");
        System.out.println("--user password--");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//div[@class='ll-login-form']/div[4]/button")).click();
        Thread.sleep(3000);
       Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/div[8]/a/div")));
        Thread.sleep(2000);
          }


    @Test
    public void UnuccessfulLodin() throws InterruptedException {
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-login-form ll-login-form__m-mode-switch']")).click();
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='email']")).sendKeys("Test_QA_2@ukr.net");
        System.out.println("--user email--");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='password']")).sendKeys("testing62");
        System.out.println("--user password--");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//div[@class='ll-login-form']/div[4]/button")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-login-form__error-msg']")));
    }



    @Test
    public void Exit() throws InterruptedException {
      driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-login-form ll-login-form__m-mode-switch']")).click();
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='email']")).sendKeys("Test_QA_2@ukr.net");
        System.out.println("--user email--");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//input[@name='password']")).sendKeys("testing62625");
        System.out.println("--user password--");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']/div[@class='ll-landing']//div[@class='ll-login-form']/div[4]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__header']//span[@class='ll-leokit__site-menu__header__title__main ll-leokit__site-menu__header__title__main__m-with-sub']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application ll-application__m-no-scroll ll-application__m-with-fixed-header']/div[@class='ll-application__header ll-application__header__m-extravisible']/div[@class='ll-leokit__site-menu__wrapper ll-leokit__site-menu__wrapper__m-expanded']/div[@class='ll-leokit__site-menu__vertical-scroller']//div[@class='ll-leokit__user-menu']/ul//a[@href='/logout']/span[@class='ll-leokit__user-menu-item__content']")).click();
        Assert.assertNotNull(driver.findElement(By.xpath("/html//div[@id='app']/div[@class='ll-application']/div[@class='ll-application__content']/div[@class='ll-application__content-inner']//div[@class='ll-landing__main-right-LoginForm-top-text']")));
    }



    @After
    public void quit(){driver.quit();    }
}
