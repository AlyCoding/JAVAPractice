package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTasks {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println( driver.getTitle().equals("Google"));

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("The title test pass");
        } else {
            System.out.println("Test again");
        }

        driver.navigate().to("https://www.technovaschool.com/");
        System.out.println(driver.getCurrentUrl().contains("technovaschool"));

        String actualUrl = driver.getCurrentUrl();
        String expected = "technovaschool";

        if(actualUrl.contains(expected)){
            System.out.println("The second test pass");
        } else {
            System.out.println("Test again");
        }

        String actualTitleS = driver.getTitle();
        String expectedTitleS = "IT School | Tech Nova School";

        if(actualTitleS.equals(expectedTitleS)){
            System.out.println("yay");
        }

       // System.out.println( driver.getTitle().equals("")
    }
}
