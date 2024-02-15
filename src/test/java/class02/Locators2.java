package class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
//
        driver.manage().window().maximize();

//        goto fb.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        enter the userName
        WebElement name = driver.findElement(By.name("ctl00$MainContent$username"));
        name.sendKeys("Tester");

//        enter the password
        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");

//        login button click
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

// confirm that you have logged in to the website

        WebElement message=driver.findElement(By.className("login_info"));
        String text =message.getText();
        System.out.println(text);

        //Confirming by Using Title
String title=driver.getTitle();
        System.out.println(title);
if(title.equals("Web Orders")){
    System.out.println("You have logged in");
}else{
    System.out.println("You have NOT logged in");
}
    }
}
