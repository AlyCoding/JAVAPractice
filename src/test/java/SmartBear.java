import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear {


    public static void main(String[] args) {
        //  TC    #1: Smartbear   software    link    verification
        //1.Open   browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //2.Go to  website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

      /*  String userName = "Tester";
        WebElement user = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_username\"]"));
        user.sendKeys(userName);

        //3.Enter username: "Tester"
        //4.Enter password: "test"

        String password = "test";
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_password\"]"));
        pass.sendKeys(password);


        //5.Click to Login button

        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_login_button\"]"));
        loginButton.click();
        //6. Print out count of all the links on landing page

        List<WebElement> list = driver.findElements(By.xpath("//body//a"));
        //7.Print out each link text on this page
        for (WebElement element : list) {

            System.out.println(element.getText());
        }
*/
        loginToSmartBear(driver); //this how you can call a static method in a static main in same class;

        //  TC#2: Smartbear software order placing
        //1.Open   browser
        // 2.Go to  website:    http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3.Enter username: "Tester"
        //  4.Enter password: "test"
        //  5.Click on Login button

        // 6.Click on Order
        WebElement order = driver.findElement(By.xpath("//a[.=\"Order\"]"));
        order.click();
        //  7.Select familyAlbum from product, set quantity to 2
        WebElement familyAlbum = driver.findElement(By.xpath("//select[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]"));

        Select select1 = new Select(familyAlbum);
        select1.selectByVisibleText("FamilyAlbum");
        WebElement quantity = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
       quantity.sendKeys(Keys.BACK_SPACE);
       //quantity.clear();
       quantity.sendKeys("2");


        //  8.Click to "Calculate"button
        WebElement calcBtn = driver.findElement(By.xpath("//input[@value=\"Calculate\"]"));
                calcBtn.click();
        //  9.Fill address Info with JavaFaker
        WebElement name = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
        Faker faker = new Faker();
        name.sendKeys(faker.superhero().name());
        // •Generate: name, street, city, state, zip code
        WebElement street = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
        street.sendKeys(faker.address().streetAddress());
        WebElement city = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));
        city.sendKeys(faker.address().city());
        WebElement state = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]"));
        state.sendKeys(faker.address().state());
        WebElement zip = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]"));
        zip.sendKeys(faker.address().zipCode().substring(0,5));

        // 10.Click on "visa" radio button
        WebElement card = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_cardList_0\"]"));
        card.click();
        //  11.Generate card number using JavaFaker
       WebElement cardNumber = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
       cardNumber.sendKeys(faker.business().creditCardNumber().replace("-",""));
        WebElement cardExp = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]"));
        //cardExp.sendKeys(faker.business().creditCardExpiry());
       cardExp.sendKeys("01/55");
        //  12.Click on "Process"
        WebElement processBtn = driver.findElement(By.xpath("//a[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]"));
       processBtn.click();
        //  13.Verify success message "New order has been successfully added."

        WebElement msg = driver.findElement(By.xpath("//div[@class=\"buttons_process\"]/strong"));
        String expectedValue = "New order has been successfully added.";
        String actualValue = msg.getText();

        if(actualValue.equals(expectedValue)){
            System.out.println("Woohoo");
        } else {
            System.out.println("doh!");
        }

    }
        //Mini-Task:
       // 1. Create a method called loginToSmartBear

        public static void loginToSmartBear(WebDriver driver) {

            WebElement user = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_username\"]"));

            WebElement pass = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_password\"]"));
            WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"ctl00_MainContent_login_button\"]"));

            user.sendKeys("Tester");
            pass.sendKeys("test");

            loginButton.click();
        }
        //2. This method simply logs in to SmartBear when you call it







    // Continuation for samartbear website
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //Part I. Method for verifying name exist on the table
    //Create a method named verifyOrder that takes WebDriver object and String name
    //This method should verify if given name exists in orders

              public static void verifyOrder(WebDriver driver, String name) {
                  List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
                  for(WebElement names : allNames ) {
                      if(names.getText().contains(name)) {
                          System.out.println("The exist in the list " + names.getText());
                          return;//you need return otherwise it will print whatever outside the loop
                      }
                  }
                  System.out.println("The name doesn't exist in the list");
              }

////table[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]/td[7]
public static void printNameAndCities(WebDriver driver) {
    List<WebElement> allNames = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[2]"));
        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr/td[7]"));
    for(int i = 0; i<allCities.size(); i++) {
        System.out.println(allNames.get(i).getText() + " lives in " + allCities.get(i).getText());
    }
    //System.out.println("The name doesn't exist in the list");
}



                  //Part II. Method to print name and cities
    //Create a method named printNameAndCities that takes WebDriver object as parameter
    //This method should simply print all the names in the List of All orders



   // TestNG and SmartBear
    //Task DeleteAll
//1. Open a chrome browser
//2. Go to :http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  //          3. Enter username : “Tester”
    //        4. Enter password: “test”
      //      5. Click on logon button


//6. Click checkAll
//7. Click “Delete Selected”
  //          8. Assert “List of orders is empty. In order to add new order use  this link.” text is displayed
    //

}
