package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableButton {
    public static void main(String[] args) {
/*
click on enable button and
check if the male radio button is enabled
if yes click on it
 */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement checkButton= driver.findElement(By.xpath("//button[@id='enabledradio']"));
       checkButton.click();
       WebElement en=driver.findElement(By.xpath("//input[@value='gender-male' and @name='gender-identity']"));
        if(en.isEnabled()){
            en.click();
        }else{
            System.out.println("It's not enable");
        }


    }
}
