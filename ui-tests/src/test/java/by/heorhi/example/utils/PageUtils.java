package by.heorhi.example.utils;

import com.microsoft.playwright.Page;

public class PageUtils {

    public static boolean waitForElementNotThere(Page page, String selector) {
        int i = 0;
        do {
            try {
                Thread.sleep(500);
                page.waitForSelector(selector, new Page.WaitForSelectorOptions().setTimeout(1000));
                System.out.println("Element is there: " + selector);
                i++;
            } catch (Exception e) {
                System.out.println("Element is not there: " + selector);
                return true;
            }
        } while (i < 30);

        return false;
    }
}