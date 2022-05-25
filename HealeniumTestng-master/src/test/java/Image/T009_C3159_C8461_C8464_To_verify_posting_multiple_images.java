package Image;

//import static util.driver.DriverHolder.getDriver;

//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import delete_post.BaseTest;
//import page.home.Home_Page;
//import page.login.Log_in;
import pagefactory.allFunctions;
//import util.ExtentReportListener;

public class T009_C3159_C8461_C8464_To_verify_posting_multiple_images extends BaseTest{
	// comment these
//	private Log_in loginPage;
//	private Home_Page homePage;
	
	// comment these
//    @BeforeMethod
//    public void loginBeforeMethod() {
//        loginPage = PageFactory.initElements(getDriver(), Log_in.class);
//        homePage = PageFactory.initElements(getDriver(), Home_Page.class);
//    }
    
    @Test(description = "To_verify_posting_multiple_images",retryAnalyzer = Failed.class)
    public void T009_TestRailId_C3159_C8461_C8464_To_verify_posting_multiple_images() throws Exception {
    	//add these two lines below
    	allFunctions af = new allFunctions(driver);
        af.open();
        
        System.out.println("Step 1 : login  getterswe ");
//		ExtentReportListener.log("Step 1 : login  getterswe ");
		String username = "getterswe";
		String password = "Indium@123";
		af.login(username, password);
		System.out.println();
        af.post_multiple_images();
       
    }
}
