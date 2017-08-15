package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.RemoteDriverManager;

public class LoginPageRC {
    private WebDriver driver;

    public LoginPageRC() {
        this.driver = RemoteDriverManager.getDriver();
    }

    public LoginPageRC open() {
        driver.get("https://habrahabr.ru/post/151715/");
        return this;
    }

}