package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hw {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

        //Homework Gender

       driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@value='Male']")).click();

        //Option 1 check box
driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
driver.findElement(By.xpath("//input[@value='Option-1']")).click();


    }
}
