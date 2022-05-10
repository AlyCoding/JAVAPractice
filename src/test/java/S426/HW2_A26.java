package S426;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2_A26 {
    public static void main(String[] args) {

     //   Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

       // 2. Go to https://demo.applitools.com/app.html
        driver.get("https://demo.applitools.com/app.html");

        //3. Get amount of total balance, credit available, due today
        WebElement totalB = driver.findElement(By.xpath("(//div[@class=\"balance-value\"]/span )[1]"));

        //System.out.println(numBalance);
// //(//div[@class="balance hidden-mobile"]/div[@class="balance-value"]/span)[1]

        WebElement creditA = driver.findElement(By.xpath("(//div[@class=\"balance-value\"] )[2]"));

       // System.out.println(numCredit);
        // //div[@class="balance"]/div[@class="balance-value"]

        WebElement dueT = driver.findElement(By.xpath("//div[@class=\"balance-value danger\"] "));

       // System.out.println(numDue);

/*        WebElement totalBalance = driver.findElement(By.xpath("(//div[@class=\"balance-value\"]/span)[1]"));
        WebElement creditAvailabile = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value\"]"));
        WebElement dangerValue = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value danger\"]"));*/
        //4. Add (sum_ all three amount
        String numBalance = totalB.getText().replace("$","");
        int numB = Integer.parseInt(numBalance);
        String numCredit = creditA.getText().replace("$","");
        int numC = Integer.parseInt(numCredit);
        String numDue = dueT.getText().replace("$","");
        int numD = Integer.parseInt(numDue);
        int total = numB+numC+numD;
        System.out.println(total);
        //5. Print out the result

        //6.close the driver
     //   driver.close();
    }
}
