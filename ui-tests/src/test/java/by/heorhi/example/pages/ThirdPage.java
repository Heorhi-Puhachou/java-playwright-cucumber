package by.heorhi.example.pages;

import com.microsoft.playwright.ElementHandle;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ThirdPage extends AbstractPage {

    public void openPage() {
        this.navigateFromBaseUrl("thirdPage");
    }

    public List<ElementHandle> getListsByName(String listName) {
        return getPage().querySelectorAll("div[test-locator='list-name'] >> .. >> ul");
    }

    //Bad implementation
    public void badCheckListElements(ElementHandle listToCheck, List<Map<String, String>> rows) {
        for (Map<String, String> row : rows) {
            String position = row.get("position");
            String value = row.get("value");

            String allLiSelector = "li";
            List<ElementHandle> liElements = listToCheck.querySelectorAll(allLiSelector);
            String positionLocator = "div[test-locator='position'] >> text=" + position;
            String valueLocator = "div[test-locator='value'] >> text=" + value;
            List<ElementHandle> elementsForRow = liElements.stream().filter(liElement -> {
                boolean samePosition = liElement.querySelectorAll(positionLocator).size() == 1;
                boolean sameValue = liElement.querySelectorAll(valueLocator).size() == 1;
                return samePosition && sameValue;
            }).collect(Collectors.toList());
            assertEquals("Element with position '" + position + "' and value '" + value + "',",
                    1,
                    elementsForRow.size());
        }
    }

    //Not bad
    public void checkListElements(ElementHandle listToCheck, List<Map<String, String>> rows) {
        for (Map<String, String> row : rows) {
            String position = row.get("position");
            String value = row.get("value");

            String rowSelector = "li " +
                    ">> div[test-locator='position'] " +
                    ">> text=" + position +
                    ">> .. " +
                    ">> div[test-locator='value'] " +
                    ">> text=" + value;
            List<ElementHandle> elementsForRow = listToCheck.querySelectorAll(rowSelector);
            assertEquals("Element with position '" + position + "' and value '" + value + "',",
                    1,
                    elementsForRow.size());
        }
    }
}
