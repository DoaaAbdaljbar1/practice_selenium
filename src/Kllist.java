import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kllist {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("http://127.0.0.1:5500/kl.html");
//		file:///C:/Users/lenovo/Desktop/kl/kl.html
		String ourTittle= driver.getTitle();
		System.out.println(ourTittle);
		List<WebElement> optionlist=driver.findElements(By.tagName("option"));
		for(int i=0; i<optionlist.size();i++) {
			System.out.println(optionlist.get(i).getText());
		
	}

}}
