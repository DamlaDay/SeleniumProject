package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWaits {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

    // ****NOTES***

     //   It'is a global wait.Once you declared you don't need to declare again
      //  It's goint to wait until the web element is found'
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        click on the first button and get the text out of it and display on console
        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();

        WebElement text1 = driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text1.getText());


        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

//Homework Sex
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();



//Homework Checkboxes
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();

    }
}
