package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	@FindBy(id=" ")
	private WebElement mm;
	
	@FindBy(id="sreg_fname_inpt")
	private WebElement fname;
	
	@FindBy(id="sreg_lname_inpt")
	private WebElement lname;
	
	@FindBy(id="sreg_title_inpt")
	private WebElement jobtitle;
	
	@FindBy(id="sreg_company_inpt")
	private WebElement company;
	
	@FindBy(id="sreg_city_inpt")
	private WebElement city;
	
	@FindBy(id="sreg_zip_inpt")
	private WebElement postalcode;
	
	@FindBy(id="sreg_country_inpt") //dropdown
	private WebElement country;
	
	@FindBy(id="sreg_state_inpt") //dropdown
	private WebElement state;
	
	@FindBy(id="sreg_lang_inpt")  //dropdown
	private WebElement language;
	
	@FindBy(id="sreg_timezone_inpt") //dropdown
	private WebElement timezone;
	
	@FindBy(name="telephoneNumber")
	private WebElement telephone;
	
	@FindBy(id="sreg_email_inpt")
	private WebElement email;
	
	@FindBy(id="sreg_cn_inpt")
	private WebElement username;
	
	@FindBy(id="sreg_pw_inpt")
	private WebElement password;
	
	@FindBy(id="sreg_pw2_inpt")
	private WebElement rpassword;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerPageFunctionality(String Fname,String Lname,String Jobtitle,String Company,String City,
			String PostalCode,String Country,String State,String Language,String Timezone,String Telephone,
			String Email,String Username,String Password,String Rpass) throws InterruptedException
	{
		fname.sendKeys(Fname);
		lname.sendKeys(Lname);
		jobtitle.sendKeys(Jobtitle);
		company.sendKeys(Company);
		city.sendKeys(City);
		postalcode.sendKeys(PostalCode);
		Thread.sleep(3000);
		Select sel1=new Select(country);
		sel1.selectByVisibleText(Country);
		Thread.sleep(3000);
		Select sel2=new Select(state);
		sel2.selectByVisibleText(State);
		Thread.sleep(3000);
		Select sel3=new Select(language);
		sel3.selectByVisibleText(Language);
		Thread.sleep(3000);
		Select sel4=new Select(timezone);
		sel4.selectByVisibleText(Timezone);
		telephone.sendKeys(Telephone);
		email.sendKeys(Email);
		username.sendKeys(Username);
		password.sendKeys(Password);
		rpassword.sendKeys(Rpass);
		
		
		
		
		
		
		
		
		
	}
	

}
