package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class multiplewindow_handling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        Thread.sleep(300);

        driver.findElement(By.xpath("//a[contains(@href,'articles_popup.php')]")).click();
        Thread.sleep(1000);

        String parentWindow = driver.getWindowHandle(); // this is for the only Parent window
        System.out.println(parentWindow);

        Set<String> s2 = driver.getWindowHandles(); // this is for all sub windows meaning parent and child windows

        for (String j : s2) {
            System.out.println("Window unique id is: " + j);

            if (!parentWindow.equals(j)) {
                System.out.println(j);
                driver.switchTo().window(j);
                driver.findElement(By.name("emailid")).sendKeys("test2024@gmail.com");
                Thread.sleep(2000);
                driver.findElement(By.name("btnLogin")).submit();
                Thread.sleep(2000); // this is called hard wait
                driver.close(); // driver.quit();
            }

        }

        driver.switchTo().window(parentWindow);
        driver.close(); //to exit the page
    }
}

