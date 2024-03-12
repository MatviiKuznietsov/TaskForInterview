package uiTests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

/**
 * @author Matvii Kuznietsov
 */
public class BaseTest {

    @BeforeClass
    public void setUp() {
        Configuration.browser = "Chrome";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 20000;
        Configuration.browserSize = "1500x800";
        Configuration.screenshots = true;
        Configuration.headless = false;

    }
}
