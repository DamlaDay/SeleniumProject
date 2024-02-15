package SeleniumHomework;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Facebook {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNew=  driver.findElement(By.linkText("Create new account"));
String getT=createNew.getText();
        System.out.println(getT);
        createNew.click();

        Alert alert = driver.switchTo().alert();
     WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
      firstName.sendKeys("Tuesday");

      WebElement day=driver.findElement(By.name("birthday_month"));
        Select sel=new Select(day);
        sel.selectByVisibleText("October");



    }
}
