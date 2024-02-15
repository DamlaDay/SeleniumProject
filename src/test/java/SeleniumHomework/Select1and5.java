package SeleniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Select1and5 {
    public static void main(String[] args) {

//click on enable checkboxes and select checkbox 1 and 5

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

WebElement checkBox=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
checkBox.click();

        List<WebElement> options=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for(WebElement opt:options){
            String b1=opt.getAttribute("value");
          if(b1.equals("Checkbox-1")||b1.equals("Checkbox-4")){
              opt.click();
          }

        }

/*
   for(WebElement option:options){
            String optionVal = option.getAttribute("value");
            if(optionVal.equals("Option-3")) {
                option.click();
                break;
 */


    }
}
