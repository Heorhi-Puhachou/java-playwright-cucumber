package by.heorhi.example.hooks;

import by.heorhi.example.context.UIContext;
import com.microsoft.playwright.*;
import io.cucumber.java.Before;

import java.util.Arrays;

public class BeforeHook {
    private static final boolean HEADLESS = false;
    private static final double TIMEOUT = 60000;

    public BeforeHook() {
    }

    @Before(value = "@browser")
    public void preparePlaywright() {
        UIContext uiContext = UIContext.getInstance();
        uiContext.setPlaywright(Playwright.create());
        BrowserType.LaunchOptions browserOptions = new BrowserType.LaunchOptions()
                .setHeadless(HEADLESS);
        Browser browser = uiContext.getPlaywright().chromium().launch(browserOptions);
        BrowserContext browserContext = browser.newContext();
        browserContext.setDefaultTimeout(TIMEOUT);
        uiContext.setBrowserContext(browserContext);
        Page page = uiContext.getBrowserContext().newPage();
        uiContext.setPage(page);
    }
}
