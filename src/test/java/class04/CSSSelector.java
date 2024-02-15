package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/cssSelector.php");// Go to Syntax Projects.com




        //Find the UserName text box
      WebElement input =  driver.findElement(By.cssSelector("input[id='profileID']"));
      input.sendKeys("hello");

//                                                             # is the shortcut of ['id==']
        //Find the Profile Box
        WebElement input1 =  driver.findElement(By.cssSelector("input#profileBox"));
        input1.sendKeys("amaninaman");



//
//                                 . is the shortcut of classname      replace the space with the .(dot)
//        feedback                                                      input.form-control.feedbackBox1
        WebElement feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("the website is too slow");


//input[name*='contentInput']

      //* shortcut of contains (contains-*)
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");

//IntrotoDvancecss  (Starts with)
       WebElement intro= driver.findElement(By.cssSelector("input[name^='IntroInput556']"));
        intro.sendKeys("Easy");

// (Ends With
         WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("Welldone");
    }
}
