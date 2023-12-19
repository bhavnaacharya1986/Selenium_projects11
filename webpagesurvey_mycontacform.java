package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webpagesurvey_mycontacform {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.get("https://mycontactform.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Sample Forms")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Web Page Survey")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("subject")).sendKeys("Best Website for testing");
        Thread.sleep(1000);

        driver.findElement(By.id("email")).sendKeys("reviews@mycontact.com");
        Thread.sleep(1000);

        WebElement dropdown1 = driver.findElement(By.name("q[1]"));
        Select d1 = new Select(dropdown1);
        d1.selectByVisibleText("Print Media");
        Thread.sleep(1000);

        WebElement dropdown2 = driver.findElement(By.id("q[2]"));
        Select d2 = new Select(dropdown2);
        d2.selectByVisibleText("Couple Times a Week");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='q[3]'][@value='Amazing']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='q[10]'][@value='Above Average']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='q[11]'][@value='Average']")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("q[6]")).sendKeys("User-friendly");
        Thread.sleep(1000);

        driver.findElement(By.name("q[7]")).sendKeys("Entering the verification code");
        Thread.sleep(1000);

        driver.findElement(By.name("q[8]")).sendKeys("Nothing");
        Thread.sleep(1000);

        driver.findElement(By.name("q[9]")).sendKeys("Nothing");
        Thread.sleep(1000);

        driver.findElement(By.name("visver_code")).sendKeys("35CF86");//ask Anna how to copy the verification code
        Thread.sleep(1000);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(1000);

        driver.close();

    }
}
