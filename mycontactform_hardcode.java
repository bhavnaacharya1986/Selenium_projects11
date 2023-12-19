package mywork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class mycontactform_hardcode {


    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.get("https://mycontactform.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Pricing")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Sample Forms")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
        driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("subject")).sendKeys("Testing Course Survey");
        Thread.sleep(1000);

        driver.findElement(By.name("email")).sendKeys("bhavna@mycontactform.com");
        Thread.sleep(1000);

        driver.findElement(By.id("q1")).sendKeys("Survey to be filled");
        Thread.sleep(1000);

        driver.findElement(By.id("q2")).sendKeys("Positive or negative survey");
        Thread.sleep(1000);

        WebElement dropdownbox = driver.findElement(By.name("q3"));
        Select d = new Select(dropdownbox);
        d.selectByVisibleText("Fourth Option");

        driver.findElement(By.xpath("//input[@name='q4'][@value='Second Option']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='q5'][@value='Yes']")).click();
        Thread.sleep(1000);

        TakesScreenshot ss1 = (TakesScreenshot) driver;
        File scr1 = ss1.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr1, new File("/Users/bhavnaacharya/IdeaProjects/Selenium_projects/src/test/resources/Screenshots/scrnshot1"));

        driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='Second Check Box']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='Fourth Check Box']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='checkbox6[]'][@value='Fifth Check Box']")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("q7")).sendKeys("15-09-90");
        driver.findElement(By.name("q7")).sendKeys(Keys.ESCAPE);
        Thread.sleep(1000);

        WebElement statesdropdown = driver.findElement(By.name("q8"));
        Select s = new Select(statesdropdown);
        s.selectByValue("AS");
        Thread.sleep(1000);

        WebElement countrydropdown = driver.findElement(By.name("q9"));
        Select c = new Select(countrydropdown);
        c.selectByValue("India");
        Thread.sleep(1000);

        WebElement provincedropdown = driver.findElement(By.name("q10"));
        Select p = new Select(provincedropdown);
        p.selectByValue("Ontario");
        Thread.sleep(1000);

        WebElement titledropdown = driver.findElement(By.name("q11_title"));
        Select t = new Select(titledropdown);
        t.selectByValue("Miss");
        Thread.sleep(500);
        driver.findElement(By.name("q11_first")).sendKeys("Testing");
        driver.findElement(By.name("q11_last")).sendKeys("Team");
        Thread.sleep(1000);

        WebElement monthdropdown = driver.findElement(By.name("q12_month"));
        Select m = new Select(monthdropdown);
        m.selectByValue("9");
        Thread.sleep(500);
        WebElement daydropdown = driver.findElement(By.name("q12_day"));
        Select d1 = new Select(daydropdown);
        d1.selectByValue("12");
        Thread.sleep(500);
        WebElement yeardropdown = driver.findElement(By.name("q12_year"));
        Select y = new Select(yeardropdown);
        y.selectByValue("1986");
        Thread.sleep(1000);

        driver.findElement(By.id("attach4589")).sendKeys("/Users/bhavnaacharya/Desktop/Testing course/automation/Selenium/05th Nov 2023");
        Thread.sleep(1000);

        driver.findElement(By.name("visver_code"));
        Thread.sleep(10000);

        TakesScreenshot ss2 = (TakesScreenshot) driver;
        File scr2 = ss2.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr2, new File("/Users/bhavnaacharya/IdeaProjects/Selenium_projects/src/test/resources/Screenshots/scrnshot2"));

        driver.findElement(By.name("submit")).click();

        TakesScreenshot ss3 = (TakesScreenshot) driver;
        File scr3 = ss3.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scr3, new File("/Users/bhavnaacharya/IdeaProjects/Selenium_projects/src/test/resources/Screenshots/scrnshot3"));

    }
}