package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		 // 2. Enter UserName and Password Using Id Locator
		  
		  WebElement elseUserName = driver.findElement(By.id("username"));
			elseUserName.sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  
		  //3. Click on Login Button using Class Locator
			
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Duraikannu");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suganya");
			driver.findElement(By.name("departmentName")).sendKeys("Testing");
			driver.findElement(By.name("description")).sendKeys("Testing practise");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suganyadurai2391@gmail.com");			
			driver.findElement(By.name("submitButton")).click();
			
			//Get the Title of Resulting Page(refer the video)  using driver.getTitle()
			System.out.println("The title is "+ driver.getTitle());	
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sushi");
			driver.findElement(By.name("submitButton")).click();
			System.out.println("The result page  title is "+ driver.getTitle());	
			
			
// driver.close();


	}

}
