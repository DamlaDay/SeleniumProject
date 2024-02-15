package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();//instiatiating the instance of Chrome Driver

      driver.manage().window().maximize();//maximize the screen
        //driver.manage().window().fullscreen();//full screen the screen-(you can not see the tapBar

        driver.get("https://google.com");//go to url
//driver.getTitle();//get the Title of Website
        String title= driver.getTitle();//get the Title of Website
        System.out.println("Title of the page is "+title);// print the title
//driver.getCurrentUrl();//get the url of the page
        String url=driver.getCurrentUrl();
        System.out.println("The url is "+url);

        // slow down code
        Thread.sleep(2000);
        //Close the Window
        driver.quit();

    }
}
