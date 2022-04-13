package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    private String TranslateBtnXpath="(//div[contains(.,'tr')])[5]";
    private String TranslateTRXpath="(//span[@unselectable='on'][contains(.,'Türkçe (tr-TR)')])[3]";
    private String TranslateListBoxXPath="(//input[@class='k-textbox'])[4]";
    private String TranslateEngXPath="(//li[@tabindex='-1'][contains(.,'İngilizce (en-US)')])[1]";
    private String ReloadBtnXPath="//a[contains(.,'Sayfayı Yenile')]";


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String baseURL = "https://www.themoviedb.org/movie";


public  void goToWebSite() {
    driver.get(baseURL);
    sleep(2000);
}
public void changeTranslate(){
    driver.findElement(By.xpath(TranslateBtnXpath)).click();
    sleep(1000);
    driver.findElement(By.xpath(TranslateTRXpath)).click();
    sleep(1000);
    driver.findElement(By.xpath(TranslateListBoxXPath)).sendKeys("en-US");
    sleep(200);
    driver.findElement(By.xpath(TranslateEngXPath)).click();
    sleep(1000);
    driver.findElement(By.xpath(ReloadBtnXPath)).click();
    sleep(2000);
}


}