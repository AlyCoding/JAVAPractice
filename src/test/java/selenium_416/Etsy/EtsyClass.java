package selenium_416.Etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");
        //search for gift box

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("gift box" +Keys.ENTER);

    //verify title
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gift box | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test pass");
        } else {
            System.out.println("Try again");
        }


    }
}
