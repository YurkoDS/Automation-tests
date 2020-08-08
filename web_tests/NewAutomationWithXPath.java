package web_tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAutomationWithXPath {


    WebDriver driver;

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://uaconcept.com/uk/");
        Thread.sleep(2000);

    }

    @Test
    public void SuccessfulSearch() throws InterruptedException {
        driver.findElement(By.xpath("/html//section[@id='content']/div[@class='content-wrap']/div[2]/div[1]/div/div[@class='fbox-icon']/a[@href='/uk/divani-ta-krisla']/i")).click();
        System.out.println("--select sofa--");
        Thread.sleep(2000);

        Assert.assertNotNull(driver.findElement(By.xpath("//div[@id='shop']/h3")));
        System.out.println("--&#128522--");

    }

    @Test
    public void SelectProduct() throws InterruptedException {
        driver.findElement(By.xpath("/html//section[@id='content']/div[@class='content-wrap']/div[2]/div[1]/div/div[@class='fbox-icon']/a[@href='/uk/divani-ta-krisla']/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shop\"]/div[1]/div[1]/a/img")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/div/div/div/ol/li[9]/img")).click();
        Assert.assertNotNull(driver.findElement(By.xpath("//section[@id='page-title']//h1[.='Пуф Wool Stone S']")));
        System.out.println("--the desired photo is selected--");
        System.out.println("--&#128522--");

    }

    @Test
    public void SoppingBasket() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[7]/div/div/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shop\"]/div[2]/div[2]/div[1]/h3/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//section[@id='content']/div[@class='content-wrap']//div[@class='col_two_fifth product-desc']/form[@method='post']//input[@value='+']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[2]/form/a")).click();
        Thread.sleep(4000);
        Assert.assertNotNull(driver.findElement(By.xpath("//a[@id='top-cart-trigger']/span[.='2']")));
        System.out.println("--Product is added.--");
        System.out.println("--&#128522--");

    }

    @Test
    public void Emptying_the_basket() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[6]/div/div/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='shop']//ul[@class='pagination']//a[@href='?page=3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//div[@id='shop']/div[3]//h3/a[@href='/uk/catalog/65']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[2]/form/div/input[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html//section[@id='content']/div[@class='content-wrap']//div[@class='col_two_fifth product-desc']/form[@method='post']/a[@class='add-to-cart button nomargin']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html//a[@id='btn-cart-view']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='table-cart']/table//a[@title='Remove this item']/i[@class='icon-trash2']")).click();

        Thread.sleep(5000);
        Assert.assertNotNull(driver.findElement(By.xpath("//div[@id='table-cart']//strong[.='Ваша корзина досi порожня!']")));
        System.out.println("--The basket is empty.--");
        System.out.println("--&#128522--");


    }
    @After
    public void quit(){
        driver.quit();
    }
}