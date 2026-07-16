package generic_library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

    /**
     * This method reads data from the property file using the given key
     * and returns the corresponding value.
     *
     * @param key
     * @return value from property file
     * @throws Throwable
     */
    public String readPropertyData(String key) throws Throwable {

        FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");

        Properties p = new Properties();
        p.load(fis);

        return p.getProperty(key);
    }

    /**
     * This method reads data from Excel using sheet name, row index
     * and cell index and returns the cell value.
     *
     * @param sheetName
     * @param rowIndex
     * @param cellIndex
     * @return Excel cell data
     * @throws Throwable
     */
    public String readExcelData(String sheetName, int rowIndex, int cellIndex) throws Throwable {

        FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        String data = wb.getSheet(sheetName)
                        .getRow(rowIndex)
                        .getCell(cellIndex)
                        .toString();

        wb.close();

        return data;
    }

    /**
     * This method writes data into Excel using sheet name,
     * row index and cell index.
     *
     * @param sheetName
     * @param rowIndex
     * @param cellIndex
     * @param value
     * @throws Throwable
     */
    public void writeDataIntoExcel(String sheetName, int rowIndex, int cellIndex, String value) throws Throwable {

        FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        wb.getSheet(sheetName)
          .getRow(rowIndex)
          .createCell(cellIndex)
          .setCellValue(value);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");

        wb.write(fos);
        wb.close();
    }
}