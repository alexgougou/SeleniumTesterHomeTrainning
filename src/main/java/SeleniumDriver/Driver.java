package SeleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver;

    public static void start()
    {
        System.setProperty("webdriver.chrome.driver",
                "/Users/alex/Documents/tool/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
