import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW1_5_3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBear.loginToSmartBear(driver);

        WebElement name = driver.findElement(By.xpath("//td[.=\"Susan McLaren\"]"));
        WebElement date = driver.findElement(By.xpath("//td[.=\"Susan McLaren\"]/../td[5]"));
////td[.="Susan McLaren"]/following-sibling::td[3]
        String dateSusan = "01/05/2010";

       /* if(dateSusan.equals(date)){
            System.out.println("woohoo");
        } else {
            System.out.println(date);
        }
*/
SmartBear.verifyOrder(driver, "Steve Johns");

       // Continuation for samartbear website
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //Part I. Method for verifying name exist on the table
        //Create a method named verifyOrder that takes WebDriver object and String name
        //This method should verify if given name exists in orders
         //       ----------
        //Part II. Method to print name and cities
        //Create a method named printNameAndCities that takes WebDriver object as parameter
        //This method should simply print all the names in the List of All orders
  SmartBear.printNameAndCities(driver);


    }
}
