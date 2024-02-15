package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/Xpath.php");// Go to Syntax Projects.com

        WebElement userName =driver.findElement(By.xpath("//input[@id='title']"));     //Finding the input box  username
        userName.sendKeys("amaninaman");

        //Finding the button to use it with a text: text()
        WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

//Finding the Security Question by contains()
//contains() : It is used when the value of any attribute changes dynamically,The contain
// feature has an ability to find the element with partial text
WebElement q1= driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
q1.sendKeys("What is your name?");

//Finding the Text and Print on Console
        WebElement textMsg = driver.findElement(By.xpath("//label[contains(text(),' Lorem ipsum')]"));
        String text = textMsg.getText();
        System.out.println(text);


        //Finding the element Settings by ‘starts-with() :
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("123.145.567");

//Send the email 2
      WebElement email2=  driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
      email2.sendKeys("abc@gmail.com");

      //Send the field 2
     WebElement field2= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
field2.sendKeys("avbdgjs");






    }
}
