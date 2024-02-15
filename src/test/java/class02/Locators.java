package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        //find the Element input email and send ur email address to it
        WebElement email=driver.findElement(By.id("email"));
        //Sending the data do WebElement
email.sendKeys("dont@gmail.com");

//find the element password and send the password
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("123456");

        //Find the Element Button Login
        WebElement login=driver.findElement(By.name("login"));
        //login.click();

//Go to button create new account and click on it
  /*      WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        */

        WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
        createAccount.click();
    }
}
