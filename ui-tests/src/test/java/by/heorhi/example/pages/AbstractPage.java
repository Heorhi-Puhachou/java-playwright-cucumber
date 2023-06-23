package by.heorhi.example.pages;

import by.heorhi.example.context.UIContext;
import com.microsoft.playwright.Page;

public class AbstractPage {

    private static final String BASE_URL = "http://localhost:3000/";

    protected void navigateFromBaseUrl(String pagePath) {
        Page page = getPage();
        String pageUrl = BASE_URL + pagePath;
        page.waitForNavigation(() -> page.navigate(pageUrl));
    }

    protected Page getPage() {
        return UIContext.getInstance().getPage();
    }
}
