package sel.tests;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class StartPage {

  @FindBy(name="logoutform")
  private WebElement logoutform;

  public void logout() {
    logoutform.submit();
  }

}
