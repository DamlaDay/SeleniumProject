package class08;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class QaManager {
    public static void main(String[] args) throws IOException {


        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//        go to hrms

        driver.get(ConfigReader.read("url"));
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        List<WebElement> jobTitle=driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        for (int i = 0; i < jobTitle.size() ; i++) {
            String titleList = jobTitle.get(i).getText();
           if(titleList.contains("QA manager")){
               System.out.println(i+1);
               WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
               checkbox.click();
           }

        }


    }
}
