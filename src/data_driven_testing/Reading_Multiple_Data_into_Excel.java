package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_Multiple_Data_into_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\seleniumwebdriver\\test_data\\Test_Scenarios.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
        int lastRowNum = wb.getSheet("Login").getLastRowNum();
//        System.out.println(lastRowNum);
//        for(int i=0; i<=lastRowNum; i++)
//        {
//        	String data = wb.getSheet("Login").getRow(i).getCell(0).getStringCellValue();
//        	System.out.println(data);
//        }
//        
//        short lastCellNum = wb.getSheet("Login").getRow(0).getLastCellNum();
//        System.out.println(lastCellNum);
//        for(int j=0; j<lastCellNum; j++)
//        {
//        	String data1 = wb.getSheet("Login").getRow(0).getCell(j).getStringCellValue();
//        	System.out.println(data1);
//        }
        
       //------------Multiple data 
        for(int i=1; i<=lastRowNum; i++)
        {
        	short lastCellNum = wb.getSheet("Login").getRow(i).getLastCellNum();
        	for(int j=1; j<lastCellNum; j++)
            {
            	String MulData = wb.getSheet("Login").getRow(i).getCell(j).getStringCellValue();
            	System.out.print(MulData + " ");
            }
        	System.out.println();
            
        }
	}

}
