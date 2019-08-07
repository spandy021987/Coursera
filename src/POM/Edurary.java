package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Base_Page;

public class Edurary extends Base_Page {
	public Edurary(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement button;
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement tbox1;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement tbox2;
	@FindBy(xpath="//button[.=' Submit ']")
	private WebElement button1;
	public  void  click()
	{
		button.click();
	}
	
	public void setemail(String username)
	{
	tbox1.sendKeys(username);
	}
	public void setpassword(String password)
	{
	tbox2.sendKeys(password);
	}
	public  void  click3()
	{
		button1.click();
	}
	
}
