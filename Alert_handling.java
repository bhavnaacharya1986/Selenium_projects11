package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);

        //'cancel' = dismiss and 'accept' = OK

        driver.findElement(By.name("cusid")).sendKeys("564783652");
        Thread.sleep(1000);

        driver.findElement(By.name("submit")).submit();
        Thread.sleep(1000);

        /* to accept */
        //driver.switchTo().alert().accept();


        /* to dismiss/cancel */
        driver.switchTo().alert().dismiss();

    }
}
