import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.sql.Driver;

public class AssignementTwo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Dev_tools/Chromedriver_win/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //navigate to practice page url
        driver.get("http://rahulshettyacademy.com/angularpractice/");


        //enter a name in the name field
        driver.findElement(By.name("name")).sendKeys("John Doe");

        //enter an email in the email field
        driver.findElement(By.name("email")).sendKeys("jdoe@email.com");

        //enter password in password field
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");

        //click the checkbox
//        driver.findElement(By.className("form-check-input")).click();

        //select female from the gender dropdown
        Select drpGender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        drpGender.selectByVisibleText("Female");

        //select the student radio button
        driver.findElement(By.id("inlineRadio1")).click();

        //enter a date in bday field
        driver.findElement(By.name("bday")).sendKeys("02291985");

        //click the submit buttom
        driver.findElement(By.className("btn-success")).click();

        //get the success message
        String successMsg = driver.findElement(By.className("alert-success")).getText();
        System.out.println(successMsg);

        //close the browser
        driver.close();
    }
}
