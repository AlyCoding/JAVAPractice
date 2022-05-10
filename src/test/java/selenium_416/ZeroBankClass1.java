package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankClass1 {
    public static void main(String[] args) {
//Zero Bank Header Verification
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
       String actualAttribute =  driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
      String expectedAttribute = "forgot-password";

      if(actualAttribute.contains(expectedAttribute)){
          System.out.println("Woohoo!");
      } else{
          System.out.println("Eeh!");
      }


     /*  String actualElement = driver.findElement(By.name("Forgotten Password"));

        String expectedElement = "Forgotten password";
        if()*/
//1. Open Chrome browser
//2. Go to http://zero.webappsecurity.com/login.html
//3. Get attribute value of href from the "Forgot your password" link



        WebElement linkElement = driver.findElement(By.partialLinkText("Forgot"));

        String actualAttributeValue = linkElement.getAttribute("href");
        String expectedAttributeValue = "forgot-password";
            // 4.  Check if "Forgotten Password" is present in the page

//5. Verify attribute value contains Expected --> "forgot-password"

        linkElement.click();
         /*           driver.findElement(By.partialLinkText("Forgot")).click();

            boolean header = driver.findElement(By.tagName("h3")).isDisplayed();

            if(header){
                System.out.println(" YAY!!");
            } else {
                System.out.println("nah");
            }*/
    }
}
