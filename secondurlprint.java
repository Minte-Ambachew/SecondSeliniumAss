import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondurlprint {

    WebDriver driver = new ChromeDriver();
   private static String URL = "http://www.euronews.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //<editor-fold desc="Description">
        /*
        //THIS PROGRAM PRINTS OUT ALL THE SECOND LISTS IN THE PORTAL WEB
        driver.get("http://portal.aau.edu.et/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
         for (WebElement ele:links){
             System.out.println(ele.getAttribute("href"));
         }
         */
        //</editor-fold>
        secondurlprint BBCScra= new secondurlprint();
        BBCScra.getPostTitle();


    }
    private void getPostTitle(){
        driver.get(URL);
       List <WebElement>  postTitles  =  driver.findElements(By.className( "column small-6 large-3 hide-for-small-only"));
        for(WebElement eachTitle : postTitles){
            System.out.println(eachTitle.getText());
        }
    }



    private  void quitBrowser(){
        driver.quit();
    }

}
