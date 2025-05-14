package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile_Page {
    public WebDriver driver;
    private final By Profile_Icon = By.cssSelector("div[class='Header_subItemImage__s4Tuh group relative flex h-md-32 cursor-pointer items-center lg:h-lg-32 xl:h-8 2xl:h-2xl-32'] img[alt='arrow-down-icon']");
    private final By Profile_Management_Button = By.cssSelector("div[class='Header_subItemImage__s4Tuh flex items-center hover:bg-darkBg hover:text-shahidGreen h-md-40 px-md-12 lg:h-lg-40 lg:px-lg-12 xl:h-10 xl:px-3 2xl:h-2xl-40 2xl:px-2xl-12']");
    private final By Create_Profile_Title = By.cssSelector("img[alt='Add Profile']");
    private final By Choose_Profile_Icon = By.cssSelector("img[title='elngdyy']");
    private final By Name_Field = By.cssSelector("#profileName");
    private final By Create_Profile_Button = By.cssSelector("span[class='block leading-[20px]']");
    private final By Edit_Profile = By.cssSelector("img[title='elngdy']");
    private final By Delete_Button = By.cssSelector("img[alt='Delete Profile']");
    private final By Confirm_Delete_Button = By.cssSelector("span[class='block px-[20px] py-[9px] md:px-md-20 md:py-md-9 lg:px-lg-20 lg:py-lg-9 xl:px-[20px] xl:py-[9px] 2xl:px-2xl-20 2xl:py-2xl-9 leading-[25px] py-[9px] px-[20px] md:py-[9px] lg:lg:py-lg-9 lg:px-lg-20 xl:py-[9px] xl:px-[20px] 2xl:py-2xl-9 2xl:px-2xl-20 font-bold']");
    private final By Save_Button = By.cssSelector("span[class='block leading-[1.25] text-[16px] md:text-md-16 lg:text-lg-16 xl:text-xl-16 2xl:text-2xl-16']");


    public Profile_Page(WebDriver driver) {
        this.driver = driver;
    }

    public Profile_Page Press_Profile_Icon() {
        Utility.Click_On_Element(driver, Profile_Icon);
        return this;
    }

    public Profile_Page Press_Choose_Profile_Icon() {

        Utility.Click_On_Element(driver, Choose_Profile_Icon);
        return this;
    }

    public Profile_Page Press_Profile_Management_Button() {
        Utility.Click_On_Element(driver, Profile_Management_Button);
        return this;
    }

    public Profile_Page Press_Create_Profile_Title() {
        Utility.Click_On_Element(driver, Create_Profile_Title);
        return this;
    }

    public Profile_Page Enter_Name() {
        Utility.Send_Data(driver, Name_Field, "elngdy");
        return this;
    }
    public Profile_Page Enter_Name_In_Edit() {
        Utility.Click_On_Element(driver,Name_Field);
        driver.findElement(Name_Field).clear();
        Utility.Send_Data(driver, Name_Field, "elngdy");
        return this;
    }

    public Profile_Page Press_Create_Profile_Button() {
        Utility.Click_On_Element(driver, Create_Profile_Button);
        return this;
    }

    public Profile_Page Press_Edit_Icon() {
        Utility.Click_On_Element(driver, Edit_Profile);
        return this;
    }

    public Profile_Page Press_Delete_Button() {
        Utility.Click_On_Element(driver, Delete_Button);
        return this;
    }

    public Profile_Page Press_Confirm_Delete_Button() {
        Utility.Click_On_Element(driver, Confirm_Delete_Button);
        return this;
    }

    public Profile_Page Press_Save_Button() {
        Utility.Click_On_Element(driver, Save_Button);
        return this;

    }
}
