package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListsPage extends BasePage {

    private String menuMovieXPath="(//a[@href='/movie'])[1]";
    private String clickPopularXPath="(//a[contains(.,'Popular')])[1]";
    private String btnSortResultByXPath="(//span[@unselectable='on'][contains(.,'Popularity Descending')])[3]";
    private String btnSortResult2ByXPath="(//li[@tabindex='-1'])[2]";
    private String btnSearchXPath="(//a[contains(.,'Search')])[1]";

    public ListsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickMovieMenu(){

        driver.findElement(By.xpath(menuMovieXPath)).click();
        driver.findElement(By.xpath(clickPopularXPath)).click();

    }

    public void filterPopular(){
        driver.findElement(By.xpath(btnSortResultByXPath)).click();
        sleep(200);
        driver.findElement(By.xpath(btnSortResult2ByXPath)).click();
        driver.findElement(By.xpath(btnSearchXPath)).click();
        sleep(1000);
    }
}
