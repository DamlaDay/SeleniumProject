package review;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.com/");

        WebElement goingTo = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
        goingTo.click();
        WebElement destination = driver.findElement(By.xpath("//input[@type='text']"));
        destination.sendKeys("Istanbul");
        destination.sendKeys(Keys.ENTER);
//click add car
        driver.findElement(By.name("add-car-switch")).click();
//choose date
        WebElement date = driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']"));
        date.click();

//        select from calander
        boolean notFound = true;
        while (notFound) {
//            get the current month
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if (currentMonth.equals("August 2024")) {
                notFound = false;


            }
        }
    }}