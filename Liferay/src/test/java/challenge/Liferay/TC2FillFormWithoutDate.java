package challenge.Liferay;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2FillFormWithoutDate {
	
	//This test case correspond to Test Case Id TC02
	private WebDriver driver;
	public String name = "Lucas Florêncio de Brito";
	public String reason = "Because...";
	public String notificationText = "This field is required.";
	

	 //initial setup
	  @Before
	  public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    
	  }
	  
	 //close browser when test finishes
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  // the test
	  @Test
	  public void CESAR() throws InterruptedException {
		
	    driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    FormPage fp = new FormPage(driver);
	    // fill the field name
	    fp.setName(name);
	    // fill the field Why did you join the testing area
	    fp.setWhy(reason);
	    Thread.sleep(4000);
	    //click on button submit
	    fp.submit();
	    Thread.sleep(5000);
	  //get the text notification saying that it is required
	    String text = fp.getNotification();
	    assertEquals(notificationText, text);
	  
	    
	    
	  }
}
