package OnlineEventRegistrationForm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RegistrationForm {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.wpeverest.com/user-registration/online-event-registration-form/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement firstName=driver.findElement(By.id("first_name"));
        firstName.isDisplayed();
        if(firstName.isDisplayed())
        {
            firstName.sendKeys("Elias");
            System.out.println("First name is submitted sucessfully!!");
        }
        else{
            System.out.println("First name field does not show");
        }
        WebElement lastName=driver.findElement(By.id("last_name"));
        lastName.isDisplayed();
        if(lastName.isDisplayed())
        {
            lastName.sendKeys("Khan");
            System.out.println("Last name is submitted sucessfully!!");
        }
        else{
            System.out.println("Last name field does not show");
        }
        WebElement email=driver.findElement(By.id("user_email"));
        email.sendKeys("mdeliaskhan1918004@gmail.com");

        WebElement password=driver.findElement(By.name("user_pass"));
        password.sendKeys("60800545@#");

        WebElement phone=driver.findElement(By.name("phone_1665630575"));
        phone.sendKeys("+8801781678998");
        WebElement gender=driver.findElement(By.id("radio_1665631120_Male"));
        gender.click();

        WebElement description=driver.findElement(By.id("input_box_1665631521"));
        description.sendKeys("Yes..I have recomondation..");

        WebElement volunter=driver.findElement(By.id("radio_1665632432_Yes"));
        volunter.click();
        WebElement event= driver.findElement(By.id("radio_1665630781_Social Media"));
        event.click();

        WebElement description1=driver.findElement(By.id("input_box_1665632559"));
        description1.sendKeys("My Friend");

        WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
    }
}
