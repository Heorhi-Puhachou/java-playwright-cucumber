package by.heorhi.example.context;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class UIContext {

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
