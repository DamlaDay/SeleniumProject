package class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();


//SWITCH THE FOCUS OF THE DRIVER TO ALERT
        Alert alertHandler=driver.switchTo().alert();
        alertHandler.accept();

        //FIND THE ALERT 2 BUTTON

        WebElement alert2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        System.out.println(alertHandler.getText());
        alertHandler.dismiss();



    }
}
