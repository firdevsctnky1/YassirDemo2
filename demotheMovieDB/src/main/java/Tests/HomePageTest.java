package Tests;

import Pages.BasePage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void  createTools() throws InterruptedException {

        HomePage homePage = new HomePage(driver, wait);
        homePage.goToWebSite();
        homePage.changeTranslate();




    }
}
