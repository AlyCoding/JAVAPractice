package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailClass {
    public static void main(String[] args) {
/*  TASK 3
        1. Open a Chrome browser
        2. GO to https://google.com
        3. Click Gmail from top right
        4. Verify it contains Expected Gmail
        5. Go back to Google by using back() command
        6. Verify title contains "Google"
        7. Go back to Gmail using forward button
        8. Verify title contains Expected Gmail*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        driver.findElement(By.linkText("Gmail")).click();

        String actualResult = driver.getTitle();
        String expectedResult = "Gmail";

        if(actualResult.contains(expectedResult)){
            System.out.println("It is Gmail");
        } else {
            System.out.println("O-oh! Not Gmail");
        }
        driver.navigate().back();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("It is Google");
        } else {
            System.out.println("O-oh! Not Google");
        }

        driver.navigate().forward();

        if(actualResult.contains(expectedResult)){
            System.out.println("It is Gmail");
        } else {
            System.out.println("O-oh! Not Gmail");
        }
    }
}
