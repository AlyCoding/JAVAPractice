package selenium_416;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {
    /*public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup(); //this is connection between driver and selenium
        //and sets up the driver


        WebDriver driver = new ChromeDriver(); //create instance of chrome driver
        driver.get("https://www.google.com/"); // it will navigate to web address
        driver.manage().window().maximize(); //opens window full size

        System.out.println(driver.getTitle()); //get takes a little longer because loads the page fully

        Thread.sleep(10000); //stops browser for***seconds


        driver.navigate().back(); //clicks back button
        Thread.sleep(10000);// waits and navigates forward
        driver.navigate().forward();//clicks forward button

        driver.navigate().to("https://www.youtube.com/"); //older method than "get()"
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        driver.close(); //closes instance of chrome

        //TAsk 1.
        //1.Open Chrome
        //2. go to google.com
        //3. Verify title is Google

        //Task 2
        //Open Chrome
        //go to technovaschool.vom
        //verify url contains technovaschool
        //verify title

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.youtube.com/");
        System.out.println(driver.getCurrentUrl());


    }*/
}
