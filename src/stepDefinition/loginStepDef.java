package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.loginPages;

public class loginStepDef extends BaseClass {
    loginPages objloginPages = new loginPages(getDriver());
    @Given("^open login pages as \"([^\"]*)\"$")
    public void
    openLoginPagesAs(String arg0){
        Assert.assertEquals(arg0, getDriver().getTitle());
    }

    @When("^validate the background image is present or not$")
    public void validate_the_background_image_is_present_or_not(){
        Assert.assertNotEquals("none", objloginPages.getImagecssValue());
    }

    @Then("^validate username label as \"([^\"]*)\"$")
    public void validate_username_label_as(String arg1){
        Assert.assertEquals(arg1, objloginPages.getUserNameTxt());
    }

    @Then("^validate password label as \"([^\"]*)\"$")
    public void validate_password_label_as(String arg1){
        Assert.assertEquals(arg1, objloginPages.getPasswordLabel());
    }

    @Then("^validate login text as \"([^\"]*)\" and colour as \"([^\"]*)\"$")
    public void validate_login_text_as_and_colour_as(String arg1, String arg2){
        System.out.println();
        Assert.assertEquals(objloginPages.getloginBtnTxt(), arg1);
        Assert.assertEquals(arg2, objloginPages.getLoginBtnColour());
    }
    @When("^User enter username and password using \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_username_and_password_using_and(String arg1, String arg2){
        objloginPages.sendUsername(arg1);
        objloginPages.sendPassword(arg2);
    }

    @Then("^Click on login button$")
    public void click_on_login_button(){
        objloginPages.loginBtnClk();
    }

    @Then("^display an error messages as\"([^\"]*)\"$")
    public void display_an_error_messages_as(String arg1){
        Assert.assertEquals(arg1, objloginPages.getErrorMsg());
    }
    @Then("^display dashboard$")
    public void display_dashboard(){
        objloginPages.getDashboardtxt();
    }
}
