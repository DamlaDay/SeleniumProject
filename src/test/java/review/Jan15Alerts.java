package review;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jan15Alerts {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
//        switch the focus to alert
        Alert alerrt = driver.switchTo().alert();
        alerrt.sendKeys("abracadbra");
        alerrt.accept();




    }
}
