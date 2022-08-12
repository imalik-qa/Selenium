
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E://Documents//Selenium Java Course//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        int totalCheckboxes = driver.findElements(By.cssSelector("input[type=checkbox]")).size();

        System.out.println(totalCheckboxes + " Checkboxes on this site!");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());

        //select option 1 checkbox
        driver.findElement(By.cssSelector("input[value=option1]")).click();

        //TestNG assertions
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());
        //verify option is selected


        //deselect option 2 checkbox
        driver.findElement(By.cssSelector("input[value=option1]")).click();

        //verify option is deselected
        Assert.assertFalse(driver.findElement(By.cssSelector("input[value=option1]")).isSelected());




    }
}
