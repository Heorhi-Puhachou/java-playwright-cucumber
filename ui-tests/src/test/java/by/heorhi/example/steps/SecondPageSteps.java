package by.heorhi.example.steps;

import by.heorhi.example.pages.SecondPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static org.junit.Assert.assertEquals;

public class SecondPageSteps {

    private static final SecondPage secondPage = new SecondPage();

    @Given("load second page")
    public void loadSecondPage() {
        secondPage.openPage();
    }

    @And("{} inputs presented on page")
    public void fillDateCharacteristicByDescription(Integer inputsCount) {
        assertEquals(secondPage.getInputsCount(), inputsCount);
    }
}
