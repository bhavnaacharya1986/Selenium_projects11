package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_locators {

    public static void main (String[] args) throws InterruptedException {
        WebDriver Driver = new ChromeDriver();  // here object is Driver

        // locators by.id
        Driver.get("https://www.google.co.uk/");
        Driver.manage().window().maximize();

        Thread.sleep(2000); /* to give the system sometime to run */
        // shift key need to used in macbook for inspect a specific button or text
        Driver.findElement(By.id("L2AGLb")).click(); // to accept google terms // each one of the sections are called element
        Thread.sleep(1000); /* to give the system sometime to run */
        Driver.findElement(By.id("APjFqb")).sendKeys("Selenium Advantages and Disadvantages"); //we need to search by different properties
        Thread.sleep(1000);
        Driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER); // to enter on Google Chrome
        Driver.navigate().back();
        Driver.findElement(By.id("APjFqb")).sendKeys("Java Advantages and Disadvantages");
        Thread.sleep(1000);
        Driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        Driver.findElement(By.className("fSXkBc")).click();
        Thread.sleep(2000);
        //Driver.findElement(By.id("_6bVKZbL_KdGFhbIP04eQoAw_1")).sendKeys(Keys.ENTER); // to enter on Google Chrome
        //Thread.sleep(2000);

        Driver.get("https://www.javatpoint.com/advantages-and-disadvantages-of-java");
        Driver.manage().window().maximize();
        Thread.sleep(1000);
        Driver.findElement(By.id("APjFqb")).sendKeys("Java Advantages and Disadvantages");
        Driver.findElement(By.id("APjFqb")).click();
        Thread.sleep(3000); /* to give the system sometime to run */
        Driver.findElement(By.className("gNO89b")).click();
        Driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER); // to enter on Google Chrome
        Thread.sleep(3000);
        Driver.navigate().back();
        System.out.println(Driver.getCurrentUrl());;
        System.out.println(Driver.getTitle());
        WebElement search = Driver.findElement(By.name("Advantages and disadvantages of Java"));




        // locators by .id - Driver.findElement(By.id("z9PoV")).click().sendKeys();
        // locators by.name - Driver.findElement(By.name("q")).sendKeys("Selenium Advantages");
        // locators by.className - Driver.findElement(By.className("QS5gdfg")).sendKeys("Selenium Advantages");
        // locators by.tagname - Driver.findElement(By.tagname("QS5gdfg")).sendKeys("Selenium Advantages");
        // locators by X-path -  Driver.findElement(By.xpath("//input[@class='LC20lb MBeuO DKV0Md'][@name='UWckNb']")).click()
                     // Xpath=//tagname[@attribute='value']
        //for back and forward navigation
                //        Thread.sleep(2000);
                //        Driver.navigate().back();
                //        Thread.sleep(2000);
                //        Driver.navigate().forward();
                //        Thread.sleep(2000);
                //        Driver.navigate().refresh();

    }
}
