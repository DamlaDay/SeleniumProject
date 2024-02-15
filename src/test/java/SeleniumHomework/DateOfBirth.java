package SeleniumHomework;

import Utils.CommonMethods;
import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static Utils.CommonMethods.*;

public class DateOfBirth {
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
        WebElement loginBtn= driver.findElement(By.xpath("//input[@value='LOGIN']"));
        loginBtn.click();
        WebElement leaveBtn= driver.findElement(By.xpath("//b[text()='Leave']"));
        leaveBtn.click();

        WebElement openCalender=driver.findElement(By.xpath("//input[@id='calFromDate']"));
        openCalender.click();
WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
selectFromDropDown("1983",year);

     WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
selectFromDropDown(month,"Oct");

        List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement d:days){
            if(d.getText().equals("15")){
                d.click();
            }
        }
    }
}
