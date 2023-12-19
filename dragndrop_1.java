package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop_1 {

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://demoqa.com/droppable/");
            driver.manage().window().maximize();
            Thread.sleep(300);

//            driver.findElement(By.id("droppableExample-tab-accept")).click();
//            Thread.sleep(500); check with Sir for two options
            WebElement dragElement = driver.findElement(By.id("draggable"));
            WebElement droppableelement = driver.findElement(By.id("droppable"));

            Actions act = new Actions(driver);
            Thread.sleep(100);
            act.moveToElement(dragElement).click();
            act.dragAndDrop(dragElement, droppableelement).build().perform();
            act.clickAndHold(dragElement).moveToElement(droppableelement).release().build().perform();
            act.moveToElement(droppableelement).release();
            Thread.sleep(500);
            driver.close();


    }
}
