package Pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{
    By searchBy = By.cssSelector(".form-group > input");
    By associationBy = By.cssSelector("#main-nav-menu a[href$='teams']");

    public SearchResultPage goSearch(String searchkeys){
        sendkeys(searchBy, searchkeys);
        sendEnter();
        return new SearchResultPage();
    }

    public AssociationPage goAssociation(){
        click(associationBy);

        return new AssociationPage();
    }
}
