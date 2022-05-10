package XPath2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class AddressBook {
    public static void main(String[] args) {


    /*Open a Chrome browser
    Go to http://a.testaddressbook.com/sign_in
    Enter email using random of element of array adding @gmail.com at the end
    Enter a dummy password
    Click on sign in button
    Verify message dispalyed “Bad email or password.”*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      /*  driver.get("http://a.testaddressbook.com/sign_in");
        String [] email = {"tony", "max", "andrew", "kamol"};
        String emailEnd = "@gmail.com";
        Random random = new Random();
        int randomNum = random.nextInt(email.length-1);

        WebElement login  = driver.findElement(By.xpath("//input[@id='session_email']"));
        WebElement pass = driver.findElement(By.xpath(" //input[@id=\"session_password\"]"));
        WebElement signIn = driver.findElement(By.xpath(" //input[@data-test=\"submit\"]"));

                login.sendKeys(email[randomNum] + emailEnd);
        pass.sendKeys("12345");
        signIn.click();

        WebElement message = driver.findElement(By.xpath("//div[@data-test=\"notice\"]"));

        if(message.isDisplayed()){
            System.out.println("Yay");
        } else {
            System.out.println("again");
        }*/

        //enter any login
        //enter any pass
        // verify total is equal (use getText())

        driver.get(" https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");


     /*   String [] email = {"tony", "max", "andrew", "kamol"};
        String emailEnd = "@gmail.com";
        Random random = new Random();
        int randomNum = random.nextInt(email.length-1);*/

        WebElement login  = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement pass = driver.findElement(By.xpath(" //input[@name=\"password\"]"));
        WebElement signIn = driver.findElement(By.xpath(" //input[@type=\"submit\"]"));

        login.sendKeys("test@gmail.com");
        pass.sendKeys("12345");
        signIn.click();

        WebElement message = driver.findElement(By.xpath("//p[@class=\"title\"]"));

        if(message.isDisplayed()){
            System.out.println("yeehaaw" );
        } else {
            System.out.println("ehem");
        }

    }
}
