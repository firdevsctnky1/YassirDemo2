package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private String btnLoginXPath="(//a[@href='/login'][contains(.,'Login')])[1]";
    private String txtAcLoginXPath="//h2[contains(.,'Login to your account')]";
    private String userNameID="username";
    private String passwordID="password";
    private String btnLoginID="login_button";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void login(){
        driver.findElement(By.xpath(btnLoginXPath)).click();
        driver.findElement(By.xpath(txtAcLoginXPath)).getText().contains("Login to your account");
        driver.findElement(By.id(userNameID)).sendKeys("Firdevsctnky");
        driver.findElement(By.id(passwordID)).sendKeys("126559");
        driver.findElement(By.id(btnLoginID)).click();
        sleep(200);

    }
}
