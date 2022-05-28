package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Activity8 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void TestCase() {
        // Check the header of the page
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        String ele = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
        System.out.println("The home Page Text Is : + ele");
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
