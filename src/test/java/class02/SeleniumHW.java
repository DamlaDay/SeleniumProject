package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(4000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Mimi");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Nunu");
        WebElement mobileEmail= driver.findElement(By.name("reg_email__"));
mobileEmail.sendKeys("miminunu@gmail.com");
WebElement newPassword= driver.findElement(By.id("password_step_input"));
newPassword.sendKeys("123456");
        Thread.sleep(5000);
driver.quit();


    }
}
