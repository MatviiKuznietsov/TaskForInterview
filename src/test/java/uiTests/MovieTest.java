package uiTests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ImdbMainPage;

import static dataProvider.DataForTests.*;

/**
 * @author Matvii Kuznietsov
 */
public class MovieTest extends BaseTest {
    ImdbMainPage imdbMainPage = new ImdbMainPage();

    @BeforeMethod
    public void preparation() {
        Selenide.open(BASE_URL);
    }

    @Test
    @Description("Check movie Back to the future on IMBD")
    public void checkMovieTest() {
        Assert.assertEquals(imdbMainPage.getCurrentUrl(), BASE_URL);
        boolean result = imdbMainPage.fillFieldFiend(MOVIE_NAME)
                .clickSignBackFuture()
                .isDescriptionSignExist();
        Assert.assertTrue(result, ERROR_MSG);
    }
}
