package Pages;

import SeleniumDriver.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    static WebElement find(By by)
    {

        try
        {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return Driver.getDriver().findElement(by);
        }catch (Exception e){
            return Driver.getDriver().findElement(by);
        }
    }

    public void click(By by){
        find(by).click();
    }

    public void sendkeys(By by, String keys){
        find(by).clear();
        find(by).sendKeys(keys);
    }

    public void sendEnter(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
    }
}
