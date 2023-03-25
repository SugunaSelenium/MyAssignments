package week3assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		  driver.manage().window().maximize();
	      driver.get("https://www.ajio.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	      driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-Men')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//label[contains(@class,' facet-linkname-Men - Fashion Bags')]")).click();
	      Thread.sleep(3000);
	      System.out.println(driver.findElement(By.className("length")).getText());
	      List<WebElement> brand = driver.findElements(By.className("brand"));
	      Set<String> brandnames = new TreeSet<String>();
							
	      for(WebElement jia: brand)
			{
				brandnames.add(jia.getText());
			}
			
			System.out.println("No of brands: "+ brandnames.size() + " List of all brandname :" + brandnames );
			
			List<WebElement> bag = driver.findElements(By.className("nameCls"));
			
			System.out.println("List of all bagnames: ");
			
			for(WebElement jio: bag)
			{
				System.out.println(jio.getText());
			}
			
			System.out.println("No of Bagnames : " + bag.size());
		}
	}
		


