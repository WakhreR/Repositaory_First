package script;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {
	WebDriver d1;
	@Given("Open chrome browser and url of the application")
	public void open_the_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wakhre.ritukishor\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		d1=new ChromeDriver();
		d1.get("https://login.microsoftonline.com/189de737-c93a-4f5a-8b68-6f4ca9941912/wsfed?wa=wsignin1.0&wtrealm=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx&wctx=rm%3d0%26id%3dpassive%26ru%3d%252fbprhome%252fDefault.aspx&wct=2022-01-13T11%3a57%3a36Z&wreply=https%3a%2f%2fwww.myhcl.com%2fbprhome%2fDefault.aspx");

	    System.out.println("Given Done");
	}

	@When("Enter Email , password and click on login button")
	public void enter_Email_password_and_click_on_login_button() throws AWTException, IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.findElement(By.id("i0116")).sendKeys("wakhre.ritukishor@hcl.com");
		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@value='Next']")).click();
		Thread.sleep(5000);
		d1.findElement(By.name("passwd")).sendKeys("Automation@2802");
		Thread.sleep(3000);
		d1.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@value='Yes']")).click();
		Thread.sleep(5000);
		 d1.findElement(By.id("txtSearch")).sendKeys("iTime");
		 Thread.sleep(5000);
		 
		 Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_SHIFT);
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_SHIFT);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			 Thread.sleep(5000);
			
		 d1.findElement(By.xpath("//*[@id=\"WeeklyData\"]/div/div[1]/div/div/div[1]/button")).click();
		 Thread.sleep(6000);
		 d1.findElement(By.xpath("//*[@id=\"phaseActivity\"]/div[2]/div/div[1]/div[1]/div/div[2]/div/select/option[2]")).click();
		 Thread.sleep(3000);
		 d1.findElement(By.xpath("//*[@id=\"mCSB_6_container\"]/div/div[1]")).click();
		 Thread.sleep(3000);
		 d1.findElement(By.xpath("//*[@id=\"mCSB_7_container\"]/div/div/ul/li[1]/span[1]/a")).click();
		 Thread.sleep(3000);
		 d1.findElement(By.xpath("//button[.='Save And Proceed To Time Entry']")).click();
		 Thread.sleep(5000);
		 d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div/input")).sendKeys("09:00");
		 Thread.sleep(5000);
		 d1.findElement(By.xpath("(//button[@class='btn secondry-button'])[1]")).click();
		 
		 Thread.sleep(5000);
		 Robot robot1=new Robot();
			Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rect=new Rectangle(sc);
			BufferedImage Source=robot1.createScreenCapture(rect);
			File dest=new File("C:\\Users\\wakhre.ritukishor\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\screenshot1.jpg");
			ImageIO.write(Source, "jpg", dest);

		 
		 
		 
	   System.out.println("When Done");
	}

	@Then("Login successfully")
	public void login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then Done");
	}



}
