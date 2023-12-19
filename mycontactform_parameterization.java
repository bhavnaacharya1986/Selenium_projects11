package mywork;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

public class mycontactform_parameterization {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.manage().deleteAllCookies();

        Thread.sleep(1000);
        Driver.get("https://mycontactform.com/");
        Thread.sleep(2000);

        Driver.findElement(By.linkText("Pricing")).click();
        Thread.sleep(2000);

        Driver.findElement(By.linkText("Sample Forms")).click();
        Thread.sleep(1000);

        FileInputStream fis_1;
        FileOutputStream fos_1;
        XSSFWorkbook wb1;
        String filepath = "Users/bhavnaacharya/IdeaProjects/Selenium_projects/src/test/resources/Test Data/InputTestDatasheet";

        //below is the method to import data from Excel:
        fis_1 = new FileInputStream(filepath);
        wb1 = new XSSFWorkbook(fis_1);
        XSSFSheet sheet1 = wb1.getSheetAt(0);

        String url = sheet1.getRow(1).getCell(20).getStringCellValue();
        System.out.println(url.trim());

        String sendto = sheet1.getRow(1).getCell(0).getStringCellValue();

        String subject = sheet1.getRow(1).getCell(1).getStringCellValue();
        String email = sheet1.getRow(1).getCell(2).getStringCellValue();
        String txtboxfield = sheet1.getRow(1).getCell(3).getStringCellValue();
        String txtboxmultiline = sheet1.getRow(1).getCell(4).getStringCellValue();
        String dropdownopt = sheet1.getRow(1).getCell(5).getStringCellValue();
        String radiobtn = sheet1.getRow(1).getCell(6).getStringCellValue();
        String checkboxsingle = sheet1.getRow(1).getCell(7).getStringCellValue();
        String checkboxmultiple = sheet1.getRow(1).getCell(8).getStringCellValue();
        String DateSelect = sheet1.getRow(1).getCell(9).getStringCellValue();
        String usstates = sheet1.getRow(1).getCell(10).getStringCellValue();
        String country  = sheet1.getRow(1).getCell(11).getStringCellValue();
        String province = sheet1.getRow(1).getCell(12).getStringCellValue();
        String title = sheet1.getRow(1).getCell(13).getStringCellValue();
        String firstname = sheet1.getRow(1).getCell(14).getStringCellValue();
        String lastname = sheet1.getRow(1).getCell(15).getStringCellValue();
        String dobmonth = sheet1.getRow(1).getCell(16).getStringCellValue();
        String dobday = sheet1.getRow(1).getCell(17).getStringCellValue();
        String dobyear = sheet1.getRow(1).getCell(18).getStringCellValue();
        String attachfile = sheet1.getRow(1).getCell(19).getStringCellValue();

        String senttoarray[] = sendto.split(","); // 1,2,0
        for (int i = 0; i < senttoarray.length; i++) {

            Thread.sleep(2000);
            if (senttoarray[i].trim().equalsIgnoreCase("Marketing Department")) {
                Driver.findElement(By.xpath("//input[@name='email_to[]'][@value='0']")).click();
            } else if (senttoarray[i].trim().equalsIgnoreCase("Sales")) {
                Driver.findElement(By.xpath("//input[@name='email_to[]'][@value='1']")).click();
            } else if (senttoarray[i].trim().equalsIgnoreCase("Customer Service")) {
                Driver.findElement(By.xpath("//input[@name='email_to[]'][@value='2']")).click();
            } else {
                System.out.println("Invalid Send To option");

                Driver.findElement(By.id("subject")).sendKeys(subject.trim());
                Driver.findElement(By.name("email")).sendKeys(email.trim());
            }
        }

    }
}
