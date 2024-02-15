package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");
//Send Keys after clearing the text box
        WebElement textBox= driver.findElement(By.xpath("//input[@id='textInput']"));
       // clear the text from the element
textBox.clear();
//Send Keys
textBox.sendKeys("Welcome");


//check if the Option 1 is selected,if no than select it
//        check if the option 1 is selected
//        if no then select it
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
//        check if the radio button is selected
        boolean stateofOp1 = option1.isSelected();
        if(!stateofOp1){
            option1.click();
        }

//to print out the state of the option 1
        System.out.println("the state of radiobutton1 is  "+option1.isSelected());
//check if the option 2 is enabled or not

        //input[@value='option2']
        WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
        Boolean enableStateOp2=option2.isEnabled();
        if(enableStateOp2){
            System.out.println("Option is enable and can be selected");
        }
        else{
            System.out.println("The number 2 is not enabled and ton clickable ");
        }


        //Check if the Option 3 is displayed or not or Print the status on the console

        WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
        Boolean isDisplayedOp3=option3.isDisplayed();
        if(isDisplayedOp3){
            System.out.println("The Radio button option 3 is displayed");
        }else {
            System.out.println("The Radio button option 3 is NOT displayed");
        }

   //Get Text

        WebElement getMsg = driver.findElement(By.xpath("//div[@id='textElement']"));
       String  text= getMsg.getText();
        System.out.println(text);


        //get the Attribute value and print on the screen
        WebElement attribute = driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));
 String value=attribute.getAttribute("id");
        System.out.println("*****************"+value);


//homework
        //input[@id='favourite-book']/following-sibling::input[1]

WebElement followingS1=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
followingS1.sendKeys("second");





///2nde homework-preceding sibling
        //input[@id='least-favorite']/preceding-sibling::input[2]
        //input[@id='least-favorite']/preceding-sibling::input[1]
        //input[@id='least-favorite']



        ///parent=child

        //div[@id='familyTree'] parent
        //div[@id='familyTree']//child::input[1] child
        //div[@id='familyTree']//child::input[2] child

    }
}
