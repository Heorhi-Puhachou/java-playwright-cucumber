package by.heorhi.study.hooks;

import by.heorhi.study.context.UIContext;
import com.microsoft.playwright.*;
import io.cucumber.java.Before;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BeforeHook {


    private final UIContext uiContext;


    @Before(value = "@preparePlaywright")
    public void preparePlaywright() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright
                .chromium()
                .launch(new BrowserType.LaunchOptions().withHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        uiContext.setPage(page);
        if (uiContext.getBrowserContext() == null) {
            uiContext.setBrowserContext(browserContext);
        }
        if (uiContext.getPlaywright() == null) {
            uiContext.setPlaywright(playwright);
        }
    }
}
