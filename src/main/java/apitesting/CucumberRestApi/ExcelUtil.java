package apitesting.CucumberRestApi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file= new FileInputStream("src\\test\\java\\resources\\testdata.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		System.out.println(workbook.getNumberOfSheets());

		XSSFSheet sheet = workbook.getSheet("test");

		Iterator<Row> rows = sheet.iterator();

		while(rows.hasNext()) {
			Row r= rows.next();
			System.out.println(r.getLastCellNum());

			Iterator <Cell> cell=r.cellIterator();
			while(cell.hasNext()) {
				Cell c= cell.next();
				if(c.getCellType().equals(CellType.STRING))
					System.out.println("Column - "+c.getStringCellValue());
				else
					//NumberToTextConverter.toText(c.getNumericCellValue());
					System.out.println("Column - "+c.getNumericCellValue());
			}
		}
		
		//to get specific cell
		Row row=sheet.getRow(2); //returns the logical row  
		Cell cell=row.getCell(4); //getting the cell representing the given column  
		System.out.println(cell.getStringCellValue());
		
		
		
		for (Row rowss: sheet) {
            for(Cell cellss: rowss) {
                //String cellValue = dataFormatter.formatCellValue(cell);
            	System.out.println(rowss.getRowNum());
                System.out.println("New Method- "+cellss);
            }
            System.out.println();
        }
		
		workbook.close();
	}
}
