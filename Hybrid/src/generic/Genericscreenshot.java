package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericscreenshot 
{
   public static void getphoto(WebDriver driver) throws IOException {
	   String photo1="./photo/";
	   Date d=new Date(); 
	   String d1=d.toString();
	   String d2 = d1.replaceAll(":", "-");
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src=ts.getScreenshotAs(OutputType.FILE);
	  File dst=new File(photo1+d2+".jpeg");
	  
   }
}
