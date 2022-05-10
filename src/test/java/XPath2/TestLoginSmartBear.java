package XPath2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLoginSmartBear {

    @Test
    public void loginToStupidBear(){
        SmartBear.loginToSmartBear();

        //WebDriver driver = new ChromeDriver();

       /* WebElement user = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_username\"]"));
        user.sendKeys(this.userName);
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_password\"]"));
        pass.sendKeys(this.password);*/

    }
}
