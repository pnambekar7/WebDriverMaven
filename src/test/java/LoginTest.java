import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest
{

    public static WebDriver driver;
       
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chromedriver\\2.45\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void doLogin(){
        
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("yDmH0d")).sendKeys("pnambekar@gmail.com");
        
    }
    
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
