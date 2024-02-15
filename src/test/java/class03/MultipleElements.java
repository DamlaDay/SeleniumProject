package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Got to ebay.com
        driver.get("https://www.ebay.com");

//Get All Links from ebay.com and print on the screen
       List<WebElement>allLinks= driver.findElements(By.tagName("a"));
for( WebElement link:allLinks){
String text=link.getText();
    System.out.println(text);
    //Extract the Link Form of the Web Element
   String linkAddress= link.getAttribute("href");
    System.out.println(linkAddress);

}




    }
}
