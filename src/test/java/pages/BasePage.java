package pages;

import com.codeborne.selenide.WebDriverRunner;

/**
 * @author Matvii Kuznietsov
 */
public class BasePage {
    public String getCurrentUrl() {
        return WebDriverRunner.currentFrameUrl();
    }
}
