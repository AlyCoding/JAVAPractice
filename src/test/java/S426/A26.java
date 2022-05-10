package S426;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A26 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10 );

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        if(checkbox2.isSelected()){

            System.out.println("yay");

        } else {
            System.out.println("o-oh");
        }

    WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        checkbox1.click();

        if(checkbox1.isSelected()){

            System.out.println("yay");

        } else {
            System.out.println("o-oh");
        }


    }
}
