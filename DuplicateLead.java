package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AKKAD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishnan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("New to Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramkrish.cbm@gmail.com");
		WebElement elementDropDown=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd=new Select(elementDropDown);
		dd.selectByVisibleText("India");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("page Title"+driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AKKAD");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rama");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("page Title"+driver.getTitle());

	}

}
