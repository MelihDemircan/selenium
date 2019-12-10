import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Turkcell {

	public static void main(String[] args) throws InterruptedException {
		
		//
		//oguzderneli@windowslive.com
		//appium

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");

		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();

		driver.get("https://www.turkcell.com.tr/cihazlar/akilli-telefonlar");
//		driver.get("https://www.turkcell.com.tr/cihazlar/akilli-telefonlar/honor-9x");

		Thread.sleep(2000); // Let the user actually see something!

		driver.findElement(By.xpath("//a[@href='/cihazlar/akilli-telefonlar/alcatel-3x']")).click();
//		driver.findElement(By.xpath("//a[@href='/cihazlar/akilli-telefonlar/htc-desire-610']")).click();

		
//		Thread.sleep(2000);

		WebElement webElement = driver.findElement(By.className("price-radio-cash"));
		webElement.click();

		Thread.sleep(2000);

		WebElement webElement2 = driver.findElement(By.className("add-to-basket-non-login"));
		webElement2.click();

		Thread.sleep(2000);

		WebElement webElement3 = driver.findElement(By.linkText("Giriş yapmadan devam et"));
		webElement3.click();

		// WebElement webElement4 = driver.findElement(By.linkText("okudum, onaylıyorum"));
		// webElement4.click();

		// Giriş yapmadan devam et
		Thread.sleep(2000);

		// driver.findElement(By.id("checkbox-2")).click();
		List<WebElement> webElement4 = driver.findElements(By.className("a-checkbox"));
		webElement4.get(1).click();

		Thread.sleep(2000);

		WebElement webElement5 = driver.findElement(By.linkText("Onayla"));
		webElement5.click();

		Thread.sleep(2000);

//		WebElement webElement6 = driver.findElement(By.linkText("Siparişe Devam Et"));
//		webElement6.click();
		WebElement webElement6 = driver.findElement(By.className("js-submit-button"));
		webElement6.click();

		

		Thread.sleep(2000);

		WebElement webElement7 = driver.findElement(By.id("fullName"));
		webElement7.sendKeys("Melih Demircan");
		
		Thread.sleep(2000);

		WebElement webElement8 = driver.findElement(By.id("gsm-1"));
		webElement8.sendKeys("5346169060");
		
		Thread.sleep(2000);

		WebElement webElement9 = driver.findElement(By.id("email"));
		webElement9.sendKeys("melih-demircan@hotmail.com");
		
		Thread.sleep(2000);

		WebElement webElement10 = driver.findElement(By.id("tckimlik"));
		webElement10.sendKeys("12345678911");
		
		
		
		
		// driver.findElements(By.linkText())
		// searchBox.get(0).click();
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.click();
		// searchBox.
		// searchBox.submit();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
