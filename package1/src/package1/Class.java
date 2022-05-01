package package1;
import java.util.Scanner;
import java.util.scanner;

public class Class {
        
        	 public static void main(String[] args) 
        	 {
			canner sc = new Scanner
			}
        	 
        	 
        	 package selenium2;

        	 import org.openqa.selenium.By;
        	 import org.openqa.selenium.WebDriver;
        	 import org.openqa.selenium.WebElement;
        	 import org.openqa.selenium.chrome.ChromeDriver;
        	 import org.openqa.selenium.support.ui.Select;

        	 public class ClassA5 {

        	 	private static WebElement A1;

        	 	public static void main(String[] args) throws InterruptedException {
        	 		// TODO Auto-generated method stub

        	 		System.setProperty("webdriver.chrome.driver", "D:\\chrome extrand\\chromedriver_win32 (3)//chromedriver.exe");
        	          WebDriver driver =new ChromeDriver();
        	           driver.get("https://www.facebook.com/");
        	           driver.findElement(By.name("irstname")).sendKeys("venu");
        	           Thread.sleep(500);
        	           driver .findElement(By.name("last name")).sendKeys("jack");
        	           Thread.sleep(500);
        	            driver.findElement(By.name("reg-email---")).sendKeys("madhav522@gmail.com");
        	            Thread.sleep(500);
        	            driver.findElement(By.name("reg-passwd---")).sendKeys("123456789");
        	            Thread.sleep(500);
        	            
        	            WebElement
        	            a3=driver.findElement(By.name("birthday-day"));
        	 	    	 A1 = new Select(A1);
        	            A1.selectByValue("15");
        	            Thread.sleep(500);
        	            
        	            webElement
        	             a2=driver.findElement(By.name("birthday-month"));
        	            Select A2=new Select(a2);
        	            A2.selectByValue("12");
        	            Thread.sleep(500);
        	            
        	            WEbElement
        	            a3=driver.findElement(By.name("birthday-year"));
        	            Select A3=new Select(a3);
        	            A3.selectByValue("1976");
        	            Thread.sleep(500);
        	            driver.findElement(By.xpath("//input[@value='2']")).click();
        	            Thread.sleep(500);
        	            driver.findElement(By.name("websubmit")).click();
        	            Thread.sleep(500);
        	            
        	            
        	            
        	 	}

        	 }
 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
      
        	 
  }
}
         
