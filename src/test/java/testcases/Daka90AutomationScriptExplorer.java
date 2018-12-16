package testcases;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Daka90AutomationScriptExplorer {
    private static WebDriver driver = null;

    @BeforeTest
    public void setBaseURL() {
        //Chrome Browser Location
        System.setProperty("webdriver.ie.driver", "C:\\automation\\drivers\\IEDriverServer_64.exe");
        driver = new InternetExplorerDriver();

        //open the browser on the second screen
        driver.manage().window().setPosition(new Point(3000,1));

        //maximize the browser
        driver.manage().window().maximize();

        //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @Test
    public void TestScript() throws InterruptedException {
        //Open Daka90 URL
        driver.get("https://www.daka90.co.il");

        //print the Thread for this test
        System.out.println("Running Daka90utomationScriptExplorer with thread ID:"+Thread.currentThread().getId());

        //Start execution -------------//
        //Click on tab

        //pageobject.Daka90AutomationPage.clickOnCategoryButton(driver);
        //Select from location
        //pageobject.Daka90AutomationPage.fromLocation(driver);
        //Select to location
        //pageobject.Daka90AutomationPage.toLocatin(driver);
        //Select from date

        }
}
