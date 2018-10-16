import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class ClickTest {

public WebDriver driver = null;

@Before
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
}

@Test
public void paint() {
	
	driver.get("https://www.youidraw.com/apps/painter/");
	Actions action =new Actions(driver);
	action.moveByOffset(10, 10);
}



@After
public void tearDown() {
	driver.quit();
}



	
}
