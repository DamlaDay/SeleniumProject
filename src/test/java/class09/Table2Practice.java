package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Table2Practice {
    public static void main(String[] args) throws IOException {


        openBrowserAndLaunchApplication();
        WebElement pim=driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();
int count=0;
        List<WebElement> allId=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for(WebElement id:allId){
            if(id.getText().equals("96254A")){
                String xpath = "//table/tbody/tr[" + (count + 1) + "]/td[1]";
                WebElement checkBox = driver.findElement(By.xpath(xpath));
                checkBox.click();

            }
        }


    }
}
