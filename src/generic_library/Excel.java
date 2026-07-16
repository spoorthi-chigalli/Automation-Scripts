package generic_library;

public class Excel {

    public static void main(String[] args) throws Throwable {

        FileLib f = new FileLib();

        // Reading data from property file
        String url = f.readPropertyData("url");
        String email = f.readPropertyData("email");
        String password = f.readPropertyData("password");

        System.out.println(url);
        System.out.println(email);
        System.out.println(password);

        // Reading data from different Excel sheets
        String data1 = f.readExcelData("Sheet1", 1, 1);
        String data2 = f.readExcelData("Sheet2", 2, 0);
        String data3 = f.readExcelData("Sheet3", 3, 2);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        // Writing data into Excel
        f.writeDataIntoExcel("Sheet1", 4, 1, "Pass");
        f.writeDataIntoExcel("Sheet2", 5, 2, "Fail");
        f.writeDataIntoExcel("Sheet3", 6, 1, "Skip");
    }
}