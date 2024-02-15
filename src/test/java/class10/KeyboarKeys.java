package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboarKeys {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/keypress.php");
        //Once you hit the "enter" instead of click on the button
WebElement inputBox =driver.findElement(By.xpath("//input[@class='form-control']"));
inputBox.sendKeys(Keys.ENTER);

    }
}
