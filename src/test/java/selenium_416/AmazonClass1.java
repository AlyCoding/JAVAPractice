package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClass1 {
    public static void main(String[] args) {

       // 1. Open a chrome browser
        //2. Go to amazon.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        String searchTerm = "java book";
/*

        //3. Enter any search term
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
        //4. Click on search button
        driver.findElement(By.type("Submit")).click();
        //5. Verify title of the page
*/
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(searchTerm);

       // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();

        String actualValue = driver.getTitle();
        String expectedValue = searchTerm;
        if(actualValue.contains(expectedValue)){
            System.out.println("Let's read");
        } else {
            System.out.println("Again");
        }
    }
}
