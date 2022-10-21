package by.heorhi.study.steps;

import by.heorhi.study.context.UIContext;
import com.microsoft.playwright.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

@AllArgsConstructor
@NoArgsConstructor
public class FirstSteps {

    @Autowired
    private UIContext uiContext;


    @Given("must be started test")
    public void init() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright
                .chromium()
                .launch(new BrowserType.LaunchOptions().withHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        //Page page = uiContext.getPage();
        String test = "1";
        test = test + "2";
        page.waitForNavigation(() -> page.navigate("http://dictionaries-union.surge.sh/tarask?dictionaries=abc"));
        page.waitForSelector("text=Ubuntu");
    }

    @When("select {string} style")
    public void selectStyle(String style) {

    }

    @And("select {string} dictionary")
    public void selectDictionary(String dictionary) {

    }

    @And("input {string} to search field")
    public void fillSearchField(String searchValue) {

    }

    @Then("{int} results available")
    public void checkResultCount(int resultCount) {
        assertTrue(true);
    }


}
