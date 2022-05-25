package Image;

//import static util.driver.DriverHolder.getDriver;

import org.testng.annotations.Test;

import pagefactory.allFunctions;
//import delete_post.BaseTest;
//import page.home.Home_Page;
//import page.login.Log_in;
//import util.ExtentReportListener;

public class T013_C3200_To_verify_posting_image_with_hashtag_and_mention extends BaseTest{
//	private Log_in loginPage;
//	private Home_Page homePage;
	
	

//    @BeforeMethod
//    public void loginBeforeMethod() {
//        loginPage = PageFactory.initElements(getDriver(), Log_in.class);
//        homePage = PageFactory.initElements(getDriver(), Home_Page.class);
//    }
    
    @Test(description = "To_verify_posting_image_with_hashtag_and_mention",retryAnalyzer = Failed.class)
    public void T013_TestRailId_C3200_To_verify_posting_image_with_hashtag_and_mention() throws Exception {
    	allFunctions af = new allFunctions(driver);
    	af.open();
    	System.out.println("Step 1 : login  getterswe ");
//		ExtentReportListener.log("Step 1 : login  getterswe ");
		String username = "getterswe";
		String password = "Indium@123";
		af.login(username, password);
		System.out.println("Hello");
        af.post_HashTag_Image();
        af.post_at_symbol_Image();
       
    }
}
