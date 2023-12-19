package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class synconization {

        public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/clientdelay");
        driver.manage().window().maximize();

        /* implicit wait */
//                driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
//                String dataStatus = driver.findElement(By.cssSelector("p.bg-success")).getText();
//                System.out.println("Client side status is: " + dataStatus);
//                Thread.sleep(1000);
//                driver.close();


                /* explicit wait */

                driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.btn.btn-primary")));
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.bg-success")));
                String dataStatus = driver.findElement(By.cssSelector("p.bg-success")).getText();
                System.out.println("Client side status is: " + dataStatus);
                Thread.sleep(1000);
                driver.close();
    }
}
