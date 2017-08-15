import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.LoginPageRC;
import utils.*;

public class LoginRC {
    LoginPageRC loginPageRC;

    @BeforeClass
    public void setUp() {
        ;
    }

    @Test(groups = {"functest", "login"})
    public void login()throws InterruptedException {
        loginPageRC = new LoginPageRC();


        loginPageRC.open();

    }


}