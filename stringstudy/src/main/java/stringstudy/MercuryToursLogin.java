package stringstudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursLogin {

	public static void main(String[] args) {
		Properties prop = new Properties();
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "/" + "/src/main/resources/com/resources/files/config.properties");
			// C:\Users\config\git\string\stringstudy\stringstudy\src\main\resources\com\resources\files\config.properties
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());

		// Clean UP
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		if (driver.getTitle().contains("Mercury")) {

			System.out.println("Mercury is present in Title");
		}

		else {
			System.out.println("Mercury is NOT present in Title");
		}

		// Login

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login']")).click();

		if (driver.getTitle().contains("Find")) {

			System.out.println("Login Success. Can see Find in title");
		}

		else {

			System.out.println("Login FAILEd. Can't see Find in title");
		}

		// Find Flight

		if (driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected()) {
			System.out.println("roundtrip option selected");
		}

		else {
			driver.findElement(By.xpath("//input[@value='roundtrip']")).click();
			System.out.println("Clicked Round trip button");
		}

		Select pcount = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		pcount.selectByValue("2");

		// driver.findElement(By.xpath("//select[@name='passCount']")).cli

		// departing from
		Select deptFrom = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		deptFrom.selectByIndex(1);

		// month
		Select deptmonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		deptmonth.selectByValue("2");
		// date
		Select dMonth = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		dMonth.selectByValue("31");

		// Arriving in
		Select arrIn = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		arrIn.selectByIndex(2);

		// Return month
		Select rMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		rMonth.selectByIndex(3);

		// return date
		Select rDate = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		rDate.selectByIndex(1);

		driver.findElement(By.xpath("//input[@value='Coach']")).click();

		// airline
		Select strAirline = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		strAirline.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='findFlights']")).click();

		driver.findElement(By.xpath("(//input[@name='inFlight'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='outFlight'])[1]")).click();

		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();

		// Summary Page
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("sumit");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("raut");

		// meal
		Select meal = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		meal.selectByIndex(1);

		Select card = new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
		card.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("12345678");

		Select cexpmnth = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
		cexpmnth.selectByIndex(1);

		Select cexpyear = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
		cexpyear.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();

		if (driver.findElement(By.xpath("//font[contains(text(),'itinerary')]")).getText().contains("itinerary")) {

			System.out.println("Success");

		}

		else {

			System.out.println("Failed");
		}

		// driver.quit();
	}
}
