package faker;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class FakerPractice {

    public static void main(String[] args) {

        Faker faker = new Faker();
/*        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.number().numberBetween(18, 90);
        String address = faker.address().fullAddress();

        System.out.println(firstName + " " + lastName);
        System.out.println(age);
        System.out.println(address);*/

        //https://demo.guru99.com/test/newtours/register.php

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
        lastName.sendKeys(faker.name().lastName());

        WebElement phone = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
        phone.sendKeys(faker.phoneNumber().phoneNumber());

        WebElement email = driver.findElement(By.xpath("//input[@name=\"userName\"]"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement address = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
        address.sendKeys(faker.address().streetAddress());

        WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
        city.sendKeys(faker.address().city());

        WebElement state = driver.findElement(By.xpath("//input[@name=\"state\"]"));
        state.sendKeys(faker.address().state());

        WebElement zipCode = driver.findElement(By.xpath("//input[@name=\"postalCode\"]"));
        zipCode.sendKeys(faker.address().zipCode());

        WebElement dropDown = driver.findElement(By.xpath("//select[@name=\"country\"]"));

        Select select = new Select(dropDown);
        select.selectByValue("UNITED STATES");

        WebElement login = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        login.sendKeys(faker.name().username());

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        String pass = faker.internet().password();
        password.sendKeys(pass);

        WebElement confirmPass = driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]"));
        confirmPass.sendKeys(pass);

       // WebElement submitButton = driver.findElement(By.xpath("//input[@name=\"submit\"]"));
       // submitButton.click();





    }
}
