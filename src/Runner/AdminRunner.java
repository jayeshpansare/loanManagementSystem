package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import lib.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;

@CucumberOptions(
        features = {"src/features"},
        glue = {"stepDefinition"},
        tags = {"@invalid"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber",
                "json:target/cucumber-reports/cucumber.json"
        })
public class AdminRunner extends AbstractTestNGCucumberTests {
    BaseClass objBaseClass = new BaseClass();
    @Parameters({"env","browser"})
    @BeforeSuite(alwaysRun = true)
    public void openWebsite(@Optional("stagingURL") String env,@Optional("chrome") String browser) throws IOException {
        objBaseClass.initBrowser(env, browser);
    }

    @AfterSuite(alwaysRun = true)
    public void closeSite() {
        objBaseClass.tearDown();
    }
}
