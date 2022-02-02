package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic.Base_page;

public class Face_book_login extends Base_page {
@FindBy(id="email")
private WebElement email;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement Login_button;
   
   public Face_book_login(WebDriver driver)  {
	  super(driver);
   }
  public void email(String emailid)  {
	  email.sendKeys(emailid);
  }
  public void password(String passw)  {
	  password.sendKeys(passw);
  }
public void Login_button()  {
	Login_button.click();
}

}
