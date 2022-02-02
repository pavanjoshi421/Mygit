package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_readexcel
{
	public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
String val="";
FileInputStream fis=new FileInputStream("./Excel/Hybrid.xlsx");
Workbook book=WorkbookFactory.create(fis);
Cell c=book.getSheet(sheet).getRow(0).getCell(0);
return val=c.getStringCellValue();
}
}
