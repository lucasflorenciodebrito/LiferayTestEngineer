package challenge.Liferay;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC1FillForm {
	//This test case correspond to Test Case Id TC01
	
	private WebDriver driver;
	public String name = "Lucas Florêncio de Brito";
	public String reason = "Because...";
	public String sucessText = "Information sent successfully!";
	

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
	    //select a date
	    fp.chooseDate();
	    Thread.sleep(3000);
	    //click on button submit
	    fp.submit();
	    Thread.sleep(3000);
	    //get the text notification after submitting form successfully
	    String text = fp.getSucessText();
	    assertEquals(sucessText, text);
	    
	    
	    
	  }
}
