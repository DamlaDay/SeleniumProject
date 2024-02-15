package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {
    public static void main(String[] args) throws InterruptedException {

//initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

// go to google.com
driver.get("https://google.com");

//another way to go to facebook.com
        driver.navigate().to("https://www.fb.com");

        //Navigate back to google website
driver.navigate().back();

//let it wait 2 seconds
Thread.sleep(2000);

//go back fb.com
driver.navigate().forward();

// Refresh
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.close();

        /*
        Notes:
        .get command and driver.Navigate.to(url)
         navigates to a particular url
         */



    }
}
