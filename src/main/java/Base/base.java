package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.utility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class base {
	
	protected static WebDriver driver;
	protected static FileInputStream file;
	protected static Properties prop;
	protected static utility util;
	protected static FileInputStream excelfile;
	protected static XSSFSheet xSheet;
	protected static Object[][] data;
	protected static XSSFWorkbook xWorkBook;
	protected static WebElement element;
	protected static Pages.LoginPage loginpage;

	static {

		WebDriverManager.chromedriver().setup();
	}


	/**
	 *  To Load the Properties file in file.io
	 */
	public base() {
		try {
			prop = new Properties();
			file = new FileInputStream(
					".\\src\\main\\resources\\config.properties");
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

