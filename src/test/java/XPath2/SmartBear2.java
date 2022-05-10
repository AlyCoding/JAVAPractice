package XPath2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBear2 {

    WebDriver driver;

        @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        }

        @Test
        public void deleteAll() {
            SmartBear.loginToSmartBear(driver);
            WebElement selectAllbtn = driver.findElement(By.xpath("//a[@id=\"ctl00_MainContent_btnCheckAll\"]"));
            selectAllbtn.click();

            WebElement deleteBtn = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$btnDelete\"]"));
            deleteBtn.click();


            WebElement msg = driver.findElement(By.xpath("//div[@id=\"ctl00_MainContent_orderMessage\"]"));

            Assert.assertTrue(msg.isDisplayed());


        }

        @AfterClass
    public void tearDown(){
            driver.close();
        }



}
