package by.heorhi.example.pages;

public class SecondPage extends AbstractPage {

    public void openPage() {
        this.navigateFromBaseUrl("secondPage");
    }

    public Integer getInputsCount() {
        return getPage().querySelectorAll("input").size();
    }
}
