package stringstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapWork {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		String filePath = "C:\\Users\\config\\git\\string\\stringstudy\\src\\main\\resources\\com\\resources\\files\\HashmapTrail.xlsx";

		File xls = new File(filePath);

		try {
			fis = new FileInputStream(xls);
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		}

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");

		int rowcount = ws.getLastRowNum();
		int colcount = ws.getRow(0).getLastCellNum();

		System.out.println("row:" + rowcount + "Colcount " + colcount);

		HashMap<Object, Object> hm = new HashMap<Object, Object>();

		Object[][] data = new Object[rowcount][1];
		for (int r = 0; r < rowcount; r++) {

			for (int c = 0; c < colcount; c++) {

				System.out.println(ws.getRow(0).getCell(c) + " " + ws.getRow(r + 1).getCell(c));
				hm.put(ws.getRow(0).getCell(c), ws.getRow(r + 1).getCell(c));

			}

			data[r][0] = hm;

		}

		// System.out.println(hm);

		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Separator");

	}

}
