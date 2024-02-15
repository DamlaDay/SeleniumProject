package SeleniumHomework;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;

public class practice {
    public static void main(String[] args) throws IOException {


WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
String url=ConfigReader.read("url");
String userName=ConfigReader.read("userName");
String password=ConfigReader.read("password");

driver.get(url);
        WebElement name=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        name.sendKeys(userName);
        pass.sendKeys(password);
        enterBtn.click();

   WebElement pim= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
   pim.click();
   WebElement add= driver.findElement(By.xpath("//input[@value='Add']"));


    }
}
