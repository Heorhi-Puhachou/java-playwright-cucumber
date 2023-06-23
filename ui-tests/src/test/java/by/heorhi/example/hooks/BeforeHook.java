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
        if (uiContext.getPlaywright() == null) {
            uiContext.setPlaywright(Playwright.create());
        }
        if (uiContext.getBrowserContext() == null) {
            BrowserType.LaunchOptions browserOptions = new BrowserType.LaunchOptions()
                    .setArgs(Arrays.asList("--use-fake-ui-for-media-stream", "--use-fake-device-for-media-stream"))
                    .setHeadless(HEADLESS);
            Browser browser = uiContext.getPlaywright().chromium().launch(browserOptions);
            BrowserContext browserContext = browser.newContext();
            browserContext.setDefaultTimeout(TIMEOUT);
            uiContext.setBrowserContext(browserContext);
        }
        Page page = uiContext.getBrowserContext().newPage();
        uiContext.setPage(page);
    }
}
