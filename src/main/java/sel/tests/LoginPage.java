package sel.tests;

import org.openqa.selenium.WebElement;

public class LoginPage {

  private WebElement username;
  private WebElement password;
  private WebElement submit;

  public void login(String user, String pass) {
    username.sendKeys(user);
    password.sendKeys(pass);
    submit.click();
  }

}
