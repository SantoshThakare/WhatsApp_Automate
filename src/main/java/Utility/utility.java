package Utility;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

import Base.base;

public class utility extends base {
	public static void intilization(String browser) {
		try {

			if (browser.equals("chrome")) {
//				driver = new ChromeDriver();
//				Cookie ck = new Cookie("wa_beta_version", "production/1666839284/2.2241.7");
//				driver.manage().addCookie(ck);
				////////////////////
//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("‪C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Cookies");
//				options.addArguments("C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Cookies-journal");
//				options.addArguments("‪C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\TransportSecurity");
//				options.addArguments("C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Reporting and NEL");
//				options.addArguments("C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Reporting and NEL-journal");
//				options.addArguments("C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Network Persistent State");
//				driver = new ChromeDriver(options);

				////////////////////
				
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("‪C:\\Users\\Shree\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Network\\Cookies");
				Cookie cooki = new Cookie.Builder("wa_beta_version", "production%2F1666839284%2F2.2241.7")
						.domain(".web.whatsapp.com")
						.path("/")
						.expiresOn(new Date(2022-11-18))
						.isHttpOnly(true)
						.isSecure(true)
						.path("/")
						.build();
		        driver.manage().addCookie(cooki);
				driver = new ChromeDriver(options);

				
				
				
				
				
				/////////////////////
//				Set<Cookie> cookiesList =  driver.manage().getCookies();
//				for(Cookie getcookies :cookiesList) {
//				    System.out.println(getcookies );
//				}
	
				
			////////////////////////////	
				
//				driver.manage().window().maximize();
				
				
//		        File file = new File(".\\src\\main\\resources\\repository\\Cookies");							
//		        FileReader fileReader = new FileReader(file);							
//		        BufferedReader Buffreader = new BufferedReader(fileReader);							
//		        String strline;			
//		        while((strline=Buffreader.readLine())!=null){									
//		        StringTokenizer token = new StringTokenizer(strline,";");									
//		        while(token.hasMoreTokens()){
//		        	
//		        	
//		        String name = token.nextToken("wa_csrf");					
//		        String value = token.nextToken("hj0_qEE6M-YkSqLJ8IcZmH");					
//		        String domain = token.nextToken(".whatsapp.com");					
//		        String path = token.nextToken("/");					
//		        Date expiry = null;					
//		        		
////		        String val;			
////		        if(!(val=token.nextToken()).equals("null"))
////				{		
////		        	expiry = new Date(val);					
////		        }		
////		        Boolean isSecure = new Boolean(token.nextToken()).								
////		        booleanValue();		
//		        Cookie ck = new Cookie(name,value,domain,path,expiry);			
//		        System.out.println(ck);
////				//driver.manage().window().maximize();
//
//		        driver.manage().addCookie(ck);
//		        // This will add the stored cookie to your current session					
//		        }		
//		        }
		        
			
		
				
				
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.get(prop.getProperty("baseURL"));
		
		        } 
			else if (browser.equals("opera")) {
				driver = new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.get(prop.getProperty("baseURL"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Method To Run Terminate method after running each Testcases

		public static void closedriver() {

			try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
