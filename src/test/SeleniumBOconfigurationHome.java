package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBOconfigurationHome {

	
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testa-thalamus-bocc.thalamuslive.com/thalamus/bo/login.jsp");
		Thread.sleep(500);
		WebElement loginOk;
		loginOk = driver.findElement(By.id("j_username"));
		loginOk.sendKeys("core@thalamuscorp.com");
		loginOk = driver.findElement(By.id("j_password"));
		loginOk.sendKeys("C12345678");
		loginOk.submit();
		Thread.sleep(900);
		WebElement configurationHome;
		
		configurationHome = driver.findElement(By.xpath("//div[@id='thalamusboapp-218829419']/div/div[2]/div[3]/div/div/div[3]/div/span/span") );		
		configurationHome.click();
		Thread.sleep(1000);		
		
		configurationHome = driver.findElement(By.xpath("//div[@id='thalamusboapp-218829419']/div/div[2]/div[4]/div/div[4]/div/fieldset/div/div/table/tbody/tr/td[3]/div/div[2]/div/div[2]/div/div/div/span/span") );
		configurationHome.click();
		Thread.sleep(1000);
		
		
		configurationHome = driver.findElement(By.xpath("//div[@id='thalamusboapp-218829419']/div/div[2]/div[5]/div/div[4]/div/div/div/span/span") );
		configurationHome.click();
		Thread.sleep(900);
		
		WebElement touchpointsFields;
		touchpointsFields = driver.findElement(By.id("gwt-uid-33"));
		touchpointsFields.sendKeys("SeleniunTouchpointName2");
		touchpointsFields = driver.findElement(By.id("gwt-uid-35"));
		touchpointsFields.sendKeys("SeleniunTouchpointCode2");
		touchpointsFields = driver.findElement(By.id("gwt-uid-37"));
		touchpointsFields.sendKeys("SeleniunTouchpointDescription");
		touchpointsFields = driver.findElement(By.id("gwt-uid-37"));
		touchpointsFields.sendKeys("SeleniunTouchpointDescription");
		touchpointsFields = driver.findElement(By.id("gwt-uid-20"));
		touchpointsFields.click();
		touchpointsFields = driver.findElement(By.id("gwt-uid-21"));
		touchpointsFields.click();
		
		
		
		touchpointsFields = driver.findElement(By.cssSelector("select.v-select-twincol-options"));
		touchpointsFields.click();
		touchpointsFields.sendKeys("A");
		touchpointsFields = driver.findElement(By.cssSelector("div.v-select-twincol-buttons > div.v-button > span.v-button-wrap"));
		touchpointsFields.click();
		touchpointsFields.click();
		touchpointsFields.click();

		touchpointsFields = driver.findElement(By.id("gwt-uid-31"));
		touchpointsFields.sendKeys("BrandFam");

		touchpointsFields = driver.findElement(By.id("gwt-uid-45"));
		touchpointsFields.sendKeys("12");
		Thread.sleep(900);
		
		touchpointsFields = driver.findElement(By.xpath("//div[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[2]/td"));
		touchpointsFields.click();
		touchpointsFields = driver.findElement(By.xpath("//div[@id='thalamusboapp-218829419']/div/div[2]/div[4]/div/div[4]/div/fieldset/div[3]/div/div[3]/div/div/div/span/span"));
		touchpointsFields.click();
		
		Thread.sleep(1000);
		//driver.quit();
		
		
		
		
	}
	
}


