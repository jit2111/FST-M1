package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
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

        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Jobs Page Title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Jobs – Alchemy Jobs", title);

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
