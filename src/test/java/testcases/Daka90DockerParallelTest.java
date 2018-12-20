package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;



public class Daka90DockerParallelTest {

    public static WebDriver driver;


    @Parameters({"browser"})
    @Test

    public void setUp(String browser) throws MalformedURLException, InterruptedException {
        String Node = "http://localhost:4446/wd/hub";
        DesiredCapabilities cap =null;

        if(browser.equals("chrome")){
            cap = DesiredCapabilities.chrome();
        }
        if(browser.equals("firefox")){
            cap = DesiredCapabilities.firefox();
            Thread.sleep(10000);
        }

        cap.setCapability("version","");
        cap.setCapability("platform", "LINUX");
        driver = new RemoteWebDriver(new URL(Node), cap);
        driver.get("https://www.daka90.co.il");
        driver.quit();



    }



}
