package S426;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class A27 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        driver.manage().window().maximize();
      //  driver.get("https://www.google.com/");
        
  /*      List<WebElement> list = driver.findElements(By.xpath("//body//a"));

        int expectedValue = 19;
        int actualValue = list.size();
        System.out.println(actualValue);

        if(expectedValue == actualValue){
            System.out.println("woohoo");
        } else{
            System.out.println("come on");
        }

        int counter = 0;
        for(WebElement element : list){
            if(element.getText().isEmpty()){
                counter++;
                continue;
            }
            System.out.println(element.getText());
        }
        System.out.println(counter);*/

     //   ask #1 - Check all link on the page
       // Open Chrome browser
        //Go to https://www.technovaschool.com/
        //Count the number of the links on the web-page (expected 41)
        //Print out all the texts of the links on the page
        //Count the number of the links that doesn’t have text (expected 19)

       /* ask #1 - Check all link on the page
        Open Chrome browser
        Go to https://www.technovaschool.com/
        Count the number of the links on the web-page (expected 41)
        Print out all the texts of the links on the page
        Count the number of the links that doesn’t have text (expected 19)*/

    driver.get("https://www.technovaschool.com/");

        List<WebElement> list = driver.findElements(By.xpath("//body//a"));

        int expectedValue = 41;
        int actualValue = list.size();
        System.out.println(actualValue);

/*        if(expectedValue == actualValue){
            System.out.println("woohoo");
        } else{
            System.out.println("come on");
        }*/

        int counter = 0;
        for(WebElement element : list){
            if(element.getText().isEmpty()){
                counter++;
                continue;
            }
            System.out.println(element.getText());
        }
        System.out.println(counter);

    }
}
