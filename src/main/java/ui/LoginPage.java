package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
     this.driver = driver;
  }

        public LoginPage open() {
       driver.get("https://qa-interviewer.herokuapp.com/");
        return this;
    }

}

