package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedMethodPractice {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.tagName("h3")).isDisplayed();

        boolean header = driver.findElement(By.tagName("h3")).isDisplayed();

        if(header){
            System.out.println("Yay!!");
        } else {
            System.out.println("C'mon!");
        }


    }
}
