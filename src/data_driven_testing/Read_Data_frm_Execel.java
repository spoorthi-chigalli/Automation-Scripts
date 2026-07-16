package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_frm_Execel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet("Registration").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
	}

}
