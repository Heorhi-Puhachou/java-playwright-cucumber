package by.heorhi.example.steps;

import by.heorhi.example.context.UIContext;
import by.heorhi.example.utils.PageUtils;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;

public class CommonSteps {

    private Page getPage() {
        return UIContext.getInstance().getPage();
    }

    @And("wait loader is not shown")
    public void waitLoaderIsNotShown() {
        PageUtils.waitForElementNotThere(getPage(), "div.preloader");
    }
}
