package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase() {
        // Check the header of the page
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking");
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).click();
        driver.manage().timeouts().implicitlyWait(2, SECONDS);
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/h3[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[3]/input[1]")).click();
        String email = driver.findElement(By.xpath("//a[contains(text(),'abhiram@cklabs.com')]")).getText();
        System.out.println("The Email is : " + email);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
