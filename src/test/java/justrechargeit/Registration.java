package justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\reet\\Desktop\\selenium\\library\\chromedriver.exe");
				driver = new ChromeDriver();
				//url
				driver.get("https://www.justrechargeit.com/");
				//click on create account button
				driver.findElement(By.id("signup-link9")).click();
				//enter all the fields
				driver.findElement(By.id("signup_name")).sendKeys("reetika");
				driver.findElement(By.id("signup_mobileno")).sendKeys("9317094560");
				driver.findElement(By.id("signup_email")).sendKeys("reetika189@gmail.com");
				driver.findElement(By.id("signup_password")).sendKeys("123456");
				Thread.sleep(5000);
				//driver.findElement(By.id("checkbox")).click();
				driver.findElement(By.xpath(".//*[@id='checkbox']")).click();
				driver.findElement(By.id("imgbtnSubmit")).click(); 	

		

	}

}
