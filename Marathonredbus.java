package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Marathonredbus {
	public static void main(String[] args) throws InterruptedException {
		EdgeOptions option = new EdgeOptions();
        option.addArguments("--disable-notifications");        
        EdgeDriver driver = new EdgeDriver(option);
		 driver.get("https://www.redbus.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
		 driver.findElement(By.xpath("//li[@class='selected']")).click();
		 driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("bangalore");
		 driver.findElement(By.xpath("//li[@class='selected']")).click();
		 driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[7]")).click();
		 driver.findElement(By.id("search_btn")).click();
		 //getting total bus
		 String avbus = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		 WebElement findElement = driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label"));
		 driver.executeScript("arguments[0].click();", findElement);
		//getting total of sleeper bus
		 String slbus =driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		//getting 2nd bus name of sleeper bus
		 System.out.println(driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText());
		 if (avbus.equalsIgnoreCase(slbus)) {
			 System.out.println("Filter is not applied");
		 }else System.out.println("Filter is applied");
		 WebElement findElement2 = driver.findElement(By.xpath("(//div[text()='View Seats'])[2]"));
		 driver.executeScript("arguments[0].click();", findElement2);
		 System.out.println("No of Seats available : " +driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])[2]")).getText());


}
}
