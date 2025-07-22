package flipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {
    public static void main(String[] args) throws InterruptedException {
       
    	System.setProperty("webdriver.chrome.driver", "C:/selenium webdriver/ChromeDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
 
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        
        Thread.sleep(3000);

      
        try {
            WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closeButton.click();
            System.out.println("Login popup closed.");
        } catch (Exception e) {
            System.out.println("Popup not found.");
        }

        
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("laptop");
        searchBox.submit();
        System.out.println("Search done!");

        
        Thread.sleep(5000);
        driver.quit();
    }
}
