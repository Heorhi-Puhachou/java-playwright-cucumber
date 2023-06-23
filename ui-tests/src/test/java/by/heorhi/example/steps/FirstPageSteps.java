package by.heorhi.example.steps;

import by.heorhi.example.pages.FirstPage;
import io.cucumber.java.en.Given;

public class FirstPageSteps {

    private static final FirstPage firstPage = new FirstPage();

    @Given("load first page")
    public void loadFirstPage() {
        firstPage.openPage();
        String test2 = "just for debug";
    }

}
