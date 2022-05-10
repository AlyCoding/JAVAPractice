package XPath2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_A25 {
    public static void main(String[] args) {

       // Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to link https://ultimateqa.com/complicated-page
        driver.get("https://ultimateqa.com/complicated-page");
        //3. Enter any name in name field

        WebElement name = driver.findElement(By.xpath("//input[@id=\"et_pb_contact_name_0\"]"));
        name.sendKeys("Random Name");
       // 4. Enter any email in email field
        WebElement email = driver.findElement(By.xpath("//input[@id=\"et_pb_contact_email_0\"]"));
        email.sendKeys("random_email@gmail.com");

        //5. Add any description (you can use lorem to generate text)
        WebElement message = driver.findElement(By.xpath("//textarea[@class=\"et_pb_contact_message input\"] [1]"));
        message.sendKeys("Lorem ipsum ...");

        //6. Create a logic to pass captcha
        WebElement sumNum = driver.findElement(By.xpath("//input[@name=\"et_pb_contact_captcha_0\"]"));
        WebElement textCaptcha = driver.findElement(By.xpath("(//span[@class=\"et_pb_contact_captcha_question\"])[1]"));

        String numbers = textCaptcha.getText();
        System.out.println(numbers);
        int plusSign = numbers.indexOf("+");

        String numOne = numbers.substring(0, plusSign-1);
        String numTwo = numbers.substring(plusSign+2);

        int one = Integer.valueOf(numOne);
        int two = Integer.valueOf(numTwo);

        int totalAmount = one + two;
        System.out.println(totalAmount);
        sumNum.sendKeys(String.valueOf(totalAmount));


       // 7. Click submit
        WebElement submitButt = driver.findElement(By.xpath("(//button[@class=\"et_pb_contact_submit et_pb_button\"])[1]"));
        submitButt.click();

       // 8. Close the driver
    }
}
