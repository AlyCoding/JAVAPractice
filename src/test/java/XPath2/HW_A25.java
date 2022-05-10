package XPath2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_A25 {
    public static void main(String[] args) {
      //  2. Go to https://the-internet.herokuapp.com/add_remove_elements/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
        addButton.click();
      //  4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
      if(deleteButton.isDisplayed()){
          System.out.println("D Button is here");
      } else {
          System.out.println("Check your code");
      }
        //  5. Click to “Delete” button.
        deleteButton.click();
    //    6. Verify “Delete” button is NOT displayed after clicking.
 /*       if(!deleteButton.isDisplayed()){
            System.out.println("D Button is gone");
        } else {
            System.out.println("Meh");
        }
*/
        try{
            WebElement deleteButtonAgain = driver.findElement(By.xpath("//button [.='Delete']"));
            if(deleteButtonAgain.isDisplayed()){
                System.out.println("111");
            } else {
                System.out.println("000");
            }
        } catch (StaleElementReferenceException a){
            System.out.println("000");


        }
      //  USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
}
