package by.heorhi.example.context;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class UIContext {

    private static UIContext instance;

    private UIContext() {
    }

    public static UIContext getInstance() {
        if (instance == null) {
            instance = new UIContext();
        }
        return instance;
    }

    private Playwright playwright;
    private Page page;
    private BrowserContext browserContext;

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return page;
    }

    public void setBrowserContext(BrowserContext browserContext) {
        this.browserContext = browserContext;
    }

    public BrowserContext getBrowserContext() {
        return browserContext;
    }

    public void setPlaywright(Playwright playwright) {
        this.playwright = playwright;
    }

    public Playwright getPlaywright() {
        return playwright;
    }
}
