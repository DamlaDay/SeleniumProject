package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw2 {
    public static void main(String[] args) {

/*
https://syntaxprojects.com/synchronization-explicit-wait.php
click on button "click to display button"
and click on the displayed button

click on "click me to enable button"
click on the button below

click on click to check the checkbox
get the state of selected check box after its checked and print on console
 */
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//Click Me to Display
        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));
//Click Me to Enable
driver.findElement(By.xpath("//button[text()='Click me to Enable button!']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Button']"))).click();

driver.findElement(By.xpath("//button[text()='Button']")).click();

driver.findElement(By.xpath("//button[text()='Click me to checked the checkbox!']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));

driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();




    }
}
