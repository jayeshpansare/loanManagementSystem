package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loanPage {
    private final WebDriver driver;

    public loanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = " Loan Plans")
    WebElement loanPlanMenu;
    public void loanPlanMenuClk() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(loanPlanMenu));
        loanPlanMenu.click();
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[2]/div/label")
    WebElement planFormLabel;
    public String getPlanMonthlylabel() {
        return planFormLabel.getText();
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[2]/div[2]/label")
    WebElement interestLabel;
    public String getInterestLabel() {
        return interestLabel.getText();
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[2]/div[3]/label")
    WebElement penaltyLabel;
    public String getpenaltyLabel() {
        return penaltyLabel.getText();
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[3]/div/div/button[1]")
    WebElement loanSaveBtn;

    public String getsaveBtntxt() {
        return loanSaveBtn.getText();
    }

    public String getsaveBtncolour() {
        return loanSaveBtn.getCssValue("background-color");
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[3]/div/div/button[2]")
    WebElement cancelBtn;
    public String getCancelBtntxt() {
        return cancelBtn.getText();
    }

    public String getCancelBtncolour() {
        return cancelBtn.getCssValue("background-color");
    }
    @FindBy(xpath = "//form[@id=\"manage-plan\"]/div/div[1]")
    WebElement planFormTitle;
    public String getloanFormTitle() {
        return planFormTitle.getText();
    }
    @FindBy(xpath = "//div[@class=\"card-body\"]/div[1]/label")
    WebElement planLabel;
    public String getrowOneTitle() {
        return planLabel.getText();
    }
    @FindBy(xpath = "//div[@class=\"card-body\"]/div[2]/label")
    WebElement actionlabel;
    public String getRowTwoTitle() {
        return actionlabel.getText();
    }
    @FindBy(xpath = "//label[text()=\"Plan (months)\"]/following-sibling::input")
    WebElement monthinpt;
    public void sendMonthsInpt(String arg1) {
        monthinpt.sendKeys(arg1);
    }
    @FindBy(xpath = "//label[text()=\"Interest\"]/following-sibling::div/input")
    WebElement interestInput;
    public void sendInterestInpt(String arg2) {
        interestInput.sendKeys(arg2);
    }
    @FindBy(xpath = "//label[text()=\"Monthly Over due's Penalty\"]/following-sibling::div/input")
    WebElement penaltyInpt;
    public void sendPenaltyInpt(String arg3) {
        penaltyInpt.sendKeys(arg3);
    }
    @FindBy(xpath = "//button[text()=\" Save\"]")
    WebElement saveBtn;
    public void SaveBtnClk() {
        saveBtn.click();
    }

    public void getSuccessMsg() {
    }

    public void getLoanDataFromTable(String arg1) {
    }
}
