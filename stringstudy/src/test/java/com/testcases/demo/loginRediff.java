package com.testcases.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginRediff {

	@Test(dataProvider = "getdata")
	public void login_Rediff(Map<Object, Object> mapdata) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// System.out.println("print");
		//System.out.println(mapdata.get("username"));

		driver.findElement(By.xpath("//input[@name='login']")).sendKeys(mapdata.get("username").toString());
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(mapdata.get("password").toString());
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		 driver.quit();
	}

	@DataProvider(name = "getdata")
	public Object[][] dataproviderMethod() {

		FileInputStream fis = null;
		XSSFSheet ws = null;
		XSSFWorkbook wb = null;
		String filePath = "C:\\Users\\config\\git\\string\\stringstudy\\src\\main\\resources\\com\\resources\\files\\HashmapTrail.xlsx";

		File xls = new File(filePath);
		try {
			fis = new FileInputStream(xls);
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		}
		// XSSFWorkbook wb;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		int colcount = ws.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][1];

		for (int r = 0; r < rowcount; r++) {
			// Create Hashmap after every row iteration
			HashMap<Object, Object> hm = new HashMap<Object, Object>();
			for (int c = 0; c < colcount; c++) {
				hm.put(ws.getRow(0).getCell(c).toString(), ws.getRow(r + 1).getCell(c).toString());

			}

			data[r][0] = hm;
			// Add every row in hashmap
		}

		try {
			wb.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return data;
	}

}
