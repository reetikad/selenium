package justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Recharge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		// chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reet\\Desktop\\selenium\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		// url
		driver.get("https://www.justrechargeit.com/");
		// click on create account button
		driver.findElement(By.id("jriTop_signin9")).click();
		// enter all the fields
		driver.findElement(By.id("txtUserName")).sendKeys("reetika189@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");

		driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.xpath(".//*[@id='listingtable_ImgRecharge_0']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtrechargeval")).sendKeys("47");
		driver.findElement(By.name("btnProceedtoPay")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='lblUserCreditCard']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//*[@id='lstvCredit_ctrl0_imgPaymentG_1']")).click();
		driver.findElement(By.name("btnProceedtoPay")).click();
		driver.findElement(By.name("creditCardNumber")).sendKeys("123456789");
		new Select(driver.findElement(By.id("expiryMonthCreditCard"))).selectByVisibleText("Jan (01)");
		new Select(driver.findElement(By.name("expiryYearCreditCard"))).selectByVisibleText("2017");
		driver.findElement(By.name("CVVNumberCreditCard")).sendKeys("223");
		driver.findElement(By.xpath(".//*[@id='SubmitBillShip']/span")).click();

	}

}
