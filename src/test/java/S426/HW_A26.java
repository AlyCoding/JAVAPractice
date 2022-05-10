package S426;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW_A26 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10 );

       // Go to https://www.rahulshettyacademy.com/AutomationPractice/
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/ ");
       // driver.manage().timeouts().implicitlyWait(10 );
      //  under ---Checkbox Example

      //  Select all 3 options (one by one)
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]"));
        checkbox2.click();
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]"));
        checkbox3.click();
     //   Verify all 3 option are selected
        WebElement [] checkboxes = {checkbox1, checkbox2, checkbox3};
        for( int i =0; i< checkboxes.length; i++ ){
            if(checkboxes[i].isSelected()){

                System.out.println("yay");

            } else {
                System.out.println("o-oh");
            }

        }

        //  Unselect second option
        checkbox2.click();
      //  Verify second option is not selected anymore
        if(!checkbox2.isSelected()){

            System.out.println("woohoo");

        } else {
            System.out.println("o-oh");
        }
    }
}
