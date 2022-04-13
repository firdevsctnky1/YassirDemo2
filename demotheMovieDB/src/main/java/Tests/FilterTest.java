package Tests;

import Pages.HomePage;
import Pages.ListsPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class FilterTest extends BaseTest {

    @Test
    public void filterMovie() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);
        ListsPage listpage = new ListsPage(driver, wait);
        homePage.goToWebSite();
        homePage.changeTranslate();
        loginPage.login();
        listpage.clickMovieMenu();
        listpage.filterPopular();
    }
}
