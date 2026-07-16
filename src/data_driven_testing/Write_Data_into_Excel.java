package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data_into_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		wb.getSheet("Registration").getRow(1).getCell(1).setCellValue("Helloo");
		//wb.getSheet("Registration").getRow(30).createCell(20).setCellValue("Helloo");
		
		FileOutputStream fos = new FileOutputStream(".\\data\\Test_Scenarios.xlsx");
		
		wb.write(fos);
		
		wb.close();

	}

}
