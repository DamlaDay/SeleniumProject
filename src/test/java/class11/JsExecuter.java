package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        to draw a boundary around the WebElement
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

//        using java script executor
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: pink; border: 2px solid red;');",hoverBtn);

        //Scroll Down
        js.executeScript("window.scrollBy(0,1000)");

        //js executer to perform clig operatin==>google it
       //Scroll Up
    js.executeScript("window.scrollBy(0,-1000)");

        //js executer to perform click operation==>google it
//        get the click button
        WebElement clickBtn = driver.findElement(By.xpath("//a[text()='File Upload']"));
        js.executeScript("arguments[0]. click();",clickBtn);
    }
}
