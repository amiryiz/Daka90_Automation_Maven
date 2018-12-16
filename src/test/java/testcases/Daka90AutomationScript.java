package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.Daka90AutomationPage;

public class Daka90AutomationScript {
    private static WebDriver driver = null;

    @BeforeTest
    public void setBaseURL() {
        //Chrome Browser Location
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        //open the browser on the second screen
        driver.manage().window().setPosition(new Point(3000,1));

        //maximize the browser
        driver.manage().window().maximize();

        //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Open Daka90 URL
        driver.get("https://www.daka90.co.il");

    }

    @Test
    public void TestScript() throws InterruptedException {
        //Start execution -------------//
        //Click on tab
        pageobject.Daka90AutomationPage.clickOnCategoryButton(driver);
        //Select from location
        pageobject.Daka90AutomationPage.fromLocation(driver);
        //Select to location
        pageobject.Daka90AutomationPage.toLocatin(driver);
        //Select from date
        pageobject.Daka90AutomationPage.selectFromDate(driver);
        //Select to date
        pageobject.Daka90AutomationPage.selectToDate(driver);
        //Add person count
        pageobject.Daka90AutomationPage.selectPersonCount(driver);
        //Click on submit button
        pageobject.Daka90AutomationPage.clickOnSubmitButton(driver);
        //switch to new tab
        pageobject.Daka90AutomationPage.changeToNewTab(driver);
        //Close JS pop-up
        pageobject.Daka90AutomationPage.closeJSPopup(driver);
        //Click on added ticket
        pageobject.Daka90AutomationPage.clickOnResult(driver);
        //click on rooms
        pageobject.Daka90AutomationPage.clickOnHotelRoom(driver);
        //switch to new tab
        pageobject.Daka90AutomationPage.changeToNewTab(driver);
        //This method select car
        pageobject.Daka90AutomationPage.selectCar(driver);
        //Click on ok order
        pageobject.Daka90AutomationPage.clickOnOkOrder(driver);
        //Add details
        pageobject.Daka90AutomationPage.addDetails(driver,"Test","Test","Test2.Test2@gmail.com","0123456");
        //Verify order
        pageobject.Daka90AutomationPage.verifyOrderAdded(driver);
    }


    @AfterTest
    public void closeBrowser() {
        //Close Browsers ===============//
        //driver.close();
    }

}
