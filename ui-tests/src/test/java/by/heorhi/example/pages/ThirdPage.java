package by.heorhi.example.pages;

import com.microsoft.playwright.ElementHandle;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ThirdPage extends AbstractPage {

    public void openPage() {
        this.navigateFromBaseUrl("thirdPage");
    }

    public List<ElementHandle> getListsByName(String listName) {
        return getPage().querySelectorAll("div[test-locator='list-name'] >> .. >> ul");
    }

    public void checkListElements(ElementHandle listToCheck, List<Map<String, String>> rows) {
        listToCheck.querySelectorAll("li").size();
        for (Map<String, String> row : rows) {
            String position = row.get("position");
            String value = row.get("value");
            List<ElementHandle> elementsForRow = listToCheck.querySelectorAll("li >> div[test-locator='position'] >> text=" + position + ">> .. >>div[test-locator='value'] >> text=" + value);
            assertEquals(1, elementsForRow.size());
        }
    }
}
