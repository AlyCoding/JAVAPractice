import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW3_0507 {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void deleteOrder(String givenName) {
        SmartBear.loginToSmartBear(driver);
        //String givenName = "Mark Smith";
        WebElement checkbox = driver.findElement(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[.='" + givenName + "']/../td[1]"));
        checkbox.click();


        WebElement deleteBtn = driver.findElement(By.xpath("//input[@name=\"ctl00$MainContent$btnDelete\"]"));
        deleteBtn.click();

        //WebElement deleteName = driver.findElement(By.xpath("//td[.=' " + givenName + "']"));

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

        for (WebElement names : allNames) {
            Assert.assertFalse(names.getText().equals(givenName));
        }

        //Assert.assertFalse(checkbox.isDisplayed());
    }
        @Test
        public void editOrder() {
            SmartBear.loginToSmartBear(driver);
            String givenName = "Steve Johns";
            WebElement editButton = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.=" + givenName + "]/../td[13]"));
            editButton.click();

            WebElement customerName = driver.findElement(By.xpath(""));
            customerName.clear();
            customerName.sendKeys("Actor Name");

            WebElement updateButton = driver.findElement(By.xpath(""));
            updateButton.click();

            List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));

            for(WebElement name: allNames) {
                if (name.getText().equals("Actor Name")) {
                    Assert.assertEquals(name.getText(), "Actor Name");
                }
            }

            System.out.println("Woohoo!!");

        }
    }

