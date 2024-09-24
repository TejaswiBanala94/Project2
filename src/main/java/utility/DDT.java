package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT
{
	public static String cardnumber(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\Project2\\DDT\\tejaswi.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String cnum = NumberToTextConverter.toText(w1.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue());
		return cnum;
		
	}
	public static String cvvnumber(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\banal\\eclipse-workspace\\Project2\\DDT\\tejaswi.xlsx");
		Workbook w1=WorkbookFactory.create(f1);

		String cvvnum = NumberToTextConverter.toText(w1.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue());
		return cvvnum;
		
	}


}
