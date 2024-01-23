package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.BaseClass;
import org.testng.Assert;
import pages.loanPage;

public class loanStepDef extends BaseClass {
    loanPage objloanPage = new loanPage(getDriver());
    @Given("^open loan plan pages$")
    public void open_loan_plan_pages(){
        objloanPage.loanPlanMenuClk();
    }

    @When("^validate page form title as \"([^\"]*)\"$")
    public void validate_page_form_title_as(String arg1) {
        System.out.println(getDriver().getTitle());
    }

    @Then("^validate plan label as \"([^\"]*)\"$")
    public void validate_plan_label_as(String arg1) {
        System.out.println(objloanPage.getPlanMonthlylabel());
    }

    @Then("^validate interest label as \"([^\"]*)\"$")
    public void validate_interest_label_as(String arg1) {
        Assert.assertEquals(arg1, objloanPage.getInterestLabel());
    }

    @Then("^validate penalty label as \"([^\"]*)\"$")
    public void validate_penalty_label_as(String arg1){
        System.out.println(objloanPage.getpenaltyLabel());
        Assert.assertEquals(arg1, objloanPage.getpenaltyLabel());
    }

    @Then("^validate save button text as \"([^\"]*)\" and btn background colour is \"([^\"]*)\"$")
    public void validate_save_button_text_as_and_btn_background_colour_is(String arg1, String arg2){
        System.out.println(objloanPage.getsaveBtntxt());
        System.out.println(objloanPage.getsaveBtncolour());
    }

    @Then("^validate cancel button text as \"([^\"]*)\" and btn background colour as \"([^\"]*)\"$")
    public void validate_cancel_button_text_as_and_btn_background_colour_as(String arg1, String arg2){
        System.out.println(objloanPage.getCancelBtntxt());
        System.out.println(objloanPage.getCancelBtncolour());
    }

    @Given("^loan page must be available as \"([^\"]*)\"$")
    public void loan_page_must_be_available_as(String arg1){
        objloanPage.getloanFormTitle();
    }

//    @When("^loan tabel must be available$")
//    public void loan_tabel_must_be_available(){
//
//    }

    @Then("^validate table title as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_table_title_as_and(String arg1, String arg2){
        objloanPage.getrowOneTitle();
        objloanPage.getRowTwoTitle();
    }

    @Given("^plan form must be available$")
    public void plan_form_must_be_available(){

    }

    @When("^user enter month as \"([^\"]*)\" and interest as \"([^\"]*)\" and penalty as \"([^\"]*)\"$")
    public void user_enter_month_as_and_interest_as_and_penalty_as(String arg1, String arg2, String arg3){
        objloanPage.sendMonthsInpt(arg1);
        objloanPage.sendInterestInpt(arg2);
        objloanPage.sendPenaltyInpt(arg3);
    }

    @When("^click on save button$")
    public void click_on_save_button(){
        objloanPage.SaveBtnClk();
    }

    @Then("^display success message as \"([^\"]*)\"$")
    public void display_success_message_as(String arg1){
        objloanPage.getSuccessMsg();
    }

    @Given("^loan table must be available$")
    public void loan_table_must_be_available(){

    }

    @When("^validate \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" into table$")
    public void validate_and_and_into_table(String arg1, String arg2, String arg3){
        objloanPage.getLoanDataFromTable(arg1);
    }

    @Then("^click on edit button on loan table$")
    public void click_on_edit_button_on_loan_table(){

    }

    @When("^user click on delete button$")
    public void user_click_on_delete_button(){

    }

    @Then("^validate delete title message as \"([^\"]*)\" and body as \"([^\"]*)\"$")
    public void validate_delete_title_message_as_and_body_as(String arg1, String arg2){

    }

    @Then("^user click on continue button$")
    public void user_click_on_continue_button(){

    }

    @Then("^validate data is not present into table \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void validate_data_is_not_present_into_table_and_and(String arg1, String arg2, String arg3){

    }
}
