package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel1 implements Prj_Constant {
	public static String getCellValue(String sheet,int row,int cell)
	{
		String v=" ";
		try {
			FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Cell  c=(Cell) wb.getSheet(sheet).getRow(row).getCell(cell);
			v=c.toString();
		}
		catch(Exception e)
		{
			Reporter.log("path is invalid",true);
			
			
		}
		return v;
	}

}
