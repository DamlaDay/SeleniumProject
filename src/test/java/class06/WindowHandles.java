package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to gmail
        driver.get("https://gmail.com");
//click on the button help and privacy
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of the  main page  and save it to a variable
      String mainPageHandle=  driver.getWindowHandle();
        System.out.println(mainPageHandle);

//        switch the focus of the driver to the window privacy
//        get all the handles
        Set<String> allHandles = driver.getWindowHandles();
//        iterate
        for(String handle:allHandles){
//            switch to the handle
            driver.switchTo().window(handle);
//            check if this is the desired window
            if(driver.getTitle().equals("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }

//        confirming that we are on privacy
        System.out.println(driver.getCurrentUrl());

//Switch the focus to the main page
        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getCurrentUrl());

driver.close();


    }
}
