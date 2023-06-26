package by.heorhi.example.steps;


import com.microsoft.playwright.ElementHandle;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.time.Duration;
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
        ElementHandle tableElement = taskPage.checkTableOnPage(tableName);
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        thirdPage.checkMaterialRows(tableElement, rows));
    }
}
