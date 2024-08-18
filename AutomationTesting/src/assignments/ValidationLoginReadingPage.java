package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtilities;

public class ValidationLoginReadingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtilities s1 = new SeleniumUtilities();
		WebDriver driver = s1.setup("chrome", "https://www.saucedemo.com/v1/");
		
		String credetialForLogin = driver.findElement(By.id("login_credentials")).getText();
		System.out.println("Credentials :" +credetialForLogin);
		String userNames[] = credetialForLogin.split("\n");
		System.out.println("credentia used is :" +userNames[1]);
		
		String credentialForPwd = driver.findElement(By.className("login_password")).getText();
		System.out.println("Credential of pwd field :" +credentialForPwd);
		String password[] = credentialForPwd.split("\n");
		System.out.println("Credential used for pwd field is :" +password[1]);
		
		driver.findElement(By.id("user-name")).sendKeys(userNames[1]);
		driver.findElement(By.id("password")).sendKeys(password[1]);
		
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
		
	}

}
