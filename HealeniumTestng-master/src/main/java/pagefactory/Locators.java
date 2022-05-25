package pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.healenium.SelfHealingDriver;

public class Locators {

	public Locators(SelfHealingDriver driver){
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[2]")
    WebElement signinbtn;

	@FindBy(xpath = "//button//span[contains(text(),'Accept')]")
    public WebElement btnAcceptCookies;
	
	@FindBy(xpath = "//a[contains(text(),'Log')]")
    public  WebElement first_login_Btn;
	
	@FindBy(xpath = "//span[text()='Log in with email or username']")
	public WebElement login_with_email;
	
	@FindBy(xpath = "//input[@id='email']")
    public WebElement userName_Text_Box;
	
	@FindBy(xpath = "//input[@id='password']")
    public WebElement password_Text_Box;
	
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
    public  WebElement login_Btn;
	
//	@FindBy(xpath = "//input[@id='searchInput']")
//	public WebElement btnSearch;
	
	@FindBy(xpath = "(//button[contains(@class,'disabled')])//span[text()='Reply']")
	public WebElement reply_Post_disabled;

	@FindBy(xpath = "//button[not(contains(@class,'disabled'))]//span[text()='Reply']")
	public WebElement reply_Post_enabled;

	@FindBy(xpath = "(//button[contains(@class,'disabled')])[1]")
	public WebElement post_disabled;

	@FindBy(xpath = "//button[not(contains(@class,'disabled'))]//span[text()='Post']")
	public WebElement post_enabled;

	@FindBy(xpath = "(//button[not(contains(@class,'disabled'))]//span[text()='Post'])[2]")
	public WebElement repost_Post_enabled;
	
	@FindBy(xpath = "(//button[(contains(@class,'disabled'))]//span[text()='Post'])[2]")
	public WebElement repost_Post_disabled;
	
	@FindBy(xpath = "(//button[not(contains(@class,'disabled'))]//span[text()='Post'])[1]")
	public WebElement repost_Post_enabled_after_Click_Readit;
	
	
	@FindBy(xpath = "(//button[(contains(@class,'disabled'))]//span[text()='Post'])[1]")
	public WebElement repost_Post_disabled_after_Click_Readit;

	@FindBy(xpath = "(//a[@class='navigate-menu-item en'])[2]")
	public WebElement btnProfileAG;

	@FindBy(xpath = "//a[@href='/settings/my-account']")
	public WebElement settings_Btn_AG;

	@FindBy(xpath = "(//a[@class='navigate-menu-item en'])[1]")
	public WebElement profile_initial;

	@FindBy(xpath = "//h1[text()='getterswe']")
	public WebElement username;

	@FindBy(xpath = "//span[text()='Edit Profile']")
	public WebElement btnEditProfile;

	@FindBy(xpath = "//span[text()='Editar perfil']")
	public WebElement spanish_EditProfile;

	@FindBy(xpath = "//a[@href='/user/getterswe/followers']")
	public WebElement Follower;

	@FindBy(xpath = "//a[@href='/user/getterswe33/followers']")
	public WebElement Follower_getterswe33;

	@FindBy(xpath = "//a[@href='/user/getterswe/following']")
	public WebElement Following;

	@FindBy(xpath = "//button[@type='button']//span[text()='Followers']")
	public WebElement Follower_Tab;

	@FindBy(xpath = "(//button[@type='button']//span[text()='Following'])[1]")
	public WebElement following_Tab;

	@FindBy(xpath = "(//button[@type='button']//span[contains(text(),'Follow')])")
	public WebElement following_Username;

	@FindBy(xpath = "(//button[@type='button']//span[contains(text(),'Follow')])")
	public WebElement follower_Username;

	@FindBy(xpath = "(//div[@id ='hoverPopup'])[1]")
	public WebElement any_Following_User;

	@FindBy(xpath = "//div[@class='subItem']")
	public WebElement txtJoinedSince;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	public WebElement avatar;

	@FindBy(xpath = "(//div[@class='user'])[1]")
	public WebElement userSuggest;

	@FindBy(xpath = "(//button[@type='button']//span[text()='Follow'])[1]")
	public WebElement homepage_follow_button;

	@FindBy(xpath = "(//button[@type='button']//span[text()='Following'])[2]")
	public WebElement homepage_following_button;

	@FindBy(xpath = "(//span[text()='Following' or text()='Follow'])[1]//parent::button")
	public WebElement btnFollow;

	@FindBy(xpath = "(//span[text()='Following' or text()='Follow'])[1]//parent::button")
	public WebElement btn_Follow;

	@FindBy(xpath = "//button[@type='button']//span[text()='Following']")
	public WebElement btnUnfollow;

	@FindBy(xpath = "//button[@class='danger']")
	public WebElement btnDanger;

	@FindBy(xpath = "((//div[@class='post-box'])[1]/child::div/child::div/child::div)[1]")
	public WebElement txtPost;

	@FindBy(xpath = "//b[@class='highlight-link']")
	public WebElement link_box;

	@FindBy(xpath = "//p[text()='getterswe33']")
	public WebElement btnSuggestTest1;

	@FindBy(xpath = "(//button[@tabindex='-1'])[1]")
	public WebElement btn_post_disabled;

	@FindBy(xpath = "(//span[contains(text(),'getter')][1])[1]")
	public WebElement suggest_mentioned_User1;

	@FindBy(xpath = "(//span[contains(text(),'getter')][1])[2]")
	public WebElement suggest_mentioned_User2;

	@FindBy(xpath = "(//span[contains(text(),'getter')][1])[3]")
	public WebElement suggest_mentioned_User3;

	@FindBy(xpath = "(//span[@id='hoverPopup']//span//a[contains(text(),'#te')])[1]")
	public WebElement hashtag_In_Post;

	@FindBy(xpath = "//h1[contains(text(),'Search Results for #t')]")
	public WebElement search_Results_In_Hashtag;

	@FindBy(xpath = "//a[@href='/user/getterswe'][text()='getterswe']")
	public WebElement username_In_Post_Hashtag;

	@FindBy(xpath = "(//span[@id='hoverPopup']//span//a[contains(text(),'#te')])")
	public List<WebElement> list_Of_hashtag_In_Post;

	@FindBy(xpath = "(//div//p[@class='suggest-text'])[1]")
	public WebElement suggest_Hashtag;

	@FindBy(xpath = "(//div//p[@class='suggest-text'])[1]")
	public WebElement suggest_Hashtag1;

	@FindBy(xpath = "(//div//p[@class='suggest-text'])[2]")
	public WebElement suggest_Hashtag2;

	@FindBy(xpath = "(//div//p[@class='suggest-text'])[3]")
	public WebElement suggest_Hashtag3;

	@FindBy(xpath = "(//div[@class='dropdown ']//child::a[@class='dropdown__trigger ']//*[local-name()='svg']//*[local-name()='path'])[1]")
	public WebElement three_Dot_EllipsisIcon;

	@FindBy(xpath = "//div[@class='menu-item']")
	public WebElement three_Dot_EllipsisIcon_Full_List;

	@FindBy(xpath = "//div[@class='suggest-topics sidebar-section']//div[text()='Trending']")
	public WebElement trending_Option;

	@FindBy(xpath = "//div[text()='Popular Users']")
	public WebElement popular_Users_Option;

	@FindBy(xpath = "//div[text()='Trending']//p[text()='More']")
	public WebElement view_More_Link_For_Trending;

	@FindBy(xpath = "//div[text()='Popular Users']//p[text()='More']")
	public WebElement view_More_Link_For_PopularUsers;

	@FindBy(xpath = "//img[@alt='back']")
	public WebElement back_Icon_From_Trending;

	@FindBy(xpath = "(//div[@class='user-avatar'])[1]")
	public WebElement avatar_Icon;

	@FindBy(xpath = "//img[@alt='back']")
	public WebElement back_Icon_From_PopularUsers;

	@FindBy(xpath = "//a[text()='Terms of Service']")
	public WebElement terms_Of_Service;

	@FindBy(xpath = "(//a[@class='dropdown__trigger ']//div)[1]")
	public WebElement my_post_EllipsisIcon;

	@FindBy(xpath = "//div[@class='menu-item danger']//div[@class='wrapper']//div[text()='Delete']")
	public WebElement delete_Option;

	@FindBy(xpath = "//button[text()='Delete']")
	public WebElement delete_Button;

	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement cancel_Button;

	@FindBy(xpath = "(//button[@type='button']//span[text()='Post'])[2]")
	public WebElement reply_Post_Btn;

	@FindBy(xpath = "((//div[@class='stats-box'])[1]/child::div/child::div)[1]")
	public WebElement reply_Icon;

	@FindBy(xpath = "//div[@class='action-buttons']//span[text()='Reply']")
	public WebElement reply_Media_Button;

//	@FindBy(xpath = "//button[@type='button']//span[text()='Post Getter']")
	@FindBy(xpath = "(//button[@type='button'])[1]")
	public WebElement post_Getter_Button;

	@FindBy(xpath = "((//div[@class='post-box'])[1]/child::div/child::div/child::div)[1]")
	public WebElement post_Box;

	@FindBy(xpath = "(//span[text()='Post'])[1]")
	public WebElement post_Box_Button;

	@FindBy(xpath = "//button//span[contains(text(),'Accept')]")
	public WebElement accept_Cookies;

	@FindBy(xpath = "(//div[@class='user-menu-trigger']//*[local-name()='svg']//*[local-name()='path'])[1]")
	public WebElement logout_Ellipsis_Icon;

	@FindBy(xpath = "(//div[@class='wrapper'])[3]")
	public WebElement logout_Option;

	@FindBy(xpath = "(//p[text()='Are you sure you want to log out of Getome?']/following-sibling::div)[1]//button[text()='Log Out']")
	public WebElement logout_Button;

	@FindBy(xpath = "(//div[@class='user-info']//div)[1]")
	public WebElement username_bottom_left;

	@FindBy(xpath = "(//a[@href='/settings/my-account']//parent::div//a)[4]")
	public WebElement profile_Btn_Personal_Info;

	@FindBy(xpath = "//a[@href='/settings/my-account']")
	public WebElement settings_Btn_To_Unmute_User;

	@FindBy(xpath = "(//div[@class='navigate-menu-item en'])[2]")
	public WebElement english_Btn;

	@FindBy(xpath = "//button[@type='button']//span[text()='Muted'][1]")
	public WebElement mute_To_UnMute_Button;

	@FindBy(xpath = "//div[@class='btns-row']//child::button[@class='danger']")
	public WebElement home_Page_Mute_Button;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe33']//parent::div//parent::div//parent::div//parent::div//parent::div//child::div//button[@type='button']//span[text()='Unmute']")
	public WebElement mute_To_UnMute_Button_For_Selected_Username;

	@FindBy(xpath = "((//div[@class='post-box'])/child::div/child::div)[1]")
	public WebElement repost_Txt;

	@FindBy(xpath = "(//div[@class='stats-box'])[3]/child::div/child::div")
	public WebElement repost_Icon;

	@FindBy(xpath = "(//div[@class='stats-box'])[23]")
	public WebElement scrol_down;

	@FindBy(xpath = "(//div[@class='icon'])[2]")
	public WebElement repost;

	@FindBy(xpath = "(//div[@id='hoverPopup'])[1]")
	public WebElement users_For_PopularUsers;

	@FindBy(xpath = "//div[@class='menu-item']//div[@class='wrapper']")
	public WebElement post_Pin_To_Profile;

	@FindBy(xpath = "//div[@class='btns-row']//button[text()='Pin']")
	public WebElement post_Pin_Button;

	@FindBy(xpath = "//div[@class='btns-row']//button[text()='Cancel']")
	public WebElement post_Pin_Cancel_Button;

	@FindBy(xpath = "//div[@class='header-msg reposted-info']")
	public WebElement pinned_Post_Text;

	@FindBy(xpath = "(//div[@class='dropdown ']//child::a[@class='dropdown__trigger ']//*[local-name()='svg']//*[local-name()='path'])[3]")
	public WebElement post_Ellipsis_Icon;

	@FindBy(xpath = "(//div[@class='menu-item'])[1]")
	public WebElement post_Pin_To_Other_User_Profile;

	@FindBy(xpath = "(//span[text()='Post'])[2]")
	public WebElement post_Button;

	@FindBy(xpath = "//span[text()='Likes']")
	public WebElement likes_Tab;

	@FindBy(xpath = "(//a[@href='/settings/my-account']//parent::div//a)[4]")
	public WebElement logout_Profile_Icon;

	@FindBy(xpath = "//a[@href='/settings/my-account']")
	public WebElement logout_settings_Icon;

	@FindBy(xpath = "//p[contains(text(),'Are you sure you want to log out of GETTR?')] | //div[contains(text(),'Are you sure you want to log out of GETTR?')]")
	public WebElement logout_Popup;

	@FindBy(xpath = "//button[contains(text(),'Log out')]")
	public WebElement logout_Button_Popup;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement logout_Cancel_Option_Popup;

	@FindBy(xpath = "(//div[@class='user-menu-trigger']//div)[1]")
	public WebElement username_Left_Bottom;

	@FindBy(xpath = "//a[@href='/']")
	public WebElement homepage_Arrival;

	@FindBy(xpath = "//div//h2[contains(text(),'Welcome back to GETTR')]")
	public WebElement loginpage_Arrival;

	@FindBy(xpath = "//div[@class='content'][1]")
	public WebElement post_In_Timeline;

	@FindBy(xpath = "//span[@class='MuiButton-label']")
	public WebElement save_Changes_Btn;

	@FindBy(xpath = "//div[@aria-label='settings']//button[1]")
	public WebElement settings_Change_Password;

	@FindBy(xpath = "//p[contains(text(),'Old password required')]")
	public WebElement oldPassword_Empty_Error;

	@FindBy(xpath = "//p[contains(text(),'New password required')]")
	public WebElement newPassword_Empty_Error;

	@FindBy(xpath = "//p[contains(text(),'Confirm password required')]")
	public WebElement confirmPassword_Empty_Error;

	@FindBy(xpath = "//p[contains(text(),'Passwords do not match')]")
	public WebElement confirmPassword_Error;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")
	public WebElement change_Password;

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]")
	public WebElement privacy;

	@FindBy(xpath = "//input[@id='password-current']")
	public WebElement current_password;

	@FindBy(xpath = "//input[@id='password-new']")
	public WebElement new_password;

	@FindBy(xpath = "//input[@id='password-confirm']")
	public WebElement confirm_password;

	@FindBy(xpath = "//h1[contains(text(),'Settings')]")
	public WebElement settings_Page;

	@FindBy(xpath = "(//a[@class='dropdown__trigger ']//div)[4]")
	public WebElement my_original_post_EllipsisIcon;

	@FindBy(xpath = "//p[contains(text(),'This can')] | //div[contains(text(),'This can')]")
	public WebElement txt_deletepost_warning;

	@FindBy(xpath = "//div[@class='unavailable-post-container']/div[contains(text(),'This post')]")
	public WebElement txt_deleted_post_unavailable;

	@FindBy(xpath = "(//div[@class='menu-item-name'])[5]")
	public WebElement report_post_option_only;

	@FindBy(xpath = "//a[contains(text(),'testerqa')]")
	public WebElement Username_Original;

	@FindBy(xpath = "(//span[text()='Quote Post'])[1]")
	public WebElement quote_Post;

	@FindBy(xpath = "//div[contains(text(),'View Results')]")
	public WebElement view_Result;

	@FindBy(xpath = "//h2[contains(text(),'No results for')]")
	public WebElement no_Result;

	@FindBy(xpath = "//h1[contains(text(),'getterswe33')]")
	public WebElement getterswe33_Profile_Page;

	@FindBy(xpath = "(//div[@class='name'])[1]")
	public WebElement search_Keyword_Post_Suggesstion;

	@FindBy(xpath = "(//div[@class='jss654 text-content'])[1]")
	public WebElement first_post;

	@FindBy(xpath = "//a[@href='/helpcenter/registration']")
	public WebElement txt_help;

	@FindBy(xpath = "//span[text()='Registration']")
	public WebElement txt_registration;

	@FindBy(xpath = "//div[contains(text(),'Just Now') or contains(text(),'1s') or contains(text(),'2s') or contains(text(),'3s') or contains(text(),'4s') or contains(text(),'5s') or contains(text(),'6s') or contains(text(),'7s') or contains(text(),'8s') or contains(text(),'9s') or contains(text(),'10s')]")
	public WebElement timestamp;

	@FindBy(xpath = "//a[text()='@tedgh']")
	public WebElement unexist_User;

	@FindBy(xpath = "//p[contains(text(),'This account')] | //div[contains(text(),'This account')]")
	public WebElement txt_accountDoesntExist;

	@FindBy(xpath = "//div[@class='search-icon']")
	public WebElement search;

	@FindBy(xpath = "//h2[text()='No results for']")
	public WebElement No_results;

	@FindBy(xpath = "//span[text()='People']")
	public WebElement People;

	@FindBy(xpath = "//span[text()='Hashtags']")
	public WebElement Hashtags;

	@FindBy(xpath = "//div[text()='Clear All']")
	public WebElement search_clearAll;

	@FindBy(xpath = "(//*[local-name()='svg'])[2]")
	public WebElement back_button;

	@FindBy(xpath = "//span[text()='Top']")
	public WebElement Top;

	@FindBy(xpath = "[id='bio-field']")
	public WebElement bio_field;

	@FindBy(xpath = "//p[contains(text(),'Bio')]")
	public WebElement bio_error;

	@FindBy(xpath = "//button//span[text()='Save']")
	public WebElement save_btn_edit_profile;

	@FindBy(xpath = "//input[@id='location-field']")
	public WebElement Location;

	@FindBy(xpath = "//p[contains(text(),'Location')]")
	public WebElement location_error;

	@FindBy(xpath = "//input[@id='website-field']")
	public WebElement website;

	@FindBy(xpath = "//p[contains(text(),'URL')]")
	public WebElement website_error;

	@FindBy(xpath = "//p[text()='URL no es válida']")
	public WebElement spanish_website_error;

	@FindBy(xpath = "//span[text()='Languages']")
	public WebElement languages;

	@FindBy(xpath = "//input[@value='es']")
	public WebElement spanish;

	@FindBy(xpath = "//span[text()='Save changes']")
	public WebElement save_changes;

	@FindBy(xpath = "//input[@id='username-field']")
	public WebElement display_name;

	@FindBy(xpath = "(//span[contains(text(),'Quote Post')])[1]")
	public WebElement quote_post_btn;

	@FindBy(xpath = "//a[text()='Read it']")
	public WebElement readit;

	@FindBy(xpath = "(//div[@class='icon'])[2]//*")
	public WebElement repost_Icon_detail;

	@FindBy(xpath = "((//div[@class='post-box'])/child::div/child::div)[1]")
	public WebElement repost_Text_After_Readit;

	@FindBy(xpath = "((//div[@class='post-box'])[1]/child::div/child::div/child::div)[1]")
	public WebElement timeline_Post_Box;

	@FindBy(xpath = "(//img[@alt='img'])[1]")
	public WebElement timeline_Post;

	@FindBy(xpath = "//p[text()='one acre to cent - Google Search']")
	public WebElement timeline_Short_Link_Post;

	@FindBy(xpath = "//div[text()='www.google.com']")
	public WebElement timeline_Too_Long_Link_Post;

	@FindBy(xpath = "//span[@class='icon cancel']")
	public WebElement close_Button;

	@FindBy(xpath = "//button[text()='Discard']")
	public WebElement discard_Button;

	@FindBy(xpath = "(//span[text()='GIF'])[1]")
	public WebElement Gif;

	@FindBy(xpath = "//img[@src='https://media0.giphy.com/media/11tTNkNy1SdXGg/200_s.gif']")
	public WebElement angry_gif;

	@FindBy(xpath = "(//span[text()='Emoji'])[1]")
	public WebElement Emoji;

	@FindBy(xpath = "(//button[@class='emoji-mart-emoji'])[4]")
	public WebElement Heart_emoji;

	@FindBy(xpath = "//span[@class='icon cancel']")
	public WebElement reply_Comment_Quit_Button;

	@FindBy(xpath = "//a[text()='https://www.facebook.com/campaign/landin...']")
	public WebElement post_URL_More_than_Five_Line;

	@FindBy(xpath = "//span[text()='French - français']")
	public WebElement French;

	@FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[4]")
	public WebElement privacy_policy;

	@FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[5]")
	public WebElement Terms_of_Use;

	@FindBy(xpath = "//a[text()='getterswe22']")
	public WebElement user_display;

	@FindBy(xpath = "//a[text()='getterswe33']")
	public WebElement user_display_getterswe33;

	@FindBy(xpath = "//a[text()='getterswe44']")
	public WebElement user_display_getterswe44;

	@FindBy(xpath = "(//div[@class='menu-item'])[1]")
	public WebElement unfollow;

	@FindBy(xpath = "(//div[@class='menu-item'])[2]")
	public WebElement mute;

	@FindBy(xpath = "(//div[@class='menu-item'])[3]")
	public WebElement block;

	@FindBy(xpath = "(//div[@class='menu-item'])[4]")
	public WebElement report;

	@FindBy(xpath = "//div[@class='menu-item danger']//div[@class='wrapper']//div[text()='Delete']")
	public WebElement delete;

	@FindBy(xpath = "((//div[@role='tabpanel']//child::div)[23]//*)[1]")
	public WebElement more;

	@FindBy(xpath = "(//div[@class='post-composer undefined']/following-sibling::div/following-sibling::div/child::div/child::div/child::div[2])[1]")
	public WebElement my_post;

	@FindBy(xpath = "(//div[@class='body-content']//child::div//child::div)[28]//*")
	public WebElement likes;

	@FindBy(xpath = "//a[@target='_blank']")
	public WebElement website_link;

//	@FindBy(xpath = "(//a[@class='navigate-menu-item en'])[4]")
//	public WebElement settings_Btn;
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='getterswe'])[1]/following::*[name()='svg'][3]")
	public WebElement Ellipsis_Icon;

//	@FindBy(xpath = "(//*[local-name()='svg'])[15]")
//	public WebElement Ellipsis_Icon;

	@FindBy(xpath = "(//div[text()='fenngmingq'])[1]")
	public WebElement follower_post;

	@FindBy(xpath = "((//div[text()='fenngmingq'])[1]/following::div/following::div/following::div/*)[1]")
	public WebElement Post_Ellipsis_Icon;

	@FindBy(xpath = "//a[@href='/']")
	public WebElement Home_page;

	@FindBy(xpath = "//a[text()='Privacy Policy']")
	public WebElement privacyPolicy;

	@FindBy(xpath = "//div[@class='copy-right']/*")
	public WebElement copyrights;

	@FindBy(xpath = "(//div[@class='icon'])[1]")
	public WebElement reply;

	@FindBy(xpath = "//span[@aria-label='media']")
	public WebElement reply_Media;

	@FindBy(xpath = "//div[@class='tool']//child::span[@title='Media']")
	public WebElement reply_media_icon;

	@FindBy(xpath = "(//div[text()='getterswe'])[3]//following::div[3]/*")
	public WebElement my_post_Ellipsis_Icon;

	@FindBy(xpath = "//span[text()='Getters Indium']")
	public WebElement Fb_profile_btn;

	@FindBy(xpath = "(//span[text()='GETTR - The Marketplace of Ideas'])[1]")
	public WebElement Fb_getters_link;

	@FindBy(xpath = "((//div[text()='getterswe22'])[1]/following::div/following::div/following::div/*)[1]")
	public WebElement Getterswe22_Post_Ellipsis_Icon;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='·'])[1]/following::*[name()='svg'][1]")
	public WebElement user_Post_Ellipsis_Icon;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='·'])[1]/following::*[name()='svg'][1]")
	public WebElement after_Click_User_Post_Ellipsis_Icon;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='·'])[1]/following::*[name()='svg'][1]")
	public WebElement timeline_User_Post_Ellipsis_Icon;
	
	
	@FindBy(xpath = "((//span[text()='following'or'follow']//parent::button)[2]//parent::div//*)[1]")
	public WebElement getterswe11_Profile_Ellipsis_Icon;
	

	@FindBy(xpath = "((//span[text()='following'or'follow']//parent::button)[3]//parent::div//*)[1]")
	public WebElement user_getterswe11_Profile_Ellipsis_Icon;

	@FindBy(xpath = "((//span[text()='following'or'follow']//parent::button)[3]//parent::div//*)[3]")
	public WebElement user_getterswe11_Profile_Ellipsis_Icon1;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='getterswe11'])[1]/following::*[name()='svg'][2]")
	public WebElement user__getterswe11_Unmute_Profile_Ellipsis_Icon;

	@FindBy(xpath = "//div[text()='Block @getterswe22']")
	public WebElement block_getterswe22_from_post;

	@FindBy(xpath = "(//div[text()='getterswe33'])[1]")
	public WebElement getterswe33_username;
	
	@FindBy(xpath = "(//div[text()='getterswe11'])[1]")
	public WebElement getterswe11_username;

	@FindBy(xpath = "//a[@href='/']")
	public WebElement Home_btn;

	@FindBy(xpath = "//a[@href='/notifications']")
	public WebElement notification_Btn;

	@FindBy(xpath = "//span[text()='Mentions']")
	public WebElement mentions_Option_In_Notifications_Tab;

	@FindBy(xpath = "//span[text()='All']")
	public WebElement all_Option_In_Notifications_Tab;

	@FindBy(xpath = "(//div[contains(text(),'@getterswe33 prevention')])[1]")
	public WebElement verify_Text_In_Notification_Tab;

	@FindBy(xpath = "//a[@href='/settings/my-account']")
	public WebElement settings_Btn;

	@FindBy(xpath = "//div[@class='navigate-menu-item en']")
	public WebElement download_Btn;

	@FindBy(xpath = "(//a[@class='navigate-menu-item en'])[4]")
	public WebElement Help_Center_Btn;

	@FindBy(xpath = "(//button//span[text()='Following'])[1]")
	public WebElement Following_Tab;

	@FindBy(xpath = "(//p[@class='suggest-text'])[1]")
	public WebElement pickleball;

	@FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[1]")
	public WebElement registration;

	@FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[2]")
	public WebElement post_Repost_Reply;

	@FindBy(xpath = "(//span[@class='MuiTab-wrapper'])[3]")
	public WebElement share;

	@FindBy(xpath = "//div[contains(text(),'accueil')]")
	public WebElement Home_btn_français;

	@FindBy(xpath = "(//a[@href='/settings/my-account']//parent::div//a)[4]")
	public WebElement profile_Btn_français;

	@FindBy(xpath = "//a[@href='/notifications']")
	public WebElement notification_Btn_français;

	@FindBy(xpath = "//div[contains(text(),'Paramètres')]")
	public WebElement settings_Btn_français;

	@FindBy(xpath = "//div[contains(text(),'Assistance')]")
	public WebElement Help_Center_Btn_français;

	@FindBy(xpath = "(//div[text()='fenngmingq'])[1]")
	public WebElement fenngmingq;

	@FindBy(xpath = "//a[text()='fenngmingq']")
	public WebElement muted_user;

	@FindBy(xpath = "(//a[text()='fenngmingq']//following::div//following::div)[1]")
	public WebElement unmute_fenngmingq;

	@FindBy(xpath = "((//div[@class='media-content'])[1]/child::div)[2]/*")
	public WebElement play_button;

	@FindBy(xpath = "(//span[text()='Pause'])[1]")
	public WebElement pause_button;

	@FindBy(xpath = "(//div[text()='Suggested for you']//following::section)[1]")
	public WebElement Suggested_profile;

	@FindBy(xpath = "(//span[text()='Unmute'])[1]")
	public WebElement unmute_first_user;

	@FindBy(xpath = "(//button[@title='Unmute'])[1]")
	public WebElement unmute_button;

	@FindBy(xpath = "(//button[@title='Mute'])[1]")
	public WebElement mute_button;

	@FindBy(xpath = "(//button[@title='Playback Rate'])[1]")
	public WebElement playback_rate;

	@FindBy(xpath = "(//button[@title='Picture-in-Picture'])[1]")
	public WebElement picture_in_picture;

	@FindBy(xpath = "(//button[@class='vjs-picture-in-picture-control vjs-control vjs-button'])[1]")
	public WebElement picture_in_picture2;

	@FindBy(xpath = "//div[@aria-valuetext='0:02 of 0:05']")
	public WebElement progress_bar;

	@FindBy(xpath = "(//button[@class='vjs-fullscreen-control vjs-control vjs-button'])[1]")
	public WebElement fullscreen;

	@FindBy(xpath = "//div[@class='user-avatar']")
	public WebElement Suggested_user;

	@FindBy(xpath = "//span[text()='Unblock']")
	public WebElement Unblock_Button;

	@FindBy(xpath = "//span[text()='Blocked']")
	public WebElement Blocked_Button;

	@FindBy(xpath = "(//div[@class='dropdown '])[1]//a/following::div/p")
	public WebElement get_user;

	@FindBy(xpath = "(//div[@class='nickname-wrapper'])[1]")
	public WebElement click_user;

	@FindBy(xpath = "((//div[text()='getterswe22'])[1]/following::div/following::div/following::div/*)[1]")
	public WebElement getterswe22_EllipsisIcon;

	@FindBy(xpath = "//div[text()='Block @getterswe22']")
	public WebElement block_getterswe22;

	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	public WebElement preview_PlayandPause_Button;

	@FindBy(xpath = "//button[@class='ytp-remote-button ytp-button']")
	public WebElement preview_fullscreen_Button;

	@FindBy(xpath = "//button[@class='ytp-fullscreen-button ytp-button']")
	public WebElement preview_exit_fullscreen_Button;

	@FindBy(xpath = "//button[@class='ytp-subtitles-button ytp-button']")
	public WebElement preview_settings_Button;

	@FindBy(xpath = "//span[@class='ytp-volume-area']")
	public WebElement preview_volume_Button;

	@FindBy(xpath = "((//a[@href='https://www.youtube.com/watch?v=7fcP64w7eBE'])[1]//parent::div//parent::div//following-sibling::div//div)[1]")
	public WebElement preview_Play_Button;

	@FindBy(xpath = "((//a[@href='https://www.youtube.com/watch?v=RTfBkdn0Ov0'])[1]//parent::div//parent::div//following-sibling::div//div)[1]")
	public WebElement preview_Play_Button_For_T024_Test_case;

	@FindBy(xpath = "((//a[@href='https://www.youtube.com/watch?v=bE90HOtPevU'])[1]//parent::div//parent::div//following-sibling::div//div)[1]")
	public WebElement preview_Play_Button_For_T025_Test_case;

	@FindBy(xpath = "((//a[@href='https://www.youtube.com/watch?v=0uQwp2qn9cQ'])[1]//parent::div//parent::div//following-sibling::div//div)[1]")
	public WebElement preview_Play_Button_For_T028_Test_case;

	@FindBy(xpath = "((//a[@href='https://www.youtube.com/watch?v=T00Mc4h4C24'])[1]//parent::div//parent::div//following-sibling::div//div)[1]")
	public WebElement preview_Play_Button_For_T034_Test_case;

	@FindBy(xpath = "(//a[text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=7fcP64w7eBE'][text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_Post_URL_Method;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=4adhLPavgHw'][text()='www.youtube.com'])[1]")
	public List<WebElement> url_Link_For_T026_Test_case_not_available_Element;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=5NG7sVcB0QQ'][text()='www.youtube.com'])[1]")
	public List<WebElement> url_Link_For_T037_Test_case_not_available_Element;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=_HD0Ghdn_cY'][text()='www.youtube.com'])[1]")
	public List<WebElement> url_Link_For_T027_Test_case_not_available_Element;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=RTfBkdn0Ov0'][text()='www.youtube.com'])[1]")
	public List<WebElement> url_Link_For_T024_Test_case_not_available_Element;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=RTfBkdn0Ov0'][text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_T024_Test_case;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=bE90HOtPevU'][text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_T025_Test_case;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=0uQwp2qn9cQ'][text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_T028_Test_case;

	@FindBy(xpath = "//p[text()='one acre to cent - Google Search']//parent::div")
	public WebElement url_Link_For_T030_Test_case;

	@FindBy(xpath = "//p[text()='Tom & Jerry | Fixing That January Blue! | Classic Cartoon Compilation | WB Kids - Google Search']")
	public WebElement url_Link_For_T031_Test_case;

	@FindBy(xpath = "(//a[@href='https://www.youtube.com/watch?v=T00Mc4h4C24'][text()='www.youtube.com'])[1]")
	public WebElement url_Link_For_T034_Test_case;

	@FindBy(xpath = "(//a[text()='www.youtube.com'])[1]")
	public WebElement web_Link;

	@FindBy(xpath = "//p[text()='one acre to cent - Google Search']")
	public WebElement web_Search_Link;

	@FindBy(xpath = "(//span[@class='MuiSwitch-root']//child::span)[1]")
	public WebElement auto_play_GIF;

	@FindBy(xpath = "(//div[@class='tool']//child::span[text()='GIF'])[1]")
	public WebElement new_post_gif_Icon;

	@FindBy(xpath = "(//div[@class='tool']//child::span[text()='GIF'])[2]")
	public WebElement reply_gif;

	@FindBy(xpath = "//div[contains(text(),'You blocked')]")
	public WebElement txt_Blocked;

//	@FindBy(xpath = "(//div[@class='menu-item'])[2]")
//	public WebElement mute;
//
//	@FindBy(xpath = "//div[@class='btns-row']//button[text()='Mute']")
//	public WebElement muted_Button;
//
//	@FindBy(xpath = "//button[@id='vertical-tab-2']//span[text()='Privacy']")
//	public WebElement privacy_Option;
//
//	@FindBy(xpath = "//div[@class='btns-row']//button[text()='Cancel']")
//	public WebElement post_Pin_Cancel_Button;

	@FindBy(xpath = "//div[contains(text(),'media.gettr.com')]")
	public WebElement gif_Link;

	@FindBy(xpath = "//div[@class='tool']//child::span[text()='GIF']")
	public WebElement gif_Icon;

	@FindBy(xpath = "//span[text()='angry']")
	public WebElement gif_Angry;

	@FindBy(xpath = "//span[text()='bored']")
	public WebElement gif_bored;

	@FindBy(xpath = "//span[text()='disappointed']")
	public WebElement gif_disappointed;

	@FindBy(xpath = "//span[text()='drunk']")
	public WebElement gif_drunk;

	@FindBy(xpath = "//span[text()='happy']")
	public WebElement gif_happy;

	@FindBy(xpath = "//span[text()='inspired']")
	public WebElement gif_inspired;

	@FindBy(xpath = "//span[text()='love']")
	public WebElement gif_love;

	@FindBy(xpath = "//span[text()='relaxed']")
	public WebElement gif_relaxed;

	@FindBy(xpath = "//span[text()='shocked']")
	public WebElement gif_shocked;

	@FindBy(xpath = "//span[text()='suspicious']")
	public WebElement gif_suspicious;

	@FindBy(xpath = "((//div[@class='MuiPaper-root MuiDialog-paper MuiDialog-paperScrollBody MuiDialog-paperWidthSm MuiPaper-elevation24 MuiPaper-rounded']//child::div)[1]/child::div/following::div/child::div)[1] | ((//div[@role='dialog']//child::div)[1]/child::div/following::div/child::div)[1]")
	public WebElement gif_category;

	@FindBy(xpath = "//input[@value='angry']")
	public WebElement gif_Search_Input;

	@FindBy(xpath = "//span[text()='GIF']")
	public WebElement gif_logo;

	@FindBy(xpath = "(//div[text()='gif'])[1]")
	public WebElement post_gif_logo;

	@FindBy(xpath = "//a[@href='https://giphy.com']")
	public WebElement gif_Powered__By_Giphy;

	@FindBy(xpath = "(//div[@id='hoverPopup']/following-sibling::div)[1]")
	public WebElement any_first_post;

	@FindBy(xpath = "(//div[@id='hoverPopup']/following-sibling::div)[1]")
	public WebElement any_second_post;

	@FindBy(xpath = "//input[@placeholder='Search for GIFs']")
	public WebElement search_for_GIFs;

	@FindBy(xpath = "(//div[2]/div/img[@alt='gif'])[1]")
	public WebElement A_gif;

	@FindBy(xpath = "//div[text()='Create Post']")
	public WebElement create_Post;

	@FindBy(xpath = "(//div[contains(text(),'What')])[1]")
	public WebElement whats_New_Text;

	@FindBy(xpath = "(//div[@class='tool']//span[@title=\"Media\"])[1]")
	public WebElement media_Icon;

	@FindBy(xpath = "(//div[@class='tool']//span[@title=\"GIF\"])[1]")
	public WebElement Gif_button;

	@FindBy(xpath = "(//div[@class='tool']//span[@title=\"Emoji\"])[1]")
	public WebElement emoji_Icon;

	@FindBy(xpath = "(//div[contains(text(),'no gain')])[1]")
	public WebElement verify_Post_Text;

	@FindBy(xpath = "(//span[text()='Post'])[1]")
	public WebElement new_Post_Btn;
	
	@FindBy(xpath = "//div[text() = 'Profile']")
	public WebElement profile;

	@FindBy(xpath = "//div[@class='remove']")
	public WebElement image_Close_Button;

	@FindBy(xpath = "(//div[@class='remove'])[1]")
	public WebElement image_Close_Button1;

	@FindBy(xpath = "(//div[@class='remove'])[2]")
	public WebElement image_Close_Button2;

	@FindBy(xpath = "(//div[@class='remove'])[3]")
	public WebElement image_Close_Button3;

	@FindBy(xpath = "(//div[@class='remove'])[4]")
	public WebElement image_Close_Button4;

	@FindBy(xpath = "(//div[@class='remove'])[5]")
	public WebElement image_Close_Button5;

	@FindBy(xpath = "(//div[@class='remove'])[6]")
	public WebElement image_Close_Button6;

	@FindBy(xpath = "//div[contains(text(),'Just Now') or contains(text(),'1s') or contains(text(),'2s') or contains(text(),'3s') or contains(text(),'4s') or contains(text(),'5s') or contains(text(),'6s') or contains(text(),'7s') or contains(text(),'8s') or contains(text(),'9s') or contains(text(),'10s')]")
	public WebElement just_Now_Text_In_Post;

	@FindBy(xpath = "(//a[@href='/user/getterswe'])[2]")
	public WebElement posted_User;

	@FindBy(xpath = "(//div[contains(@class,'dropdown-')])[1]")
	public WebElement posted_Ellipsis;

	@FindBy(xpath = "(//span[contains(text(),'+')])[1]")
	public WebElement verify_Plus_Sign;

	@FindBy(xpath = "((//div[@class='stats-box'])[2]/child::div/child::div)[1]")
	public WebElement like_Icon;

	@FindBy(xpath = "(//div[@class='count'])[2]")
	public WebElement like_Count;

	@FindBy(xpath = "(//div[@class='icon'])[1]")
	public WebElement reply_Icon1;

	@FindBy(xpath = "(//div[@class='count'])[1]")
	public WebElement reply_Count;

	@FindBy(xpath = "((//div[@class='post-box'])[2]/child::div/child::div)[1]")
	public WebElement repostText;

	@FindBy(xpath = "(//div[@class='stats-box'])[3]")
	public WebElement repostIcon;

	@FindBy(xpath = "(//div[@class='count'])[3]")
	public WebElement repostCount;

	@FindBy(xpath = "(//div[@class='count active'])[1]")
	public WebElement Repost_Count;

	@FindBy(xpath = "//div[@tabindex='0']//div//div//span[text()='Undo Repost']")
	public WebElement undo_Repost_Btn;

	@FindBy(xpath = "//div[@tabindex='0']//div//div//span[text()='Undo Repost']")
	public WebElement undo_Repost_Icon;

	@FindBy(xpath = "(//div[@class='icon regular-hover'])[1]")
	public WebElement btnShare;

	@FindBy(xpath = "(//span[text()='Share on Twitter'])[1]")
	public WebElement btnShareTwitter;

	@FindBy(xpath = "(//span[text()='Share on Facebook'])[1]")
	public WebElement btnShareFacebook;

	@FindBy(xpath = "(//span[text()='Copy Link'])[1]")
	public WebElement btnCopyLink;

	@FindBy(xpath = "//span[text()='Your post was sent.']")
	public WebElement posted_Popup;

	@FindBy(xpath = "//span[text()='Your reply was sent.']")
	public WebElement reply_Posted_Popup;

	@FindBy(xpath = "//a[text()='Read it']")
	public WebElement post_Readit_Popup;

	@FindBy(xpath = "//p[text()='Your image exceeds the maximum file size (15 MB)']")
	public WebElement post_Maximum_File_Size_Exceeds_Popup;

	@FindBy(xpath = "//p[text()='Upload at most 6 images'] | //div[text()='Upload at most 6 images']")
	public WebElement post_More_Than_Six_Images_Error_Message_Popup;

	@FindBy(xpath = "(//span[contains(text(),'getter')][1])[3]")
	public WebElement userSuggestion_Mentioned_User_In_Repost;

	@FindBy(xpath = "(//span[contains(text(),'getter')][1])[1]")
	public WebElement userSuggestion_Mentioned_User;

	@FindBy(xpath = "(//p[@class='suggest-text'])[1]")
	public WebElement userSuggestion;

	@FindBy(xpath = "//button[@disabled]//span[text()='Post']")
	public WebElement post_Button_Disabled;

	@FindBy(xpath = "//span[text()='Play Video']")
	public WebElement play_Video_Button;
	@FindBy(xpath = "//span[text()='Pause']")
	public WebElement pause_Video_Button;

	@FindBy(xpath = "//span[text()='Unmute']")
	public WebElement mute_Video_Button;

	@FindBy(xpath = "//div[@aria-label='Progress Bar']")
	public WebElement video_Progress_Bar;

	@FindBy(xpath = "//span[@class='vjs-remaining-time-display']")
	public WebElement video_TimeRemaining_Indication;

	@FindBy(xpath = "//button[@title='Playback Rate']")
	public WebElement playback_Rate_Video_Button;

	@FindBy(xpath = "//span[text()='1x']")
	public WebElement playback_Rate_Video_Button_1x;

	@FindBy(xpath = "//span[text()='1.25x']")
	public WebElement playback_Rate_Video_Button_1_25x;

	@FindBy(xpath = "//span[text()='1.5x']")
	public WebElement playback_Rate_Video_Button_1_5x;

	@FindBy(xpath = "//span[text()='1.75x']")
	public WebElement playback_Rate_Video_Button_1_75x;

	@FindBy(xpath = "//span[text()='2x']")
	public WebElement playback_Rate_Video_Button_2x;

	@FindBy(xpath = "//span[text()='Audio Track']")
	public WebElement audio_Track_Btn;

	@FindBy(xpath = "//span[text()='audio_0']")
	public WebElement audio_Track_Btn_0;

	@FindBy(xpath = "//span[text()='audio_1']")
	public WebElement audio_Track_Btn_1;

	@FindBy(xpath = "//span[text()='Picture-in-Picture']")
	public WebElement pic_In_Pic_Btn;

	@FindBy(xpath = "//span[text()='Fullscreen']")
	public WebElement fullscreen_Video_Btn;

	@FindBy(xpath = "//div[text()='File is invalid or unsupported. Allowed types: png, jpg, jpeg, gif, mp4, mov'] | //p[text()='File is invalid or unsupported. Allowed types: png, jpg, jpeg, gif, mp4, mov']")
	public WebElement unsupported_Image_Format_Error_Message;

//	
//	@FindBy(xpath = "//input[@value='angry']")
//	public WebElement gif_logo;

	@FindBy(xpath = "//a[@href='https://youtu.be/-_6C_-CMqSk']")
	public WebElement post_URL_Link_Preview;

	@FindBy(xpath = "//p[contains(text(),'getterswe')]")
	public WebElement profile_Username;
	@FindBy(xpath = "//p[contains(text(),'getterswe')][1]")
	public WebElement profile_Display_Name;
	@FindBy(xpath = "//div[@class='subItem']")
	public WebElement profile_Joining_Date;
	@FindBy(xpath = "//span[contains(text(),'Following')]")
	public WebElement profile_Following;
	@FindBy(xpath = "(//span[contains(text(),'Followers')])[1]")
	public WebElement profile_Followers;
	@FindBy(xpath = "//span[contains(text(),'Edit Profile')]")
	public WebElement profile_Edit;
	@FindBy(xpath = "(//input[@class='file-input'])[1]")
	public WebElement profile_Background_image;
	@FindBy(xpath = "(//div[text()='g'])[2]")
	public WebElement profile_Avatar;
	@FindBy(xpath = "//input[@id='bio-field']")
	public WebElement profile_Bio;
	@FindBy(xpath = "//input[@id='location-field']")
	public WebElement profile_Location;
	@FindBy(xpath = "//input[@id='username-field']")
	public WebElement profile_DisplayName_Field;
	@FindBy(xpath = "//input[@value='getterswe']")
	public WebElement profile_DisplayName_In_Field;
	@FindBy(xpath = "//p[contains(text(),'Display name required')]")
	public WebElement profile_DisplayName_Empty_Error;
	@FindBy(xpath = "//p[contains(text(),'Display name must be between 1 to 50 characters')]")
	public WebElement profile_DisplayName_Error;
	@FindBy(xpath = "//p[contains(text(),\"Display name can't be longer than 50 characters\")]")
	public WebElement profile_DisplayName_Characters_Error;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement profile_save;
	@FindBy(xpath = "//p[contains(text(),\"Bio can't be longer than 160 characters\")]")
	public WebElement profile_Bio_Error;

	@FindBy(xpath = "//p[contains(text(),\"Location can't be longer than 30 characters\")]")
	public WebElement profile_Location_Error;
	@FindBy(xpath = "//input[@id='website-field']")
	public WebElement profile_Website_Field;
	@FindBy(xpath = "//p[contains(text(),\"Website can't be longer than 100 characters\")]")
	public WebElement profile_Website_Error;

	@FindBy(xpath = "(//a[@href='/user/getterswe'])[1]")
	public WebElement profile_Btn;
	
	@FindBy(xpath = "(//a[@href='/user/getterswe33'])[2]")
	public WebElement profile_Btn_getterswe33;

	@FindBy(xpath = "(//span[text()='Repost'])[2]")
	public WebElement repost_btn;

	@FindBy(xpath = "//span[text()='Post was reposted.']")
	public WebElement repost_popup;

	@FindBy(xpath = "//div[contains(text(),'Quote')]")
	public WebElement quote_Post_Text_In_Popup;

	@FindBy(xpath = "//div[text()='Reply']")
	public WebElement reply_Post_Text_In_Popup;

	@FindBy(xpath = "//div[text()='Write your reply']")
	public WebElement write_Your_Reply_Text;

	@FindBy(xpath = "//div[text()='Type your reply here']")
	public WebElement type_Your_Reply_Text;

	@FindBy(xpath = "(//div[@class='tool']//child::span//*[local-name()='svg'])[4]")
	public WebElement reply_Media_Symbol;

	@FindBy(xpath = "(//div[@class='tool']//child::span//*[local-name()='svg'])[5]")
	public WebElement reply_Emoji_Symbol;

	@FindBy(xpath = "(//div[@class='tool']//child::span//*[local-name()='svg'])[6]")
	public WebElement reply_Gif_Symbol;

	@FindBy(xpath = "(//div[@class='tool']//child::span[text()='Media'])[2]")
	public WebElement repost_media_Icon;

	@FindBy(xpath = "(//div[@class='tool']//child::span[text()='Emoji'])[2]")
	public WebElement repost_Emoji_Icon;

	@FindBy(xpath = "(//div[@class='tool']//child::span[text()='GIF'])[2]")
	public WebElement repost_Gif_Icon;

	@FindBy(xpath = "//div[@class='post-avatar']")
	public WebElement repost_Post_Avatar;

	@FindBy(xpath = "//div[@class='reply-to']")
	public WebElement reply_To_Text;

	@FindBy(xpath = "//span[@class='after']")
	public WebElement reply_Line_In_Comment;

	@FindBy(xpath = "//div[@class='post-composer comment-composer']")
	public WebElement whole_Reply_Comment_Box;

	@FindBy(xpath = "//span[@class='icon cancel']")
	public WebElement repost_Cancel_Button;

	@FindBy(xpath = "(//div[@class='text-length-limit'])[2]")
	public WebElement repost_Text_Limit;

	@FindBy(xpath = "(//div[@id='commentRepostedPost'])")
	public WebElement comment_Reposted_Post;

	@FindBy(xpath = "(//div[@id='commentRepostedPost'])")
	public WebElement comment_Replied_Post;

	@FindBy(xpath = "//div[@class='action-buttons']//span[text()='Post']")
	public WebElement repost_Text_Button;

	@FindBy(xpath = "(//div[@id='divTextArea'])[2]")
	public WebElement repost_Text;

	@FindBy(xpath = "((//div[@class='post-box'])[1]/child::div/child::div)[1]")
	public WebElement repost_Box;

	@FindBy(xpath = "(//div[@class='img_item img_1_6'])[1]/*")
	public WebElement select_1_6_image;

	@FindBy(xpath = "(//div[@class='img_item img_1_4'])[1]/*")
	public WebElement select_1_4_image;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='icon'])[1]")
	public WebElement preview_Reply_Icon;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='count'])[1]")
	public WebElement preview_Reply_Icon_Count;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='icon btn-like'])[1]")
	public WebElement preview_Like_Icon;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='count'])[2]")
	public WebElement preview_Like_Icon_Count;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='icon regular-hover'])[1]")
	public WebElement preview_Share_Icon;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='icon'])[1]")
	public WebElement preview_Repost_Icon_;

	@FindBy(xpath = "((//div[@class='content']/child::div/*)[4]//div[@class='count'])[3]")
	public WebElement preview_Repost_Icon_Count;

	@FindBy(xpath = "//span[@class='info']")
	public WebElement preview_Info_List;

	@FindBy(xpath = "//span[@class='icon cancel']")
	public WebElement preview_Close_Button;

	@FindBy(xpath = "(//div[@class='content']/child::div/*)[1]")
	public WebElement left_swiper;

	@FindBy(xpath = "(//div[@class='content']/child::div/*)[3]")
	public WebElement right_swiper;

	@FindBy(xpath = "//div[@title='Create Post']//button[@type='button']")
	public WebElement post_button;

	@FindBy(xpath = "(//div[@class='post-box comment-box']/child::div/child::div)[1]")
	public WebElement reply_Comment_Box;

	@FindBy(xpath = "//div[@class='action-buttons']//span[text()='Reply']")
	public WebElement reply_Text_Button;

	@FindBy(xpath = "//span[text()='Translate post']")
	public WebElement translate_Post_Text;

	@FindBy(xpath = "(//div[@class='icon'])[1]")
	public WebElement after_Post_Reply_Icon;

	@FindBy(xpath = "(//div[@class='icon btn-like'])[1]")
	public WebElement after_Post_Like_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[2]")
	public WebElement after_Post_Repost_Icon;

	@FindBy(xpath = "(//div[@class='icon regular-hover'])[1]")
	public WebElement after_Post_Share_Icon;

	@FindBy(xpath = "//div[@name='detail-handler']")
	public WebElement posted_Username;

	@FindBy(xpath = "(//div[@id='hoverPopup'])[2]//following-sibling::div//div")
	public WebElement posted_User_And_Posted_Time;

	@FindBy(xpath = "//div[@id='root']/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]")
	public WebElement posted_TimeandDate;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='·'])[1]/following::*[name()='svg'][1]")
	public WebElement after_Post_Ellipsis;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='·'])[1]/following::*[name()='svg'][1]")
	public WebElement comment_Ellipsis_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[1]")
	public WebElement pin_To_Your_Profile_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[2]")
	public WebElement delete_Icon;

	@FindBy(xpath = "//div[text()='Pin to your profile']")
	public WebElement pin_To_Your_Profile_Button;

	@FindBy(xpath = "//div[text()='Delete']")
	public WebElement delete_Comment_Button;

	@FindBy(xpath = "(//span[@aria-label='media'])[2]")
	public WebElement reply_Media_Icon;

	@FindBy(xpath = "(//span[@aria-label='media'])[1]")
	public WebElement reply_After_Post_Media_Icon;

	@FindBy(xpath = "(//div[text()='www.facebook.com'])[1]")
	public WebElement facebook_Post_URL_Link_Preview;

	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class='user-info']//div//div")
	public List<WebElement> search_Suggestion;

	@FindBy(xpath = "(//div[@class='icon'])[1]")
	public WebElement share_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[2]")
	public WebElement mute_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[3]")
	public WebElement block_Icon;

	@FindBy(xpath = "(//div[@class='icon'])[4]")
	public WebElement report_Icon;

	@FindBy(xpath = "//div[text()='Share @getterswe12345']")
	public WebElement share_getterswe12345;

	@FindBy(xpath = "//div[text()='Mute @getterswe12345']")
	public WebElement mute_getterswe12345;

	@FindBy(xpath = "//div[text()='Block @getterswe12345']")
	public WebElement block_getterswe12345;

	@FindBy(xpath = "//div[text()='Report @getterswe12345']")
	public WebElement report_getterswe12345;

	@FindBy(xpath = "((//div[@class='menu-item-name'])[2]//parent::div)[1]")
	public WebElement muted_In_Menu_List;

	@FindBy(xpath = "(//div[@class='menu-item-name'])[1]")
	public WebElement share_In_Menu_List;

	@FindBy(xpath = "(//div[@class='menu-item-name'])[3]")
	public WebElement blocked_In_Menu_List;

	@FindBy(xpath = "(//div[@class='menu-item-name'])[4]")
	public WebElement report_Post_List;

	@FindBy(xpath = "(//div[@class='menu-item'])[2]")
	public WebElement muted_In_Menu;

	@FindBy(xpath = "(//div[@class='menu-item'])[1]")
	public WebElement follow_In_Menu;

	@FindBy(xpath = "(//div[@class='menu-item'])[3]")
	public WebElement blocked_In_Menu;

	@FindBy(xpath = "(//div[@class='menu-item'])[4]")
	public WebElement report_Post;

	@FindBy(xpath = "//div[@class='btns-row']//button[@class='danger']")
	public WebElement blocked_Button;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe33']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_Selected_Username;

	@FindBy(xpath = "//span[text()='Follow']")
	public WebElement Follow_Btn;

	@FindBy(xpath = "//p[contains(text(),'You followed')] | //div[contains(text(),'You followed')]")
	public WebElement Follow_popup;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement UnFollow_Btn;

	@FindBy(xpath = "(//button[text()='Unfollow'])")
	public WebElement UnFollow_Button;

	@FindBy(xpath = "//span[text()='Blocked']")
	public WebElement follow_To_Blocked_Btn;

	@FindBy(xpath = "//input[@id='searchInput']")
	public WebElement search_Getter;

	@FindBy(xpath = "(//div[@class='user'])[1]")
	public WebElement selected_Username;

	@FindBy(xpath = "//div[@class='btns-row']//button[text()='Mute']")
	public WebElement muted_Button;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='g'])[1]/following::*[name()='svg'][1]")
	public WebElement three_Dot_Ellipsis_For_Username;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='getterswe12345'])[1]/following::*[name()='svg'][2]")
	public WebElement three_Dot_Ellipsis_For_getterswe12345;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='getterswe11'])[1]/following::*[name()='svg'][2]")
	public WebElement three_Dot_Ellipsis_For_getterswe11;

	@FindBy(xpath = "//p[text()='You blocked @getterswe12345.'] | //div[text()='You blocked @getterswe12345.']")
	public WebElement block_getterswe12345_Popup;

	@FindBy(xpath = "//a[text()='getterswe12345']")
	public WebElement getterswe12345_Available_In_Blocked_Tab;

	@FindBy(xpath = "//a[text()='getterswe12345']/following::button//span[text()='Blocked']")
	public WebElement unblock_getterswe12345;

	@FindBy(xpath = "//a[text()='getterswe11']/following::button//span[text()='Blocked']")
	public WebElement unblock_getterswe11;

	@FindBy(xpath = "//button//span[text()='Blocked']")
	public WebElement unblock_getterswe22;

	@FindBy(xpath = "//button//span[text()='Unblock']")
	public WebElement blocked_to_Unblock_getterswe22;

	@FindBy(xpath = "//a[@href='/settings/my-account']")
	public WebElement settings;

	@FindBy(xpath = "//span[text()='Privacy']")
	public WebElement privacy_Option;

	@FindBy(xpath = "//button[@id='tab-1']")
	public WebElement blocked_Option;

	@FindBy(xpath = "//span[text()='Blocked']")
	public WebElement blocked_To_Block_Button;

	@FindBy(xpath = "//span[text()='Block']")
	public WebElement block_To_Blocked_Button;

	@FindBy(xpath = "//div//child::button[@type='button']//span[text()='Unblock']")
	public WebElement block_To_Unblock_Button;

	@FindBy(xpath = "//div[@id='root']//h5")
	public WebElement message;

	@FindBy(xpath = "//div[@id='root']//h5[text()='You are blocked']")
	public WebElement blocked_Message;

	@FindBy(xpath = "//div[contains(text(),'see posts made by')]")
	public WebElement cant_See_Blocked_User_Post_Message;

	@FindBy(xpath = "//div[contains(text(),'is blocked')]")
	public WebElement you_Blocked_Message;

	@FindBy(xpath = "//div[text()='View Posts']")
	public WebElement view_Unblocked_User_Message;

	@FindBy(xpath = "//p[contains(text(),'You blocked')] | //div[contains(text(),'You blocked')]")
	public WebElement you_Blocked_Popup;

	@FindBy(xpath = "//p[contains(text(),'You unblocked')] | //div[contains(text(),'You unblocked')]")
	public WebElement you_Unblock_Popup;

	@FindBy(xpath = "//p[contains(text(),'You muted')] | //div[contains(text(),'You muted')]")
	public WebElement you_Muted_Popup;

	@FindBy(xpath = "//p[contains(text(),'You unmuted')] | //div[contains(text(),'You unmuted')]")
	public WebElement you_unmuted_Popup;

	@FindBy(xpath = "//a[@href='/user/getterswe11']")
	public WebElement user_getterswe11;

	@FindBy(xpath = "//a[@href='/user/getterswe22']")
	public WebElement user_getterswe22;

	@FindBy(xpath = "//a[@href='/user/getterswe33']")
	public WebElement user_getterswe33;

	@FindBy(xpath = "//a[@href='/user/getterswe44']")
	public WebElement user_getterswe44;

	@FindBy(xpath = "(//a[@href='/user/getterswe11'])[1]")
	public WebElement user_getterswe11_Post_In_Timeline;

	@FindBy(xpath = "(//div[text()='Master_Blaster'])[1]")
	public WebElement verify_Post_Before_Block;

	@FindBy(xpath = "(//div[text()='Master_Blaster'])[1]")
	public WebElement verify_Post_After_Block;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe11']//parent::div//parent::div//parent::div//parent::div//parent::div//child::div//button[@type='button']//span[text()='Muted']")
	public WebElement mute_To_UnMute_Button_For_getterswe11;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe22']//parent::div//parent::div//parent::div//parent::div//parent::div//child::div//button[@type='button']//span[text()='Muted']")
	public WebElement mute_To_UnMute_Button_For_getterswe22;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe33']//parent::div//parent::div//parent::div//parent::div//parent::div//child::div//button[@type='button']//span[text()='Muted']")
	public WebElement mute_To_UnMute_Button_For_getterswe33;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe44']//parent::div//parent::div//parent::div//parent::div//parent::div//child::div//button[@type='button']//span[text()='Muted']")
	public WebElement mute_To_UnMute_Button_For_getterswe44;

	@FindBy(xpath = "//div[text()='Mute @getterswe11']")
	public WebElement mute_getterswe11_from_post;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='getterswe11'])[1]/following::*[name()='svg'][1]")
	public WebElement muted_Icon_For_getterswe11;

	@FindBy(xpath = "//a[text()='getterswe11']")
	public WebElement user_display_getterswe11;

	@FindBy(xpath = "//div[@class='user-avatar']//a")
	public List<WebElement> blocked_user_display;

	@FindBy(xpath = "//div[@class='user-avatar']//a")
	public List<WebElement> muted_user_display;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe11']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_getterswe11_User;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe12345']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_getterswe12345_User;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe22']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_getterswe22_User;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe33']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_getterswe33_User;

	@FindBy(xpath = "//div[@id='hoverPopup']//a[text()='getterswe44']//parent::div//parent::div//parent::div//parent::div//parent::div//button[@type='button']")
	public WebElement block_To_Unblock_Button_For_getterswe44_User;

	@FindBy(xpath = "//p[contains(text(),'You unblocked')]")
	public WebElement you_Unblock_getterswe11_Popup;

	@FindBy(xpath = "(//div[@class='menu-item'])[1]")
	public WebElement muted_In_Menu_After_Block;

	@FindBy(xpath = "(//div[@class='menu-item'])[2]")
	public WebElement blocked_In_Menu_After_Block;

	@FindBy(xpath = "(//div[@class='menu-item'])[4]")
	public WebElement report_Post_After_Block;
}
