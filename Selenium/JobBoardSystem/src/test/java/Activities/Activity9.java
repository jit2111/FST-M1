package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void TestCase() throws InterruptedException {
        // Check the header of the page
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='adminmenumain']/div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-posts-job_listing']/a[1]/div[3]")).click();
        driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]")).click();
        driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("Automation-Job");
        driver.findElement(By.xpath("//input[@id='_company_website']")).sendKeys("www.jobsport.com");
        driver.findElement(By.xpath("//input[@id='_company_twitter']")).sendKeys("@jobsport");
        driver.findElement(By.xpath("//input[@id='_job_expires']")).sendKeys("22 July 2022");
        driver.findElement(By.xpath("//input[@id='_job_location']")).sendKeys("California");
        driver.findElement(By.xpath("//input[@id='_company_name']")).sendKeys("JobsPort");
        driver.findElement(By.xpath("//input[@id='_company_tagline']")).sendKeys("Top Jobs");
        driver.findElement(By.xpath("//button[contains(text(),'Publish…')]")).click();
        driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/a[1]")).click();
        String ele = driver.findElement(By.xpath("//h1[contains(text(),'Automation-Job')]")).getText();
        System.out.println("The Text is :-" + ele);
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
