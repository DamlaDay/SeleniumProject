package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Facebook {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

       WebElement create= driver.findElement(By.xpath("//a[text()='Create new account']"));
        String textOfCreateButton=create.getText();
        System.out.println(textOfCreateButton);
        System.out.println(driver.getCurrentUrl());
        create.click();


        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        for(WebElement link:allLinks){
String nameOfTheLinks=link.getText();
            System.out.println(nameOfTheLinks);
          String linkUrl= link.getAttribute("href");
            System.out.println(linkUrl);
        }

    }
}
