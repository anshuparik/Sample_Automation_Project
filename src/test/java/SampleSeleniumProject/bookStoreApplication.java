package SampleSeleniumProject;

import Objectrepo.Objofbookstoreaplication;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class bookStoreApplication extends baseclass {

    @Test
    public void login() throws IOException, InterruptedException {
        // driver = initializeDriver();
        // driver.get("https://demoqa.com/login");
        //Create an OBJECT of file class to open file
        File excelfile = new File("A:\\Learn Automation\\Sample Automation Project\\src\\main\\java\\resources\\mytestdata.xlsx");
        //to read data from file crate object of fileinputstream
        //excel>workbook>sheet>row>cell
        FileInputStream inputStream = new FileInputStream(excelfile);
        //created object of workbook
        XSSFWorkbook ExcelWorkbook = new XSSFWorkbook(inputStream);
        //access sheet
        XSSFSheet Excelsheet = ExcelWorkbook.getSheetAt(0);
        //get total row no from sheet
        int totalrow = Excelsheet.getLastRowNum() + 1;
        //get total cell from sheet
        int totalcells = Excelsheet.getRow(0).getLastCellNum();
        //to read from row
        for (int currentrow = 1; currentrow < totalrow; currentrow++) {

            driver = initializeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            Objofbookstoreaplication myobjofbookstoreapp = new Objofbookstoreaplication(driver);
            driver.get("https://demoqa.com/login");

            //get data from 1st cell from 1st row
            myobjofbookstoreapp.getUsername().sendKeys(Excelsheet.getRow(currentrow).getCell(0).toString());
            //get data from 2nd cell from 1st row
            myobjofbookstoreapp.getPassword().sendKeys(Excelsheet.getRow(currentrow).getCell(1).toString());
            js.executeScript("arguments[0].scrollIntoView();", myobjofbookstoreapp.getLogin());
            myobjofbookstoreapp.getLogin().click();
            Thread.sleep(3000);
            driver.quit();

            //to read from cell
           /* for (int currentcell =0; currentcell<totalcells ; currentcell++) {
                System.out.print(Excelsheet.getRow(currentrow).getCell(currentcell).toString());
                System.out.print("\t");
            }
            System.out.println();*/
        }

        ExcelWorkbook.close();

    }

}
