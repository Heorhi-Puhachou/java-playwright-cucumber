package by.heorhi.example.steps;

import by.heorhi.example.context.UIContext;
import by.heorhi.example.utils.PageUtils;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CommonSteps {

    private Page getPage() {
        return UIContext.getInstance().getPage();
    }

    @And("wait loader is not shown")
    public void waitLoaderIsNotShown() {
        PageUtils.waitForElementNotThere(getPage(), "div.preloader");
    }

    @Then("text {string} is visible")
    public void checkTextVisible(String text) {
        String textElementLocator = "text=" + text;
        getPage().waitForSelector(textElementLocator);
    }
}
