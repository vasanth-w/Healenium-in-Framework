package pagefactory;

import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;

public class test extends BasePage{

	public test(SelfHealingDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	Locators locator = new Locators(driver);
	
	public void click_profile() throws InterruptedException {
//		click(locator.profile);
//		assertToCheckFieldAvailability(locator.post_Getter_Button, "Post getter button is not enabled");
//		click(locator.post_Getter_Button);
		locator.post_Getter_Button.click();
//		ExtentReportListener.log("Post Getter button is clicked ");
		System.out.println("Post Getter button is clicked ");
	}
}
