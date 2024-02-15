package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //1-Find By Index
        //2-Find By Value
        //3-Find By Visible Text


        //Find the DropDown
       WebElement dd= driver.findElement(By.xpath("//select[@id='select-demo']"));
       //use Select class
        Select sel=new Select(dd);
        sel.selectByIndex(2);   //1-Find By Index  -index 2 for Monday
        sel.selectByValue("Tuesday"); // Select By Value
        sel.selectByVisibleText("Saturday");

//MULTISELECT

        WebElement dropDown=driver.findElement(By.xpath("//select[@id='multi-select']"));
        //Use Select class
        Select sel1=new Select(dropDown);
        //Weather The DropDown is multi select or not check isMultiple()
        System.out.println("The dropDown is multiple select  "+sel1.isMultiple());
        sel1.selectByValue("New York"); //Select By Value
        sel1.selectByVisibleText("Florida"); //Select By Text
        sel1.deselectByValue("New York");//DESELECT FROM THE SELECTED



    }
}
