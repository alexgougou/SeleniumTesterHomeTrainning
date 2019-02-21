package Pages;

import SeleniumDriver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HogwartsPage extends BasePage{
    By topics = By.xpath("//*[@class='title media-heading']");
    By topic1 = By.cssSelector(".title media-heading > a[title='定向班第一期_Selenium 入门实战_20190217']");
    By topicBy = By.cssSelector(".media-heading > a[title$='定向班第一期_Selenium 入门实战_20190217']");


    public List<String> getTopics(){
        List<String> topicslist = new ArrayList<String>();
        for (WebElement e: Driver.getDriver().findElements(topics))
        {
            topicslist.add(e.getText());
        }
        return topicslist;

    }

    public void gotoFirsttopic(){
        find(topicBy).click();
    }
}
