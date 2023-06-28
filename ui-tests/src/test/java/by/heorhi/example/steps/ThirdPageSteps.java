package by.heorhi.example.steps;

import by.heorhi.example.pages.ThirdPage;
import com.microsoft.playwright.ElementHandle;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ThirdPageSteps {

    private static final ThirdPage thirdPage = new ThirdPage();

    @Given("load third page")
    public void loadThirdPage() {
        thirdPage.openPage();
    }

    @Then("list {string} contain records")
    public void checkPackageQuantity(String listName, DataTable dataTable) {
        List<ElementHandle> listsByName = thirdPage.getListsByName(listName);
        assertEquals(1, listsByName.size());
        ElementHandle listToCheck = listsByName.get(0);
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        //Call bad method
        thirdPage.badCheckListElements(listToCheck, rows);
        //Call not so bad method
        thirdPage.checkListElements(listToCheck, rows);
    }
}
