package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPages {
    private final WebDriver driver;

    public loginPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "login-left")
    WebElement loginImage;
    @FindBy(xpath = "//label[text()=\"Username\"]/following-sibling::input")
    WebElement loginInpt;
    public void sendUsername(String username) {
        loginInpt.clear();
        loginInpt.sendKeys(username);
    }
    @FindBy(xpath = "//label[text()=\"Password\"]/following-sibling::input")
    WebElement passwordInpt;
    public void sendPassword(String password) {
        passwordInpt.clear();
        passwordInpt.sendKeys(password);
    }
    @FindBy(xpath = "//button[text()=\"Login\"]")
    WebElement loginBtn;
    public void loginBtnClk() {
        loginBtn.click();
    }
    @FindBy(xpath = "//form[@id=\"login-form\"]/div[1]")
    WebElement getLoginErrorMsg;
    public String getErrorMsg() {
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Error message is "+e.getMessage());
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(getLoginErrorMsg));
        return getLoginErrorMsg.getText();
    }

    public void getDashboardtxt() {
    }

    public String getImagecssValue() {
        return loginImage.getCssValue("display");
    }
    @FindBy(xpath = "//form[@id=\"login-form\"]/div[1]/label")
     WebElement usernameLabel;
    public String getUserNameTxt() {
        return usernameLabel.getText();
    }
    @FindBy(xpath = "//form[@id=\"login-form\"]/div[2]/label")
    WebElement passwordLabel;
    public String getPasswordLabel() {
        return passwordLabel.getText();
    }
    @FindBy(xpath = "//form[@id=\"login-form\"]/center/button")
    WebElement getLoginBtn;
    public String getloginBtnTxt() {
        return getLoginBtn.getText();
    }

    public String getLoginBtnColour() {
        return getLoginBtn.getCssValue("background-color");
    }
}
