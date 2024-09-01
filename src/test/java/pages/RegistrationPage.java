package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistrationPage() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    public void enterDetails(String firstName, String lastName, String email, String password) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("email_address")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("password-confirmation")).sendKeys(password);
    }

    public void submitForm() {
        driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
    }
}
