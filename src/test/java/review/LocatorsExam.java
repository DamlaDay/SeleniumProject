package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExam {
    public static void main(String[] args) throws InterruptedException {


        //initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

// go to google.com
        driver.get("https://facebook.com");

        WebElement createNewAccount= driver.findElement(By.linkText("Create new account"));
createNewAccount.click();

Thread.sleep(2000);

driver.findElement(By.name("firstname")).sendKeys("john");


    }
}
