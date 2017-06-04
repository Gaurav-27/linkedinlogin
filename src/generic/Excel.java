package generic;

import java.io.File;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getCellValue( String path,String sheet, int row, int cell)
	{
		String v = " ";
		
		try{
			File f = new File(path);
			Workbook wb = WorkbookFactory.create(f);
			Sheet s = wb.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			
			/*
			Workbook wb = WorkbookFactory.create(new File(path));
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);*/
			
			v = c.toString();
		}
		catch(Exception e)
		{
			System.out.println("Exception here");
			e.printStackTrace();
		}
		
		return v;
	}
	
	public static int getRowCount(String path,String sheet)
	{
		int rc = 0;
		try{
			Workbook wb = WorkbookFactory.create(new File(path));
			rc = wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			System.out.println("Count Exception");
			e.printStackTrace();
		}
		return rc;
	}

	

}
