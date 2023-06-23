package by.heorhi.example.hooks;

import by.heorhi.example.context.UIContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterHook {

    @After
    public void logInfo(Scenario scenario) {
        System.out.println("Finished scenario: " + scenario.getName());
    }

    @After(value = "@browser", order = 10001)
    public void closeBrowser() {
        UIContext uiContext = UIContext.getInstance();
        uiContext.getPage().close();
        uiContext.getBrowserContext().close();
        uiContext.getPlaywright().close();
    }
}
