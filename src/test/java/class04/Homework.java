package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/advanceXpath.php");// Go to Syntax Projects.com

//Following Sibling

        WebElement favBook1=driver.findElement(By.xpath("//input[@id='favourite-book']"));
        favBook1.sendKeys("first");
        WebElement favBook2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        favBook2.sendKeys("second");
        WebElement favBook3=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        favBook3.sendKeys("third");

///Preceding sibling

        WebElement preceding1=driver.findElement(By.xpath("//input[@id='least-favorite']"));
        preceding1.sendKeys("third");

        WebElement preceding2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        preceding2.sendKeys("second");
        WebElement preceding3=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        preceding3.sendKeys("first");

        ///parent-child

        WebElement gParent=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[1]"));
        gParent.sendKeys("Parent");

        WebElement child1=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[2]"));
       child1.sendKeys("Child 1");
        WebElement child2=driver.findElement(By.xpath("//div[@id='familyTree']//child::input[3]"));
        child2.sendKeys("Child 2");

driver.navigate().forward();
    }
}
