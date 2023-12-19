package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_locator {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");
        driver.findElement(By.id("sp-cc-customize")).click();
//        driver.findElement(By.className("a-button-input celwidget")).click();
//        driver.findElement(By.className("nav-a nav-a-2   nav-progressive-attribute"));
//        driver.findElement(By.className("nav_pop_new_cust nav-flyout-content nav-flyout-accessibility"));
//        driver.findElement(By.className("nav-a")).click();
//        driver.findElement(By.className("nav-a")).sendKeys(Keys.ENTER);



    }
}
