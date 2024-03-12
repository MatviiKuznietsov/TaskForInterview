package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * @author Matvii Kuznietsov
 */
public class BackFuturePage extends BasePage {
    private final SelenideElement descriptionSign = $x("//*[@data-testid=\"plot-xs_to_m\"]");

    public Boolean isDescriptionSignExist() {
        return descriptionSign.exists();
    }


}
