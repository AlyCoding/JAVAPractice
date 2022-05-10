package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Practice {

    @Test
    public void bfirstTest(){
        System.out.println("This is TestNG - first run");
    }

    //runs test alphabetically

    @Test
    public void afirstTest(){
        System.out.println("This is TestNG - second run");
        Assert.assertEquals(12,12);
        Assert.assertTrue(12==12);
        Assert.assertEquals("Google", "Google", "woohoo!!");

    }

    //for example you need to set up webdriver once before running any classes

    @BeforeClass
    public void thirdTest(){
        System.out.println("This is BeforeClass");
    }

    @BeforeMethod
    public void fourthTest(){
        System.out.println("This is before each method"); //Setup before each test. Another example - log in
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after each method"); //example - like take a screenshot
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class" +
                "We can use to close the browser");
    }



}
