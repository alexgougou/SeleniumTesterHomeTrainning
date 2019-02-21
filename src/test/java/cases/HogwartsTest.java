package cases;

import Pages.AssociationPage;
import Pages.HogwartsPage;
import Pages.MainPage;
import SeleniumDriver.Driver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HogwartsTest {
    static WebDriver driver;

    @BeforeAll
    public static void before()
    {
        Driver.start();
        driver = Driver.getDriver();
    }

    @AfterAll
    public static void after()
    {
        driver.quit();
    }

    @Test
    public void hogwartsTest() throws Exception
    {
        driver.get("https://testerhome.com/");
        MainPage mainPage = new MainPage();
        List<String> topics = new ArrayList<String>();
        AssociationPage associationPage = mainPage.goAssociation();
        System.out.println("go to association");
        HogwartsPage hogwartsPage = associationPage.gotoHogwarts();
        System.out.println("go to hogwarts");
        Thread.sleep(5000);
        //等待5秒，否则未加载完全，无法取出list
        topics = hogwartsPage.getTopics();
        System.out.println(topics.size());
        for (String str:topics)
        {
            System.out.println(str);
        }
    }

    @Test
    public void hogwartsAccess() throws Exception
    {
        driver.get("https://testerhome.com/");
        MainPage mainPage = new MainPage();
        List<String> topics = new ArrayList<String>();
        AssociationPage associationPage = mainPage.goAssociation();
        System.out.println("go to association");
        HogwartsPage hogwartsPage = associationPage.gotoHogwarts();
        System.out.println("go to hogwarts");
//        Thread.sleep(5000);
        hogwartsPage.gotoFirsttopic();
        Thread.sleep(5000);
        assertTrue(Driver.getDriver().getPageSource().contains("访问被拒绝，你可能没有权限或未登录。"));
    }
}
