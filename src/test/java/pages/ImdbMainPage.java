package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * @author Matvii Kuznietsov
 */
public class ImdbMainPage extends BasePage{
    private final SelenideElement fieldFind = $("#suggestion-search");
    private final SelenideElement signBackFuture = $x("//div[@class=\"sc-dlMCtj bWqAnP\"]/child::div[contains(text(),\"1985\")]");

    public ImdbMainPage fillFieldFiend(String data) {
        fieldFind.setValue(data);
        return new ImdbMainPage();
    }

    public BackFuturePage clickSignBackFuture() {
        signBackFuture.click();
        return new BackFuturePage();
    }
}
