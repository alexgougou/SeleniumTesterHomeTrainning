package Pages;

import org.openqa.selenium.By;

public class AssociationPage extends BasePage{
    By hogwartsBy = By.cssSelector(".team-name[title='霍格沃兹测试学院(hogwarts)']");

    public HogwartsPage gotoHogwarts(){
        click(hogwartsBy);
        return new HogwartsPage();
    }

}
