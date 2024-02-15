package class10;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Keyboard {
    public static void main(String[] args) throws IOException {


        openBrowserAndLaunchApplication();
        //Get username and password via Config Reader and declare in a variable
        String userN= ConfigReader.read("userName");
        String passWord= ConfigReader.read("password");
        //Send Keys to username and password TextBox
        WebElement user= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        user.sendKeys(userN);
        WebElement pass= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        pass.sendKeys(passWord);
        //Once you hit the "enter" instead of click on the button
        WebElement loginBtn= driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginBtn.sendKeys(Keys.ENTER);
    }
}
