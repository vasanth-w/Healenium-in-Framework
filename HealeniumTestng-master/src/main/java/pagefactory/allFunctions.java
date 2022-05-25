package pagefactory;


import com.epam.healenium.SelfHealingDriver;

//import util.ExtentReportListener;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class allFunctions extends BasePage {

//Constructor for Webdriver instance
    public allFunctions(SelfHealingDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    Locators locator = new Locators(driver);
    
//    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[2]")
//    WebElement signinbtn;
//
//	@FindBy(xpath = "//button//span[contains(text(),'Accept')]")
//    public WebElement btnAcceptCookies;
//	
//	@FindBy(xpath = "//a[contains(text(),'Log')]")
//    public  WebElement first_login_Btn;
//	
//	@FindBy(xpath = "//span[text()='Log in with email or username']")
//	public WebElement login_with_email;
//	
//	@FindBy(xpath = "//input[@id='email']")
//    public WebElement userName_Text_Box;
//	
//	@FindBy(xpath = "//input[@id='password']")
//    public WebElement password_Text_Box;
//	
//	@FindBy(xpath = "//span[contains(text(),'Log In')]")
//    public  WebElement login_Btn;
//	
//	@FindBy(xpath = "//input[@id='searchInput']")
//	public WebElement btnSearch;
    

    public allFunctions open() {
        driver.get("https://web-shadow-qa4.getter-dev.tk/");
        return this;
    }

    public allFunctions signinbtn() {
    	locator.signinbtn.click();
        return this;
    }
    public void login(String username, String password) throws InterruptedException 
    {
		click(locator.btnAcceptCookies);
		click(locator.first_login_Btn);
		click(locator.login_with_email);
		sendKeys(locator.userName_Text_Box, username);
		sendKeys(locator.password_Text_Box, password);
		click(locator.login_Btn);
    }
    public void post_HashTag_Image() throws Exception {

		assertToCheckFieldAvailability(locator.post_Getter_Button, "post_Getter_Button is not available");
		clickUsingJavascriptExecutor(locator.post_Getter_Button);
//		ExtentReportListener.log("Post Getter Option Button is clicked ");
		System.out.println("Post Getter Option Button is clicked ");

		assertToCheckFieldAvailability(locator.post_Box, "post_Box is not available");
		click(this.locator.post_Box);
//		ExtentReportListener.log("PostBox is clicked ");
		System.out.println("PostBox is clicked ");

		assertToCheckFieldAvailability(locator.post_disabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn disabled is identified ");
		System.out.println("PostBtn disabled is identified");

		assertToCheckFieldAvailability(locator.post_Box, "post_Box is not available");
		sendKeys(locator.post_Box, "#t");
//		ExtentReportListener.log("hashtag Entered in the post popup window");
		System.out.println("hashtag Entered in the post popup window");

		Thread.sleep(300);
		assertToCheckFieldAvailability(locator.userSuggestion, "Post data-placeholder is not enabled");
		click(locator.userSuggestion);
//		ExtentReportListener.log("suggested username is selected in the postbox");
		System.out.println("suggested username is selected in the postbox");

		assertToCheckFieldAvailability(locator.post_enabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn enabled is identified ");
		System.out.println("PostBtn enabled is identified");
		post_image();
		Thread.sleep(300);

	}
    public void post_image() throws Exception {
		assertToCheckFieldAvailability(locator.media_Icon, "Media Icon is not available");
//		ExtentReportListener.log("Media icon is identified ");
		System.out.println("Media icon is identified ");

		assertToCheckFieldAvailability(locator.post_disabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn disabled is identified ");
		System.out.println("PostBtn disabled is identified");
		WebElement fileUploadElement = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		LocalFileDetector detect = new LocalFileDetector();
		((RemoteWebElement) fileUploadElement).setFileDetector(detect);
		fileUploadElement.sendKeys(getFiles());

		assertToCheckFieldAvailability(locator.post_enabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn enabled is identified ");
		System.out.println("PostBtn enabled is identified");

		assertToCheckFieldAvailability(locator.image_Close_Button, "image_Close_Button is not available");
//		ExtentReportListener.log("image_Close_Button is identified ");
		System.out.println("image_Close_Button is identified ");

		assertToCheckFieldAvailability(locator.new_Post_Btn, "new_Post_Button is not available");
		click(locator.new_Post_Btn);
//		ExtentReportListener.log("PostButton is clicked ");
		System.out.println("PostButton is clicked ");

		verify_After_Post();

//		ExtentReportListener.log("post Image is done ");
		System.out.println("Post Image is done ");

	}
    public void verify_After_Post() {

		
		//scrollDown(locator.any_second_post);
		assertToCheckFieldAvailability(locator.just_Now_Text_In_Post, "just_Now_Text_In_Post is not available");
//		ExtentReportListener.log("just_Now_Text_In_Post is identified ");
		System.out.println("just_Now_Text_In_Post is identified ");

		assertToCheckFieldAvailability(locator.posted_User, "posted_User is not available");
//		ExtentReportListener.log("posted_User is identified ");
		System.out.println("posted_User is identified ");

		assertToCheckFieldAvailability(locator.like_Icon, "like_Icon is not available");
//		ExtentReportListener.log("like_Icon is identified ");
		System.out.println("like_Icon is identified ");

		assertToCheckFieldAvailability(locator.like_Count, "like_Count is not available");
//		ExtentReportListener.log("like_Count is identified ");
		System.out.println("like_Count is identified ");

		assertToCheckFieldAvailability(locator.reply_Icon1, "reply_Icon is not available");
//		ExtentReportListener.log("reply_Icon is identified ");
		System.out.println("reply_Icon is identified ");

		assertToCheckFieldAvailability(locator.reply_Count, "reply_Count is not available");
//		ExtentReportListener.log("reply_Count is identified ");
		System.out.println("reply_Count is identified ");

		assertToCheckFieldAvailability(locator.repostIcon, "repost_Icon is not available");
//		ExtentReportListener.log("repost_Icon is identified ");
		System.out.println("repost_Icon is identified ");

		assertToCheckFieldAvailability(locator.repostCount, "repostCount is not available");
//		ExtentReportListener.log("repost Count is identified ");
		System.out.println("repost Count is identified ");

		assertToCheckFieldAvailability(locator.btnShare, "btnShare is not available");
//		ExtentReportListener.log("btnShare is identified ");
		System.out.println("btnShare is identified ");

	}
    public void post_at_symbol_Image() throws Exception {

		assertToCheckFieldAvailability(locator.post_Getter_Button, "post_Getter_Button is not available");
		clickUsingJavascriptExecutor(locator.post_Getter_Button);
//		ExtentReportListener.log("Post Getter Option Button is clicked ");
		System.out.println("Post Getter Option Button is clicked ");

		assertToCheckFieldAvailability(locator.post_Box, "post_Box is not available");
		click(locator.post_Box);
//		ExtentReportListener.log("PostBox is clicked ");
		System.out.println("PostBox is clicked ");

		assertToCheckFieldAvailability(locator.post_disabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn disabled is identified ");
		System.out.println("PostBtn disabled is identified");

		assertToCheckFieldAvailability(locator.post_Box, "post_Box is not available");
		sendKeys(locator.post_Box, "@getterswe");
//		ExtentReportListener.log("At symbol Entered in the post popup window");
		System.out.println("At symbol Entered in the post popup window");

		Thread.sleep(300);
		assertToCheckFieldAvailability(locator.userSuggestion_Mentioned_User, "Post data-placeholder is not enabled");
		click(locator.userSuggestion_Mentioned_User);
//		ExtentReportListener.log("suggested username is selected in the postbox");
		System.out.println("suggested username is selected in the postbox");

		assertToCheckFieldAvailability(locator.post_enabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn enabled is identified ");
		System.out.println("PostBtn enabled is identified");

		post_image();

	}
    String getFiles() {
		return new File("./UploadFiles/pic.jpg").getAbsolutePath();
	}
    public void postImage() throws Exception {
		assertToCheckFieldAvailability(locator.post_Getter_Button, "Post getter button is not enabled");
		click(locator.post_Getter_Button);
//		ExtentReportListener.log("Post Getter button is clicked ");
		System.out.println("Post Getter button is clicked ");

		assertToCheckFieldAvailability(locator.txtPost, "Post data-placeholder is not enabled");
		click(locator.txtPost);
//		ExtentReportListener.log("Text box is clicked ");

		assertToCheckFieldAvailability(locator.post_disabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn disabled is identified ");
		System.out.println("PostBtn disabled is identified");

		assertToCheckFieldAvailability(locator.media_Icon, "Media Icon is not available");
//		ExtentReportListener.log("Media icon is identified ");
		System.out.println("Media icon is identified ");

		WebElement fileUploadElement = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		LocalFileDetector detect = new LocalFileDetector();
		((RemoteWebElement) fileUploadElement).setFileDetector(detect);
		fileUploadElement.sendKeys(Get_File());

		assertToCheckFieldAvailability(locator.post_enabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn enabled is identified ");
		System.out.println("PostBtn enabled is identified");

		assertToCheckFieldAvailability(locator.image_Close_Button, "image_Close_Button is not available");
//		ExtentReportListener.log("image_Close_Button is identified ");
		System.out.println("image_Close_Button is identified ");

		assertToCheckFieldAvailability(locator.new_Post_Btn, "new_Post_Button is not available");
		click(locator.new_Post_Btn);
		Thread.sleep(500);
//		ExtentReportListener.log("PostButton is clicked ");
		System.out.println("PostButton is clicked ");

//		assertToCheckFieldAvailability(locator.posted_Popup, "posted popup is not enabled");
//		ExtentReportListener.log("posted popup is verified ");
//		System.out.println("posted popup is verified ");

		assertToCheckFieldAvailability(locator.post_Readit_Popup, "posted popup is not enabled");
//		ExtentReportListener.log("post readit popup is verified ");
		System.out.println("post readit popup is verified ");
		verify_After_Post();

//		ExtentReportListener.log("post Image is done ");
		System.out.println("Post Image is done ");

	}
    public void post_multiple_images() throws InterruptedException {
		assertToCheckFieldAvailability(locator.post_Getter_Button, "Post getter button is not enabled");
		click(locator.post_Getter_Button);
//		ExtentReportListener.log("Post Getter button is clicked ");
		System.out.println("Post Getter button is clicked ");

		assertToCheckFieldAvailability(locator.txtPost, "Post data-placeholder is not enabled");
		click(locator.txtPost);
//		ExtentReportListener.log("Text box is clicked ");

		assertToCheckFieldAvailability(locator.post_disabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn disabled is identified ");
		System.out.println("PostBtn disabled is identified");

		assertToCheckFieldAvailability(locator.media_Icon, "Media Icon is not available");
//		ExtentReportListener.log("Media icon is identified ");
		System.out.println("Media icon is identified ");
		Thread.sleep(500);
		WebElement fileUploadElement = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		LocalFileDetector detect = new LocalFileDetector();
		((RemoteWebElement) fileUploadElement).setFileDetector(detect);
		fileUploadElement.sendKeys(getimageFile());
		fileUploadElement.sendKeys(getimage2File());

		assertToCheckFieldAvailability(locator.post_enabled, "PostBtn enabled is identified");
//		ExtentReportListener.log("PostBtn enabled is identified ");
		System.out.println("PostBtn enabled is identified");

		assertToCheckFieldAvailability(locator.image_Close_Button, "image_Close_Button is not available");
//		ExtentReportListener.log("image_Close_Button is identified ");
		System.out.println("image_Close_Button is identified ");

		assertToCheckFieldAvailability(locator.new_Post_Btn, "new_Post_Button is not available");
		click(locator.new_Post_Btn);
//		ExtentReportListener.log("PostButton is clicked ");
		System.out.println("PostButton is clicked ");
		verify_After_Post();
//		ExtentReportListener.log("post Image is done ");
		System.out.println("Post Image is done ");
	}
    String getimageFile() {
		return new File(
				"./UploadFiles/Image3-Disney Wall-E, Disney Wall-E digital wallpaper, Pixar Animation Studios-Disney Wall-E and Eve, Disney Pixar, WALL·E, Eva, Moon, robot-Wall-E and Eva movie still pho.jpg")
						.getAbsolutePath();

	}
	String getimage2File() {
		return new File("./UploadFiles/Image2.jpeg").getAbsolutePath();

	}
	String Get_File() {
		return new File("./UploadFiles/pic.jpg").getAbsolutePath();

	}
	public void click_profile() throws InterruptedException {
//		click(locator.profile);
//		assertToCheckFieldAvailability(locator.post_Getter_Button, "Post getter button is not enabled");
//		click(locator.post_Getter_Button);
		locator.post_Getter_Button.click();
//		ExtentReportListener.log("Post Getter button is clicked ");
		System.out.println("Post Getter button is clicked ");
	}

}
