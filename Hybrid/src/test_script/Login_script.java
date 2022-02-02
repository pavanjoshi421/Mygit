package test_script;



import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.Baseclass;
import generic.Generic_readexcel;
import pom.Face_book_login;

public class Login_script extends Baseclass{
  @Test
  public void test() throws EncryptedDocumentException, IOException  {
	  String email=Generic_readexcel.getdata("Sheet1",0,0);
	  String password=Generic_readexcel.getdata("Sheet1",1,0);
	  Face_book_login face=new Face_book_login(driver);
	  face.email(email);
	  face.password(password);
	  face.Login_button();
  }
}
