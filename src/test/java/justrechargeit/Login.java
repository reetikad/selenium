package justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver;

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reet\\Desktop\\selenium\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		//url
		driver.get("https://www.justrechargeit.com/");
		//click on create account button
		driver.findElement(By.id("jriTop_signin9")).click();
		//enter all the fields
		driver.findElement(By.id("txtUserName")).sendKeys("reetika189@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		
		
		//git sample test
		driver.findElement(By.id("imgbtnSigni")).click();
		driver.findElement(By.id("imgbtnSin")).click();

	}

}
