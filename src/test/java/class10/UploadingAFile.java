package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingAFile {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/upload-image.php");

  //1.You find the element which is responsible for opening upthis window in your code e.g e is the element
 //2.e.sendkeys("oath to ur file")


        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='image-file']"));
//        please place your own file path in here
        uploadFile.sendKeys("C:\\Users\\damla\\OneDrive\\Desktop\\Selenium.png");

        //for line 22==>right click on desk top,choose properties copy i and add file name and extantion \\Selenium.png
    }
}
