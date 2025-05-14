import Pages.Profile_Page;
import Pages.Registration_Page;
import Pages.Sign_In_Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Profile_Test extends Initiate_Shahid{

    @Test
    public void Add_Profile() throws InterruptedException {
        new Sign_In_Page(driver).Press_On_sign().Enter_Valid_Email().Enter_Password().Press_On_Sign_In_button();
        new Profile_Page(driver).Press_Choose_Profile_Icon().Press_Profile_Icon().Press_Profile_Management_Button().Press_Create_Profile_Title().Enter_Name();
        new Registration_Page(driver).Press_On_Ok_Button();
        new Profile_Page(driver).Press_Create_Profile_Button();

       Thread.sleep(2000);
        Assert.assertEquals(

                driver.findElements(By.cssSelector("div[class='toast-notification'] span")).isEmpty(),
                false,
                "No EditText elements found");
    }

    @Test
    public void Edit_Profile() throws InterruptedException {
        new Sign_In_Page(driver).Press_On_sign().Enter_Valid_Email().Enter_Password().Press_On_Sign_In_button();
        new Profile_Page(driver).Press_Choose_Profile_Icon().Press_Profile_Icon().Press_Profile_Management_Button().Press_Edit_Icon();
        new Registration_Page(driver).Press_On_Ok_Button();
        new Profile_Page(driver).Press_Delete_Button().Press_Confirm_Delete_Button();


        Thread.sleep(2000);
        Assert.assertEquals(

                driver.findElements(By.cssSelector("div[class='toast-notification'] span")).isEmpty(),
                false,
                "No EditText elements found");
    }
    @Test
    public void Delete_Profile() throws InterruptedException {
        new Sign_In_Page(driver).Press_On_sign().Enter_Valid_Email().Enter_Password().Press_On_Sign_In_button();
        new Profile_Page(driver).Press_Choose_Profile_Icon().Press_Profile_Icon().Press_Profile_Management_Button().Press_Edit_Icon();
        new Registration_Page(driver).Press_On_Ok_Button();
        new Profile_Page(driver).Press_Delete_Button().Press_Confirm_Delete_Button();


        Thread.sleep(2000);
        Assert.assertEquals(

                driver.findElements(By.cssSelector("div[class='toast-notification'] span")).isEmpty(),
                false,
                "No EditText elements found");
    }



}


