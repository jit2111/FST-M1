package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
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
        String title = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]")).getText();

        //Print the title of the page
        System.out.println("Page Second header is: " + title);

        //Assertion for page title
        Assert.assertEquals("Quia quis non", title);

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
