package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class keyboard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.get("https://www.amazon.co.uk/");
        Thread.sleep(1000);

        driver.findElement(By.name("searchDropdownBox")).click();

        WebElement selectop3 = driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
        Select s = new Select(selectop3);
        s.selectByValue("search-alias=kitchen");



        //driver.findElement(By.className("tHlp8d")).click();

//        driver.findElement(By.id("L2AGLb")).click();
//        Thread.sleep(2000);
//        WebElement search = driver.findElement(By.name("q"));
//        Actions act = new Actions(driver);
//
//        act.keyDown(search, Keys.SHIFT).sendKeys("ith automation").keyUp(search, Keys.SHIFT).build().perform();
//
//        Thread.sleep(5000);
//        act.keyDown(search, Keys.CONTROL).
//                sendKeys("a").keyUp(search, Keys.CONTROL).build().perform();
//        Thread.sleep(5000);
//        search.sendKeys(Keys.ENTER);
    }

}
