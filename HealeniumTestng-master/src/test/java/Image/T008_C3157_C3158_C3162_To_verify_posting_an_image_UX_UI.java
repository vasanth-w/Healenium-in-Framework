package Image;

//import static util.driver.DriverHolder.getDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import delete_post.BaseTest;
//import page.home.Home_Page;
//import page.login.Log_in;
import pagefactory.allFunctions;
import pagefactory.test;
//import util.ExtentReportListener;

public class T008_C3157_C3158_C3162_To_verify_posting_an_image_UX_UI extends BaseTest{
//	private Log_in loginPage;
//	private Home_Page homePage;
	
//    @BeforeMethod
//    public void loginBeforeMethod() {
//        loginPage = PageFactory.initElements(getDriver(), Log_in.class);
//        homePage = PageFactory.initElements(getDriver(), Home_Page.class);
//    }
    
    @Test(description = "To_verify_posting_an_image_UX_UI",retryAnalyzer = Failed.class)
    public void T008_TestRailId_C3157_C3158_C3162_To_verify_posting_an_image_UX_UI() throws Exception {
    	allFunctions af = new allFunctions(driver);
    	test t = new test(driver);
    	af.open();
        System.out.println("C3157_C3158_C3162");

		System.out.println("Step 1 : login  getterswe ");
//		ExtentReportListener.log("Step 1 : login  getterswe ");
		String username = "getterswe";
		String password = "Indium@123";
		af.login(username, password);
		System.out.println();
		
        t.click_profile();
//        af.postImage();
       
    }
}
