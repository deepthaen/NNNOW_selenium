package webAutomation.Nnnow.Implemention;

import org.openqa.selenium.WebDriver;


import webAutomation.Nnnow.Controllers.WebControllers;
import webAutomation.Nnnow.commomUtil.PropertyUtil;

public class WebImplemention implements WebControllers{

	public WebDriver driver;
	
	public void GetUrl() {
		String url = PropertyUtil.Property("Url");
		System.out.println("Feteching URL"+ url);
		driver.get(url);	
		
	}

	public void Max() {
		driver.manage().window().maximize();
		System.out.println("Maximizing Browser");
	}

	public void Min() {
		// TODO Auto-generated method stub
		
	}

	public void quite() {
		driver.quit();
		System.out.println("quiting ");
		
	}

	public void TakeScreenShots() {
		// TODO Auto-generated method stub
		
	}

	public void Waits() {
		// TODO Auto-generated method stub
		
	}

	public void MouseHover() {
		// TODO Auto-generated method stub
		
	}
	


	
	
}
