package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Jan15DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

//        goto syntax projects.com
        driver.get("https://www.facebook.com/");
       // get the create new account
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);



//        find the drop down
        WebElement DD = driver.findElement(By.xpath("//select[@id='day']"));
        Select sel= new Select(DD);
        sel.selectByVisibleText("15");
        System.out.println(sel.isMultiple());

        WebElement MM=driver.findElement(By.name("birthday_month"));
        Select selM=new Select(MM);
        selM.selectByVisibleText("Oct");
  WebElement bYear= driver.findElement(By.name("birthday_year"));
  Select month=new Select(bYear);
  month.selectByVisibleText("1983");

        List<WebElement> gender=driver.findElements(By.linkText("Gender"));


    }
}
