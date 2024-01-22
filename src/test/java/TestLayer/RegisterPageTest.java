package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
	
	@BeforeTest
	public void setUp()
	{
		BaseClass.initiliazation();
	}
	
	@Test
	public void registerPageTest() throws InterruptedException
	{
		RegisterPage page=new RegisterPage();
		page.registerPageFunctionality("monika", "adsul", "QA Engineer", "xyz.ltd", "barshi", "412412", "India", "Maharashtra (India)", "English (India)", "(GMT+5:30)  India ", "02184240375", "monika@123", "monika@123", "monika@123","monika@123");
	}

}
