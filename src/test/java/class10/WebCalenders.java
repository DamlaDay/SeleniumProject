package class10;

import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class WebCalenders {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

//        click on the box for calander to appear
        WebElement calander = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calander.click();

//        select from calander
        boolean notFound = true;
        while (notFound) {
//            get the current month
            String currentMonth = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            if (currentMonth.equals("August 2024")) {
                notFound = false;
//you can have the logic the click on date here as well instead of Line 42
            }
            if (notFound) {
//            click on next button
                WebElement next = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
                next.click();
            }
        }

        //select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));

//        iterate
        for (WebElement date : allDates) {
            if (date.getText().equals("31")&& date.getAttribute("class").equals("day")) {
                date.click();
                break;
            }


        }
    }}
